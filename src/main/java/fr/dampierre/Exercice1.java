package fr.dampierre;

import java.util.Scanner;

public class Exercice1 {
    
    public static void main(String[] args) {
    
        int heure = 12;
        int minutes = 34;
        int secondes = 56;
        int tempsEcoule = heure*60*60 + minutes*60 + secondes;
        System.out.println("Il est " + heure + " h " + minutes + " min " + secondes + "s.");
        System.out.println("Il s'est écoulé " + tempsEcoule + " secondes depuis minuit.");

    // ajout d'un commentaire bidon
    
    }
}