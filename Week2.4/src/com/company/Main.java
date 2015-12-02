package com.company;
public class Main {

    public static void main(String[] args) {

        Administratie admin = new Administratie();

        admin.voegBootToe(10,"10-10-90","busherman",1,100,true);
        admin.voegTreinToe(50,"10-10-89",2,200);
        admin.voegBusToe(100,"1--04-1764","naam bus");
        admin.voegVrachtwagenToe(198,200,200,200,true);
        admin.voegContainerschipToe(30000,80);

        //admin.printPeronenvoertuigenVoorAantalPeronen(50);
        //admin.printAlleRijdendeVoertuigen();
        admin.printVoertuigen();
    }
}
