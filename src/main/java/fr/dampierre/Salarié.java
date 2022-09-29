package fr.dampierre;

import java.util.Scanner;

public class Salarié {
   public static void main(String[] args) {

    int salaire = 400; 

    Scanner clavier = new Scanner(System.in);
    System.out.println("Entrez le nombre de ventes de la semaine : ");
    int nbVentesSemaine = clavier.nextInt();

    clavier.close();

    if (nbVentesSemaine >= 10){
    // Ajouter la prime
    salaire = salaire + 250; 
    }

    System.out.println("Votre salaire est de : " + salaire);
}
    
}
