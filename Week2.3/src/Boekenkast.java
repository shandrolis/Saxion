import java.util.ArrayList;
import java.util.List;

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
     * removes book when supplied with same Boek
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
            //checks if Boek already exists in doubleList
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
            }else{
                tempList.add(boek);
            }
        });


//
//
//
//
//
//        if (!duplicates.isEmpty()) {
//
//
//
//
//
//            for (Boek d : duplicates) {
//                for (Boek bb : bookList) {
//
//                    if (d.getTitel().equals(bb.getTitel() || ))
//
//                }
//            }
//        }
//
//
//        for (Boek b : bookList) {
//
//            for (Boek z : duplicates) {
//                //  if ()
//            }
//
//
//            for (Boek c : duplicates) {
//                if (!(c.getTitel().equals(b.getTitel()) || c.getISBN_NUMBER() == b.getISBN_NUMBER())) {
//                    duplicates.add(b);
//                }
//            }
//        }
//
//        for (Boek z : duplicates) {
//            if (z.getTitel() != null && z.getTitel().equals("")) {
//                System.out.println(z.getTitel());
//            } else {
//                System.out.println(z.getISBN_NUMBER());
//            }
//
//        }
    }

}








