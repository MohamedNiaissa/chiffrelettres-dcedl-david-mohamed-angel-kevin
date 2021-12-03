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

                case "1" -> LancerJeu.menuSelectionMode();
                case "2" -> {
                    System.out.println("Vous avez quitté le jeu");
                    jeuActif = false;
                }
                default -> System.err.println("Option non reconnue");

            }
        }
    }
}
