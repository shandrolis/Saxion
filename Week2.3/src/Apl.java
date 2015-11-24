/**
 * Created by Joep on 23-Nov-15.
 */
public class Apl {

    public static void main (String[] args){

        new Apl().run();
    }


    public void run(){
        Boekenkast kast = new Boekenkast(50);

        for (int i = 0; i < 52; i++) {
            kast.addBoek(new Boek(123));
        }

        kast.checkForDouble();

    }
}
