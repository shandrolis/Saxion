package BoekenkastOpdracht;

/**
 * Created by Joep on 23-Nov-15.
 */
public class Apl {

    public static void main(String[] args) {

        new Apl().run();
    }


    public void run() {
        Boekenkast kast = new Boekenkast(50);

        for (int i = 0; i < 15; i++) {
            kast.addBoek(new Boek(20, "Abanas", new Auteur("Peter pannekoek")));
            kast.addBoek(new Boek(23, "potato", new Auteur("Henri Horis")));
        }

        kast.getBooksByAuthor("Peter pannekoek");
        //   kast.checkForDouble();

    }
}
