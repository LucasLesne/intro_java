package fr.dampierre;

import java.util.Random;

public class Jeu_de_loie {
   
    public static void main(String[] args) {
    
        Random generateur = new Random();
        int points=0;

    for(int i=0; i<5; i++){
        int lancer = generateur.nextInt(6) + 1;
        points = points + lancer;
        System.out.println("Vous êtes à la case " + points);
    }
    if(points==20){
        System.out.println("Gagné");
    }
    else{
        System.out.println("Perdu");
    }
    }

}
