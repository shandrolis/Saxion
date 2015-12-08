package com.company;

/**
 * Created by Joep on 2-12-2015.
 */
public class Containerschip extends Vrachtvervoer{

    private int aantalContainer;

    public Containerschip(double maximaleLaatVermogen, int aantalContainer) {
        super(maximaleLaatVermogen);
        this.aantalContainer = aantalContainer;
    }

    @Override
    public String toString() {
        return "Containerschip{" +
                ", laatvermogen=" + getMaximaleLaatVermogen() +
                ", aantalContainer=" + aantalContainer +
                '}';
    }
}
