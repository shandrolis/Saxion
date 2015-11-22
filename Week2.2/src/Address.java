/**
 * Created by Joep on 16-Nov-15.
 * P8.4 Implement a class Address. An address has a house number, a street, an optional
 * apartment number, a city, a state, and a postal code. Supply two constructors: one
 * with an apartment number and one without. Supply a print method that prints the
 * address with the street on one line and the city, state, and zip code on the next line.
 * Supply a method public boolean comesBefore(Address other) that tests whether this
 * address comes before another when the addresses are compared by postal code
 */
public class Address {
    private int houseNumber, appartmentNumber, postalCode;
    private String street, city, state;

    public Address(int appartmentNumber, int houseNumber, String street, String city, int postalCode) {
        this.appartmentNumber = appartmentNumber;
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public Address(int houseNumber, String street, String city, int postalCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public void Print() {
        System.out.println(street + " " + houseNumber);
        System.out.println(city + " " + state + " " + postalCode);
    }

    public boolean comesBefore(Address other) {
        if (other.postalCode < this.postalCode) {
            return true;
        }
        return false;
    }


}







