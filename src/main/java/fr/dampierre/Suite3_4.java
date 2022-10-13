package fr.dampierre;

public class Suite3_4 {
    public static void main(String[] args) {
        int nombre = 1;
        int resultat = 0;
        for (int i = 0; i < 10 ; i++) {
            resultat = (int) Math.pow(nombre, 2);
            nombre = nombre+1;
            System.out.print(resultat + " ");
        }

}
}