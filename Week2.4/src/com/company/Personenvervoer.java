package com.company;

import java.util.Date;

/**
 * Created by idris on 2-12-2015.
 */
public class Personenvervoer {

    protected int aantalPersoon;
    protected String datumGekeurt;

    public Personenvervoer(int aantalPersoon, String datumGekeurt) {
        this.aantalPersoon = aantalPersoon;
        this.datumGekeurt = datumGekeurt;

    }

    public int getAantalPersoon() {
        return aantalPersoon;
    }

    public String getDatumGekeurt() {
        return datumGekeurt;
    }
}