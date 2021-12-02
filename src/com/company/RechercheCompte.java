//package com.company;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class RechercheCompte {
//    int verifCompte() {
//        int[] listePlaque;
//        int i = 6;
//        int random1 = (int) (Math.random() * (i));
////        int verif1 = listePlaque[random1];
//        int random2 = (int) (Math.random() * (i));
////        int verif2 = listePlaque[random2];
//
//        Scanner sc = new Scanner(System.in);
//        String a;
//        do {
//            String operatorSwitch;
//            int b;
//            int c = 0;
//            int verif1 = listePlaque[random1];
//            int verif2 = listePlaque[random2];
//            Random operatorChoice = new Random();
//            int operator = operatorChoice.nextInt(4);
//            switch (operator) {
//                case 0:
//                    operatorSwitch = "+";
//                    c = verif1 + verif2;
//                    break;
//                case 1:
//                    operatorSwitch = "-";
//                    c = verif1 - verif2;
//                    break;
//                case 2:
//                    operatorSwitch = "*";
//                    c = verif1 * verif2;
//                    break;
//                case 3:
//                    operatorSwitch = "/";
//                    c = verif1 / verif2;
//                    break;
//                default:
//                    operatorSwitch = "";
//            }
//            System.out.println(" " + verif1 + operatorSwitch + verif2 + "?");
//            b = sc.nextInt();
//            if (b != c)
//                System.out.println("Faux, la réponse était : " + c);
//            else {
//                if (b == c)
//                    System.out.println("la réponse : " + c);
//            }
//            System.out.println("Continue? y/n");
//            a = sc.next();
//        } while (a.equals("y"));
//        return i;
//    }
//}
//
//
//
//
////        Données: six nombres dans une liste L et le résultat r à approcher.
//
////        Choisir deux nombres a et b au hasard dans la liste L.
////        Choisir une opération arithmétique (+, -, *, /) au hasard. L'opération doit être possible (par exemple, on ne peut pas diviser 5 par 9) et utile (il est inutile par exemple de multiplier un nombre par 1).
////        Poser c := opération(a, b). Mémoriser ce calcul intermédaire dans une chaîne de caractères (une string).
////        Éliminer a et b de la liste L.
////        Ajouter c à la liste L.
////        Si c = r alors afficher tous les calculs intermédiaires. STOP.
////                S'il y a plus d'un nombre dans la liste L alors aller à 1 sinon afficher la liste des calculs intermédiaires et le résultat obtenu.
//
////        int i = 6;
////        int random1 = (int) (Math.random()*(i));
////        int verif1 = listePlaque[random1];
////        int random2 = (int) (Math.random()*(i));
////        int verif2 = listePlaque[random2];
//
//
////        int resultat = 0;
////        int i = 6;
////        int random1 = (int) (Math.random()*(i));
////        int verif1 = listePlaque[random1];
////        listePlaque[random1] = -1;
////        i--;
////        int random2 = (int) (Math.random()*(i));
////        int verif2 = listePlaque[random2];
////        while (verif2 == -1){
////            random2 = (int) (Math.random()*(i));
////            verif2 = listePlaque[random2];
////        }
////        listePlaque[random1] = -1;
////        i--;
////        int choix = (Math.random()*(i)
////        if (verif1-verif2 > 0){
////            System.out.println("arret sous");
////        } else {
////            resultat = verif1-verif2;
////        }
////        if (verif2-verif1 > 0){
////            System.out.println("arret sous");
////        } else {
////            resultat = verif2-verif1;
////        }
////        if (verif1 == 1 || verif2 == 1){
////            System.out.println("arret mult div");
////        } else if (verif1%verif2 != 0){
////            System.out.println("arret div");
////        } else if (verif2%verif1 != 0) {
////
////        } else {
////            resultat = verif2*verif1;
////            resultat = verif2/verif1;
////            resultat = verif1/verif2;
////            resultat = verif1*verif2;
////        }
//
