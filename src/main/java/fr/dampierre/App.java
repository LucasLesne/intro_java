    package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

    Scanner clavier = new Scanner(System.in);
    System.out.println("Bonjour, nous allons calculer votre salaire brut.");
    System.out.println("Combien d'heures avez vous travaillé ce mois-ci ?");
    int heuresTravaillees = clavier.nextInt();
    System.out.println("Quel est votre taux horaire ?");
    double tauxHoraire = clavier.nextDouble();
    clavier.close();
    double salaireBrut = heuresTravaillees * tauxHoraire;
    System.out.println("Ton salaire brut est de " + salaireBrut + " euros, nous espérons que tu es satisfait.");


}
    
}
