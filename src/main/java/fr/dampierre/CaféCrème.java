package fr.dampierre;

import java.util.Scanner;

public class CaféCrème {
    public static void main(String[] args) {
    
        int coutCafe = 100;
        Scanner clavier = new Scanner(System.in); 
        System.out.println("Nous allons faire le point sur les finances...");
        System.out.println("Combien de pièces de 1 centime ?");
        int unCentime = clavier.nextInt();
        System.out.println("Combien de pièces de 2 centimes ?");
        int deuxCentime = clavier.nextInt()*2;
        System.out.println("Combien de pièces de 5 centimes ?");
        int cinqCentime = clavier.nextInt()*5;
        System.out.println("Combien de pièces de 10 centimes ?");
        int dixCentime = clavier.nextInt()*10;
        System.out.println("Combien de pièces de 20 centimes ?");
        int vingtCentime = clavier.nextInt()*20;
        System.out.println("Combien de pièces de 50 centimes ?");
        int cinquanteCentime = clavier.nextInt()*50;
        int nbCentime = unCentime + deuxCentime + cinqCentime + dixCentime + vingtCentime + cinquanteCentime;
        System.out.println("Vous êtes riches de " + nbCentime + " centimes !");    

                if(nbCentime == coutCafe){
                    System.out.println("Vous avez exactement de quoi payer le café !");
                }
                else if(nbCentime < coutCafe){
                    System.out.println("Il vous manque " + (coutCafe-nbCentime) + " centimes pour payer le café !");
                }
                else if(nbCentime > coutCafe){
                    System.out.println("Il vous restera " + (nbCentime - coutCafe) + " après avoir pris votre café");
                }
        clavier.close();        
    }
} 






