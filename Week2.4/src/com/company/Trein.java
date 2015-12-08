package com.company;

import java.util.Date;

/**
 * Created by Joep on 2-12-2015.
 */
public class Trein extends Personenvervoer {
    private int aantalWagen;
    private int lengte;

    public Trein(int aantalPersoon, String datumGekeurt, int aantalWagen, int lengte) {
        super(aantalPersoon, datumGekeurt);
        this.aantalWagen = aantalWagen;
        this.lengte = lengte;
    }

    @Override
    public String toString() {
        return "Trein{" +
                ", aantalPersonen=" + getAantalPersoon() +
                ", datum Gekeurt=" + getDatumGekeurt() +
                ", aantalWagen=" + aantalWagen +
                ", lengte=" + lengte +
                '}';
    }
}
