package fr.dampierre;
import java.util.Random;
import java.util.Scanner;
public class DevineNombre {
    public static void main(String[] args) {
Random generateur = new Random();
Scanner clavier = new Scanner(System.in);
int nombre; int tentative; int reponse; 
String rejouer = "o";

while(rejouer == "o"){
tentative = 0; reponse = 0;
nombre = generateur.nextInt(100)+1;
System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
    while(reponse!=nombre){
        System.out.print("Entrez un nombre : ");
        reponse = clavier.nextInt();
        
        if(reponse<1 || reponse>100){
            System.out.println("Merci d'entrer un nombre entre 1 et 100.");
        }
        else if
        (reponse<nombre){
            System.out.println("C'est plus.");
            tentative=tentative+1;
            }
        else if(reponse>nombre){
            System.out.println("C'est moins");
            tentative=tentative+1;
            }
        }
    System.out.println("Quel bol, vous avez trouvé !");
    System.out.println("Il vous aura fallu "+tentative + " tentatives.");
    System.out.print("On continue ? O/N ");
    rejouer =clavier.next().toLowerCase().substring(0,1);
    System.out.println(rejouer);
        
    
}
clavier.close();
        
}
}