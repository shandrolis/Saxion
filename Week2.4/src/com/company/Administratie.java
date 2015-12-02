package com.company;

import java.awt.print.Book;
import java.util.ArrayList;

/**
 * Created by idris on 2-12-2015.
 */
public class Administratie {
    private ArrayList<Vrachtvervoer> vrachtvervoer = new ArrayList<>();
    private ArrayList<Personenvervoer> persoonvervoer = new ArrayList<>();


    public void voegContainerschipToe(double maximaleLaatVermogen,int aantalContainer){// naam wijzigen
        this.vrachtvervoer.add(new Containerschip(maximaleLaatVermogen,aantalContainer));
    }
    public void voegVrachtwagenToe(double maximaleLaatVermogen, int diepte, int breedte, int hoogte, boolean achterKoppel){
        this.vrachtvervoer.add(new Vrachtwagen(maximaleLaatVermogen,diepte,breedte,hoogte,achterKoppel));
    }
    public void voegBootToe(int aantalPersoon, String datumGekeurt, String naam, int volgNummer, int aantalZwemvesten, boolean koelkast){
        this.persoonvervoer.add(new Boot(aantalPersoon,datumGekeurt,naam,volgNummer,aantalZwemvesten,koelkast));
    }
    public void voegBusToe(int aantalPersoon, String datumGekeurt, String naam){
        this.persoonvervoer.add(new Bus(aantalPersoon,datumGekeurt,naam));
    }
    public void voegTreinToe(int aantalPersoon, String datumGekeurt, int aantalWagen, int lengte){
        this.persoonvervoer.add(new Trein(aantalPersoon,datumGekeurt,aantalWagen,lengte));
    }

    /**
     * we controleren met de if statement of voertuig.getaantalperonen meer is als de opgegeven personen
     * @param aantal
     */
    public void printPeronenvoertuigenVoorAantalPeronen(int aantal){
        for(Personenvervoer voertuig:persoonvervoer){
            if(voertuig.getAantalPersoon()>aantal){
                System.out.println(voertuig);
            }
        }
    }

    /**
     *
     * We gebruiken de forloops om te de array langs te gaan
     * bij de eerste forloop controleren we of de waarde gelijk is aan bus of aan trein met instanceof, als dat het geval is mag het geprint worden
     * bij if statement van de tweede loop kijken we of de waarde gelijk is aan vrachtwagen.
     */
    public void printAlleRijdendeVoertuigen(){
        for(Personenvervoer pvoertuig:persoonvervoer){
           if(pvoertuig instanceof Bus || pvoertuig instanceof Trein)
            System.out.println(pvoertuig);
        }
        for(Vrachtvervoer vvervoer:vrachtvervoer){
            if(vvervoer instanceof Vrachtwagen){
                System.out.println(vvervoer);
            }
        }
    }
    public void printVoertuigen(){
        for(Personenvervoer pvervoer:persoonvervoer){
                System.out.println(pvervoer);
        }
        for(Vrachtvervoer vvervoer:vrachtvervoer){
                System.out.println(vvervoer);
        }
    }

}
