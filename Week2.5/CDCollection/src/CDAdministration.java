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
                cds.add(readLine(line));
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
        if (!(sc.next().contains("#"))) {


            temp = line.split(";");

            if (temp.length == 5) {
                name = temp[0];
                artist = temp[1];
                length = Double.parseDouble(temp[3]);
                publisher = temp[4];
                amountOfSongs = Integer.parseInt(temp[2]);
            } else {
                throw new CDException();
            }
            return new CD(amountOfSongs, artist, length, publisher, name);
        } else {
            throw new CDException();
        }


    }

    /**
     * Print een overzicht van alle CD's (maak een toString methode in de klasse CD)
     */
    @Override
    public String toString() {
        if (!cds.isEmpty()) {

            String result = "";
            for (CD cd : cds) {
                result += cd.toString() + "\n";
            }
            return result;
        }
        return "No CDs are present.";
    }
}