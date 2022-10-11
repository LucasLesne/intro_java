package fr.dampierre;

public class Suite2 {
    public static void main(String[] args) {
        int nombreA = 0;
        int nombreB = 1;
        int nombreC = 0;
        System.out.print(nombreA+" "+nombreB+" ");

        for (int i = 0; i<20; i++){
            nombreC = nombreB+nombreA;
            System.out.print(nombreC+" ");
            nombreA = nombreB;
            nombreB = nombreC;
           
            }
    }
}