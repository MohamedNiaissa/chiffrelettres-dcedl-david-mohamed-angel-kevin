package com.company;
import java.util.*;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                ********************************
                Bienvenue aux Chiffres & Lettres
                ********************************
                """);

        boolean jeuActif = true;
        while (jeuActif) {
            System.out.println("""
                    ***************
                    Menu Principal
                    ***************
                    Sélectionner une option:
                    1) Jouer
                    2) Quitter
                    """);

            String choixJouer = "";
            choixJouer = scan.nextLine();
            switch (choixJouer) {
                case "1" -> NombreJouer.jouerNombreJouer();
                case "2" -> {
                    System.out.println("Vous avez quitté le jeu");
                    jeuActif = false;
                }
                default -> System.err.println("Option non reconnue");
            }
        }
    }
}
