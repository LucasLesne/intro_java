package fr.dampierre;

import java.util.Scanner;

public class Exercice3 {
    
    public static void main(String[] args) {
    
        //ACQUISITION DES VARIABLES
    Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez l'heure :");
    int heure = clavier.nextInt();
        System.out.println("Entrez les minutes :");
    int minutes = clavier.nextInt();
        System.out.println("Entrez les secondes :");
    int secondes = clavier.nextInt();
    clavier.close();
        
        //CALCUL ET AFFICHAGE RESULTAT
        int tempsAvantMinuit = 86400 - (heure*60*60 + minutes*60 + secondes);
        System.out.println("Il est " + heure + " h " + minutes + " min " + secondes + "s.");
        System.out.println("Il reste " + tempsAvantMinuit + " secondes avant minuit.");

    
    
    }
}