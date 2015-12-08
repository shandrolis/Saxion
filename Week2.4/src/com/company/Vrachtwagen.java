package com.company;

/**
 * Created by Joep on 2-12-2015.
 */
public class Vrachtwagen extends Vrachtvervoer{

    private int diepte;
    private int breedte;
    private int hoogte;
    private boolean achterKoppel;

    public Vrachtwagen(double maximaleLaatVermogen, int diepte, int breedte, int hoogte, boolean achterKoppel) {
        super(maximaleLaatVermogen);
        this.diepte = diepte;
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.achterKoppel = achterKoppel;
    }

    @Override
    public String toString() {
        return "Vrachtwagen{" +
                ", diepte=" + diepte +
                ", laatvermogen=" + getMaximaleLaatVermogen() +
                ", breedte=" + breedte +
                ", hoogte=" + hoogte +
                ", achterKoppel=" + achterKoppel +
                '}';
    }
}
