package com.company;

/**
 * Created by idris on 2-12-2015.
 */
public class Vrachtvervoer {

    protected double maximaleLaatVermogen;

    public Vrachtvervoer(double maximaleLaatVermogen) {
        this.maximaleLaatVermogen = maximaleLaatVermogen;
    }

    public double getMaximaleLaatVermogen(){
        return maximaleLaatVermogen;
    }
}
