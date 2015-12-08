
/**
 * Class that represents a CD
 * Please come up with your own fields and methods (hint: look in the text files)
 * Do not forget to implement the toString method in this class!
 * @author Evert Duipmans
 */
public class CD {
	// TODO: Here comes your implementation
    private String titel, artist, publisher;
    private double length;
    private int amountOfSongs;


    public CD(int amountOfSongs, String artist, double length, String publisher, String titel) {
        this.amountOfSongs = amountOfSongs;
        this.artist = artist;
        this.length = length;
        this.publisher = publisher;
        this.titel = titel;
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
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}