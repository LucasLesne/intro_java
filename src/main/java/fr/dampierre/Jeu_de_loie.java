package fr.dampierre;
import java.util.Random;
public class Jeu_de_loie {  
    public static void main(String[] args) {
    
        Random generateur = new Random();
        int points=0;
    
    while(points!=20){
        points=0;
        for(int i=0; i<5; i++){
        int lancer = generateur.nextInt(6) + 1;
        System.out.println("Vous avez fait "+lancer);
        points = points + lancer;
        System.out.println("Vous êtes à la case " + points);
        }
        if(points!=20){
        System.out.println("Perdu");
        }
    }
     System.out.println("Gagné");
    
    }
}
