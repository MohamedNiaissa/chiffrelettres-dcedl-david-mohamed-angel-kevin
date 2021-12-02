package com.company;

import java.util.Random;
import java.util.Scanner;

public class Resultat {
    static int c;
    private static int r;
    private static Scanner operatorChoice;
    static int operator = operatorChoice.nextInt(4);
    static String operatorSwitch;
    static int[] listePlaque ;
    static int verif1 = LancerJeu.listePlaque[0];
    static int verif2 = LancerJeu.listePlaque[1];
    static int verif3 = LancerJeu.listePlaque[2];
    static int verif4 = LancerJeu.listePlaque[3];
    static int verif5 = LancerJeu.listePlaque[4];
    static int verif6 = LancerJeu.listePlaque[5];

    public static void exactPlaque(String choixJouer) {
        Random operatorChoice = new Random();
        for (int i : LancerJeu.listePlaque) {

    }


/*
Scanner sc = new Scanner(System.in);
            String a;
            int b;
            do {
                switch (operator) {
                    case 0 -> {
                        operatorSwitch = "+";
                        c = verif1 + verif2 + verif3 + verif4 + verif5 + verif6;
                    }
                    case 1 -> {
                        operatorSwitch = "-";
                        c = verif1 - verif2 - verif3 - verif4 - verif5 - verif6;
                    }
                    case 2 -> {
                        operatorSwitch = "*";
                        c = verif1 * verif2 * verif3 * verif4 * verif5 * verif6;
                    }
                    case 3 -> {
                        operatorSwitch = "/";
                        c = verif1 / verif2 / verif3 / verif4 / verif5 / verif6;
                    }
                    default -> operatorSwitch = "";
                }
                System.out.println(" " + verif1 + operatorSwitch + verif2 +
                        operatorSwitch + verif3 + operatorSwitch + verif4 + operatorSwitch +
                        verif5 + operatorSwitch + verif6 + " = ?");
//                operatorSwitch(operatorChoice);
                System.out.println(i);
                System.out.println(c);
                b = sc.nextInt();
                if (b != c)
                    System.out.println("Faux, la réponse était : " + c);
                else {
                    if (b == c)
                        System.out.println("la réponse : " + c);
                }
                System.out.println("Continue? y/n");
                a = sc.next();
            } while (a.equals("y"));
        }
 */
//    public static int operatorSwitch(Random operatorChoice) {
//        return 0;
//    }
}
//                Choisir deux nombres a et b au hasard dans la liste L.
//                Choisir une opération arithmétique (+, -, *, /) au hasard.
//                L'opération doit être possible (par exemple,
//                on ne peut pas diviser 5 par 9) et utile
//                (il est inutile par exemple de multiplier un nombre par 1).
//                Poser c := opération(a, b).
//                Mémoriser ce calcul intermédaire dans une chaîne de caractères (une string).
//                Éliminer a et b de la liste L.
//                Ajouter c à la liste L.
//                Si c = r alors afficher tous les calculs intermédiaires. STOP.
//                S'il y a plus d'un nombre dans la liste L
//                alors aller à 1 sinon afficher la liste des calculs intermédiaires et le résultat obtenu.
