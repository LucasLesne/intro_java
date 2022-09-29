package fr.dampierre;
import java.util.Scanner;
public class Salarié2 {
    public static void main(String[] args) {

            int quotaVentes = 10; 
            Scanner clavier = new Scanner(System.in);
            System.out.println("Entrez le nombre de ventes de la semaine : ");
            int nbVentes = clavier.nextInt(); 

            if (nbVentes >= quotaVentes){
            System.out.println("Félicitations ! Vous avez rempli le quota.");
            }
            else{
            int nbVentesManquantes = quotaVentes - nbVentes; 
            System.out.println("Il vous manque " + nbVentesManquantes + " ventes pour atteindre le quota.");  
            }
            clavier.close();


    }
}
