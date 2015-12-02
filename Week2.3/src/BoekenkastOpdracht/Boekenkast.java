package BoekenkastOpdracht;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Joep on 23-Nov-15.
 */
public class Boekenkast {
    private int maxCapacity;
    private int currCapacity;


    private List<Boek> bookList;

    public Boekenkast(int cap) {
        this.maxCapacity = cap;

        this.bookList = new ArrayList<Boek>();
    }

    public void addBoek(Boek boek) {
        if (currCapacity < maxCapacity) {
            currCapacity++;
            bookList.add(boek);

        } else {
            System.out.println("Unable to add book:");
            System.out.println("This bookcase has reached max capacity.");
        }
    }

    /**
     * removes book when supplied with same BoekenkastOpdracht.Boek
     *
     * @param boek
     */
    public void removeBoek(Boek boek) {

        //wanted to try out iterative .forEach() method since intellij suggested it to be more efficient
        bookList.forEach(boek1 -> {
            if (boek1.equals(boek)) {
                bookList.remove(boek);
            }
        });
    }

    public Boek getBookFromIndex(int index) {
        return bookList.get(index);
    }

    /**
     * @param title
     * @return returns null if book not present
     */
    public Boek getBookFromTitle(String title) {

        for (Boek b : bookList) {
            if (b.getTitel().equals(title)) {
                return b;
            }
        }
        return null;
    }

    public void removeBookFromIndex(int index) {
        bookList.remove(index);
    }

    public void removeBookFromTitle(String title) {
        for (Boek b : bookList) {
            if (b.getTitel().equals(title)) {
                bookList.remove(b);
            }
        }
    }


    public List getBookList() {
        return bookList;
    }


    public int getCurrCapacity() {
        return currCapacity;
    }

    public int totalPagesInBookcase() {
        int i = 0;
        for (Boek x : bookList) {
            i += x.getAantalPaginas();
        }
        return i;
    }

    public void checkForDoubleByBoek(Boek e) {
        List<Boek> doubleList = new ArrayList<Boek>();

        for (Boek x : bookList) {
            //checks if BoekenkastOpdracht.Boek already exists in doubleList
            if (x.equals(e)) {
                for (Boek z : doubleList) {
                    if (!(e.equals(z))) {
                        doubleList.add(e);
                    }
                }
            }
        }

        if (!(doubleList.isEmpty())) {
            System.out.println("There are more than one copies of ");
            for (Boek c : doubleList) {
                if (!(c.getTitel().isEmpty() && !(c.getTitel().equals("")))) {
                    System.out.print(c.getTitel());
                } else {
                    System.out.println("ISBN number: " + c.getISBN_NUMBER());
                }
            }
        }
    }

    public void checkForDoubleByName(String s) {
        List<Boek> doubleList = new ArrayList<Boek>();
        for (Boek x : bookList) {

            if (x.getTitel().equals(s)) {

                for (Boek z : doubleList) {

                    if (!(z.equals(x))) {
                        doubleList.add(x);
                    }
                }
            }
        }

        if (!(doubleList.isEmpty())) {
            System.out.println("There are more than one copies of ");
            for (Boek c : doubleList) {
                if (!(c.getTitel().isEmpty() && !(c.getTitel().equals("")))) {
                    System.out.print(c.getTitel());
                } else {
                    System.out.println("ISBN number: " + c.getISBN_NUMBER());
                }
            }
        }
    }

    public void checkForDouble() {
        List<Boek> duplicates = new ArrayList<Boek>();
        List<Boek> tempList = new ArrayList<Boek>();

        bookList.forEach(boek -> {
            if (!tempList.isEmpty()) {


                for (Boek b : tempList) {
                    if (b.equals(boek)) {
                        duplicates.add(boek);
                    } else {
                        tempList.add(boek);
                    }


                }
            } else {
                tempList.add(boek);
            }
        });
    }


    public void getBooksByAuthor(String author) {
        for (Boek b : bookList) {
            if (b.getAuthor().getName().equals(author)) {
                if (b.getTitel().equals(null) || b.getTitel().equals("")) {
                    System.out.println(b.getISBN_NUMBER());
                } else {
                    System.out.println(b.getTitel());
                }
            }
        }
    }

    public void getBooksByAuthor(Auteur author) {
        for (Boek b : bookList) {
            if (b.getAuthor().equals(author)) {
                if (b.getTitel().equals(null) || b.getTitel().equals("")) {
                    System.out.println(b.getISBN_NUMBER());
                } else {
                    System.out.println(b.getTitel());
                }
            }
        }
    }

    public void printAllAuthors() {
        Set<String> lijst = new HashSet<String>();

        for (Boek b : bookList) {
            lijst.add(b.getAuthor().getName());
        }

        for (String s : lijst) {
            System.out.println(s);
        }
    }

    public Set<Auteur> getAllAuthors() {
        Set<Auteur> lijst = new HashSet<Auteur>();

        for (Boek b : bookList) {
            lijst.add(b.getAuthor());
        }

        return lijst;
    }

    public void moveToNewBookcase(Boek b, Boekenkast k) {
        k.addBoek(b);
        this.removeBoek(b);

    }

    public String oldestAuthor() {
        Set<Auteur> s = getAllAuthors();
        int oldest = 0;
        Auteur oudste = null;
        for (Auteur a : s) {
            if (Integer.parseInt(a.getAge()) > oldest) {
                oldest = Integer.parseInt(a.getAge());
                oudste = a;
            }
        }
        if (oudste != null) {
            return "De oudste auteur is " + oudste.getName() + " met een leeftijd van " + oldest + ".";
        }
        return "Er zijn nog geen auteurs met een leeftijd geregistreerd.";
    }
}








