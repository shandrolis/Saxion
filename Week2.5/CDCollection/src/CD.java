
/**
 * Class that represents a CD
 * Please come up with your own fields and methods (hint: look in the text files)
 * Do not forget to implement the toString method in this class!
 * @author Evert Duipmans
 */
public class CD {
	// TODO: Here comes your implementation
    private String title, artist, publisher;
    private double length;
    private int amountOfSongs;


    public CD(int amountOfSongs, String artist, double length, String publisher, String titel) {
        this.amountOfSongs = amountOfSongs;
        this.artist = artist;
        this.length = length;
        this.publisher = publisher;
        this.title = titel;
    }


    @Override
    public String toString() {
        String result = "";
        result+=("Titel: "+ this.title);
        result+=("\n Artiest: "+ this.artist);
        result+=("\n Uitgever: "+this.publisher);
        result+=("\n Totale lengte: "+this.length);
        result+=("\n Aantal liedjes: "+ this.amountOfSongs);
        return result;
    }

    public int getAmountOfSongs() {
        return amountOfSongs;
    }

    public void setAmountOfSongs(int amountOfSongs) {
        this.amountOfSongs = amountOfSongs;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitel() {
        return title;
    }

    public void setTitel(String titel) {
        this.title = titel;
    }
}