/**
 * Created by Joep on 16-Nov-15.
 * Declare a class ComboLock that works like the combination lock
 * in a gym locker, as shown here. The lock is constructed with a
 * combination—
 * three numbers between 0 and 39. The reset method
 * resets the dial so that it points to 0. The turnLeft and turnRight
 * methods turn the dial by a given number of ticks to the left or
 * right. The open method attempts to open the lock. The lock opens
 * if the user first turned it right to the first number in the combination,
 * then left to the second, and then right to the third.
 * public class ComboLock
 * {
 * . . .
 * public ComboLock(int secret1, int secret2, int secret3) { . . . }
 * public void reset() { . . . }
 * public void turnLeft(int ticks) { . . . }
 * public void turnRight(int ticks) { . . . }
 * public boolean open() { . . . }
 */
public class ComboLock {

    private int secret1, secret2, secret3;
    private final int MINNUMBER = 0;
    private final int MAXNUMBER = 39;
    private int dial;
    private boolean condition1, condition2, condition3;

    public ComboLock(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;

        condition1=false;
        condition2=false;
        condition3=false;
        dial = 0;

    }

    public void reset() {
        dial = 0;
        System.out.println("The dial has been reset to 0");
    }

    public void turnLeft(int ticks) {
        if ((dial - ticks) < MINNUMBER) {
            dial = MAXNUMBER - ticks;
        } else {
            dial = dial - ticks;
        }

        if (condition1==true && condition2==false && dial==secret2){
            condition2=true;
            System.out.println("You succesfully cracked the third code. One more to go!");

        }
    }

    public void turnRight(int ticks) {

        if ((dial + ticks) > MAXNUMBER) {
            dial = MINNUMBER + ticks;
        } else {
            dial = dial + ticks;
        }

        if (condition1 == false) {
            if (dial == secret1) {
                condition1 = true;
                System.out.println("You succesfully cracked the first code. Two more to go!");
            }
            if (condition2 == true && condition3 == false) {
                if (dial == secret3) {
                    condition3 = true;
                    System.out.println("You succesfully cracked the third code. \n");

                    open();
                }
            }
        }

    }


    // opens only if FIRST turned RIGHT to secret1, THEN turned LEFT to secret2 and finally turned RIGHT to secret3
    public void open() {
        if (condition1 == true && condition2 == true && condition3 == true) {
            System.out.println("You hear a loud *CLICK* and the safe opens.");
        } else {
            System.out.println("The safe still refuses to open.");
            if (condition1 == true && condition2 == true) {
                System.out.println("You still need to crack the third code.");
            } else if (condition1 == true) {
                System.out.println("You still need to crack the second and third code.");
            }else{
                System.out.println("You have yet to crack any of the three codes.");
        }

    }

}


}
