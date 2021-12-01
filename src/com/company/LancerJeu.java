package com.company;

public class LancerJeu {


    public static void menuSelectionMode() {
        System.out.println("""
                *********************************
                Sélectionnez le nombre de joueurs
                *********************************
                1) Joueur contre machine
                2) Joueur 1 contre Joueur 2
                ***********************
                3) Revenir au menu principal
                """);

        String choixJouer = "";
        choixJouer = Main.scan.nextLine();
        switch (choixJouer) {
            case "1" -> {
                System.out.println("Joueur contre machine");
                Lettre.partieLettreUnJoueur();
                Chrono.chrono(60);

               /* long debut = System.currentTimeMillis();
                long fin = System.currentTimeMillis();
                if (fin-debut > 30000){
                    System.out.println("Vous avez été trop long");
                }
                System.out.println("Résultat enregistré"); */
            }
            case "2" -> System.out.println("Joueur 1 contre jouer 2");
            case "3" -> {
            }
            default -> {
                System.out.println("Option non reconnue");
                menuSelectionMode();
            }
        }
    }
}
