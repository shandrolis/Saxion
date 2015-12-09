import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Administration class in which CDs are stored
 *
 * @author Evert Duipmans
 */
public class CDAdministration {
    private ArrayList<CD> cds = new ArrayList<>();

    /**
     * Method to read CDs from a filename and store them in a list
     * Make sure that this method throws and CDException when there is an invalid line in the file
     *
     * @param filename Name of the file
     * @throws CDException Exception that will be thrown when the line cannot be processed
     */
    public void readCDsFromFile(String filename) throws CDException {
        // TODO: Here comes your implementation
        try {
            Scanner scan = new Scanner(new File(filename));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                line.split(";");
            }


        } catch (FileNotFoundException fnfException) {
            System.out.println("Exception occurred: File Not Found.");
        }


    }

    /**
     * Processes a line that was read from a file
     * regel Line from a file
     *
     * @return CD The object that was created using the information on the line
     * @throws CDException Exception that will be thrown when the line cannot be processed
     */
    private CD readLine(String line) throws CDException {
        // TODO: Here comes your implementation
        String name;
        String artist;
        double length;
        String publisher;
        int amountOfSongs;

        String[] temp;

        Scanner sc = new Scanner(line);
        temp = line.split(";");


        // return new CD(amountOfSongs,artist,length,length, publisher,name);
        return null;
    }

    /**
     * Print een overzicht van alle CD's (maak een toString methode in de klasse CD)
     */
    @Override
    public String toString() {
        String result = "";
        for (CD cd : cds) {
            result += cd.toString() + "\n";
        }
        return result;
    }
}