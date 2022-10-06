package fr.dampierre;

import java.util.Scanner;

public class Couleurs {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez votre couleur (r,v,B)");
        String couleur = clavier.nextLine();
        clavier.close();
            if(couleur.equals("r")||couleur.equals("R")){
                System.out.println("Vous avez choisi le rouge.");
            }
            else if(couleur.equals("v")||couleur.equals("V")){
                System.out.println("Vous avez choisi le vert.");
            }
            else if(couleur.equals("b")||couleur.equals("B")){
                System.out.println("Vous avez choisi le bleu.");
            }
            else
                System.out.println("Connais pas.");
    }
}