/**
 * Created by Joep on 16-Nov-15.
 * Implement a class Car with the following properties. A car has a certain
 * fuel efficiency (measured in miles/gallon) and a certain amount of fuel
 * in the gas tank. The efficiency is specified in the constructor, and the
 * initial fuel level is 0. Supply a method drive that simulates driving the
 * car for a certain distance, reducing the fuel level in the gas tank, and methods getGas-
 * Level, to return the current fuel level, and addGas, to tank up. Sample usage:
 * Car myHybrid = new Car(50); // 50 miles per gallon
 * myHybrid.addGas(20); // Tank 20 gallons
 * myHybrid.drive(100); // Drive 100 miles
 * System.out.println(myHybrid.getGasLevel()); // Print fuel remaining
 */
public class Car {
    private double fuelEfficiency, gasInTank;


    public Car(double efficiency) {
        this.fuelEfficiency = efficiency;

        gasInTank = 0;

    }


    public void addGas(double amount) {
        gasInTank = gasInTank + amount;
    }

    public void drive(int amountOfMiles) {
        if ((amountOfMiles / fuelEfficiency) > gasInTank) {
            gasInTank = gasInTank - amountOfMiles / fuelEfficiency;
        } else {
            System.out.println("Not enough gas.");
        }
    }

    public String getGasLevel() {
        return ("There is " + gasInTank + " gallons left in the tank.");
    }


}
