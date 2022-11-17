package fr.dampierre;
import java.util.Random;
public class DevineNombre2 {
    public static void main(String[] args) {
Random generateur = new Random();
int nombre; int tentative; double moyenne=0; int reponse; int nbParties=10000;


for (int i = 1; i < nbParties+1; i++) {
    tentative = 0; reponse = 0;
    nombre = generateur.nextInt(100)+1;
    System.out.print(i+" - ");
        while(reponse!=nombre){
            reponse = generateur.nextInt(100)+1;
            System.out.print(reponse+" ");
            if(reponse<nombre){
                
            }
            if(reponse>nombre){
                
            }
        tentative=tentative+1;
        }

    System.out.println("["+tentative + "]");
    moyenne=moyenne+tentative; 
}
System.out.println("En moyenne, sur " + nbParties + " parties, il m'a fallu "+ moyenne/nbParties + " tentatives.");

        
}
}