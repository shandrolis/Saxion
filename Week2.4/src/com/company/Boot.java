package com.company;

import java.util.Date;

/**
 * Created by Joep on 2-12-2015.
 */
public class Boot extends Personenvervoer{
    private String naam;
    private int volgNummer;
    private int aantalZwemvesten;
    private boolean koelkast; // true voor koelkast - false voor geen koelkast

    public Boot(int aantalPersoon, String datumGekeurt, String naam, int volgNummer, int aantalZwemvesten, boolean koelkast) {
        super(aantalPersoon, datumGekeurt);
        this.volgNummer = volgNummer;
        this.naam = naam;
        this.aantalZwemvesten = aantalZwemvesten;
        this.koelkast = koelkast;
    }

    @Override
    public String toString() {
        return "Boot{" +
                "naam='" + naam + '\'' +
                ", aantalPersonen=" + getAantalPersoon() +
                ", datum Gekeurt=" + getDatumGekeurt() +
                ", volgNummer=" + volgNummer +
                ", aantalZwemvesten=" + aantalZwemvesten +
                ", koelkast=" + koelkast +
                '}';
    }
}
