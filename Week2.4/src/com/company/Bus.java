package com.company;

import java.util.Date;

/**
 * Created by Joep on 2-12-2015.
 */
public class Bus extends Personenvervoer{
    private String naam;

    public Bus(int aantalPersoon, String datumGekeurt, String naam) {
        super(aantalPersoon, datumGekeurt);
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Bus{" +
                ", aantalPersonen=" + getAantalPersoon() +
                ", datum Gekeurt=" + getDatumGekeurt() +
                ", naam='" + naam + '\'' +
                '}';
    }
}
