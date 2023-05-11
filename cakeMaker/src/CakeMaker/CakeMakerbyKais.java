package CakeMaker;

import java.util.Scanner;

public class CakeMakerbyKais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Lecture des entrées
        System.out.println("donner la quantité de farine:");
        int farine = sc.nextInt();

        System.out.println("donner la quantite de sucre:");
        int sucre = sc.nextInt();

        System.out.println("donner le quantite de better:");
        int beurre = sc.nextInt();

        System.out.println("donner la quantite des oeufs:");
        int oeuf = sc.nextInt();

        System.out.println("quel est la temperature fournit: ");
        int temp = sc.nextInt(); // en celsus

        int eggesNedded = (int) Math.ceil((double) farine / 200);
        int sugarNedeed = 30 * (int) Math.ceil((double) farine / 200);
        int butterNedeed = 80 * (int) Math.ceil((double) farine / 200);

        if (farine % 200 > 0) {
            eggesNedded++;
            // int oeufManq= eggesNedded-oeuf;
        }
        if (oeuf < eggesNedded) {
            System.out.println(/*(eggesNedded - oeuf)+ " "+*/"oeufs manquante(s)");
        } else if (sucre < sugarNedeed) {
            System.out.println(/*(sugarNedeed - sucre)+ " gr"+*/"sucre manquante(s)");
        } else if (beurre < butterNedeed) {
            System.out.println(/*(butterNedeed - beurre)+ " gr"+*/"beurre manquante(s)");
        } else {// si il n'y a pas de else plusieur msg s'affiche
            double tempF = 1.8 * temp + 32;//conversion en fahrent
            if (tempF <= 325) {
                System.out.println(" temperature low");
            } else if (tempF <= 450) {
                System.out.println("vous pouvez preparer le gateau!!!");

            } else if ((tempF > 450 && tempF <= 500) && farine > 1000) {

                System.out.println(" vous pouvez mais temperature eleve max 500 cause farine depasse le 1kg");

            } else
                System.out.println("incoreccte temperature; temperature suprieur à 500 ou farine inferieur à 1 kg");
        }
    }

}
