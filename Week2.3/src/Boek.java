/**
 * Created by Joep on 23-Nov-15.
 */
public class Boek {
    private int ISBN_NUMBER;
    private int aantalPaginas;
    private String titel;
    private Auteur author;


    public Boek(int nr) {
        this.ISBN_NUMBER = nr;
    }

    public Boek(int nr, int paginas) {
        this.ISBN_NUMBER = nr;
        this.aantalPaginas = paginas;
    }

    public Boek(int nr, int paginas, Auteur author) {
        this.ISBN_NUMBER = nr;
        this.author = author;
        this.aantalPaginas = paginas;
    }

    public Boek(int nr, String title) {
        this.ISBN_NUMBER = nr;
        this.titel = title;
    }

    public Boek(int nr, String title, Auteur author) {
        this.ISBN_NUMBER = nr;
        this.titel = title;
        this.author = author;

    }

    public Boek(int nr, int paginas, String title) {
        this.ISBN_NUMBER = nr;
        this.aantalPaginas = paginas;
        this.titel = title;
    }

    public Boek(Auteur author, String titel, int aantalPaginas) {
        this.author = author;
        this.titel = titel;
        this.aantalPaginas = aantalPaginas;
    }

    public Boek(int nr, int paginas, String title, Auteur author) {
        this.ISBN_NUMBER = nr;
        this.aantalPaginas = paginas;
        this.titel = title;
        this.author = author;
    }

    public Boek(String titel, Auteur author) {
        this.titel = titel;
        this.author = author;
    }

    public int getISBN_NUMBER() {
        return ISBN_NUMBER;
    }

    public int getAantalPaginas() {
        return aantalPaginas;
    }

    public void setAantalPaginas(int aantalPaginas) {
        this.aantalPaginas = aantalPaginas;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Auteur getAuthor() {
        return author;
    }

    public void setAuthor(Auteur author) {
        this.author = author;
    }
}
