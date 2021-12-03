package com.company;
import java.util.*;


/**
 * Type Main.
 */
public class Main {
    /**
     * Scan constant.
     */
    public static Scanner scan = new Scanner(System.in);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        System.out.println("""
                ***********************************************************
                ***********************************************************
                ************ Bienvenue aux Chiffres & Lettres *************
                ***********************************************************
                ***********************************************************
                """);

        boolean jeuActif = true;
        while (jeuActif) {
            System.out.println("""
                    ***********************************************************
                    *********************** Menu Principal ********************
                    ***********************************************************
                    Sélectionnez une option:
                    Pour jouer tapez -> 1
                    Pour sortir du jeu tapez -> 2
                    ***********************************************************
                    """);

            String choixJouer = "";
            choixJouer = scan.nextLine();
            switch (choixJouer) {
                case "1" -> {
                    System.out.println("""
                            ***********************************************************
                            ************************ INSTRUCTIONS *********************
                            ***********************************************************
                            Le jeu à troix manches
                            Chaque manche comporte deux étapes :
                            - Étape 1: Les chiffres
                            - Étape 2: Les lettres
                            ***********************************************************
                            Les étapes se succèdent l'une après l'autre automatiquement
                            ***********************************************************
                            Deux modes de jeu sont disponibles :
                            - Joueur contre machine
                            - Joueur contre Joueur
                            ***********************************************************
                            """);
                    LancerJeu.menuSelectionMode();
                }
                case "2" -> {
                    System.out.println("Vous avez quitté le jeu");
                    jeuActif = false;
                }
                default -> System.err.println("Option non reconnue");
            }
        }
    }
}