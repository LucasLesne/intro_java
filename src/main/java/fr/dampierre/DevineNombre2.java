package fr.dampierre;
import java.util.Random;
import java.util.Scanner;
public class DevineNombre2 {
    public static void main(String[] args) {
Random generateur = new Random();
Scanner clavier = new Scanner(System.in);
int nombre; int tentative; int reponse; 


for (int i = 0; i < 4; i++) {
    tentative = 0; reponse = 0;
    nombre = generateur.nextInt(100)+1;
    System.out.println("Je pense à un nombre et j'essaie de deviner lequel sans tricher.");
        while(reponse!=nombre){
            reponse = generateur.nextInt(100)+1;
            System.out.println("Je tente : "+reponse);
            if(reponse<nombre){
                System.out.println("C'est plus.");
            }
            if(reponse>nombre){
                System.out.println("C'est moins");
                
            }
            tentative=tentative+1;
        }
    System.out.println("Quel bol, vous avez trouvé !");
    System.out.println("Il m'a fallu "+tentative + " tentatives.");
   
}
System.out.println("Merci d'avoir joué !");
clavier.close();
        
}
}