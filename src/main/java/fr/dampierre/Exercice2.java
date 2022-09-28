package fr.dampierre;

import java.util.Scanner;

public class Exercice2 {
    
    public static void main(String[] args) {
    
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez l'heure :");
        int heure = clavier.nextInt();
        System.out.println("Entrez les minutes :");
        int minutes = clavier.nextInt();
        System.out.println("Entrez les secondes :");
        int secondes = clavier.nextInt();
        int tempsEcoule = heure*60*60 + minutes*60 + secondes;
        System.out.println("Il est " + heure + " h " + minutes + " min " + secondes + "s.");
        System.out.println("Il s'est écoulé " + tempsEcoule + " secondes depuis minuit.");

    
    
    }
}