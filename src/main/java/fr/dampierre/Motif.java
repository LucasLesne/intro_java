package fr.dampierre;

public class Motif {
    public static void main(String[] args) {
        int nb = 0;
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print("_-^-");
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            nb = nb+1;
            System.out.print(nb +""+ nb);
        }
        nb = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(nb+""+nb);
            nb=nb+1;
        }
        System.out.print("00");
        System.out.println();
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }


}
}