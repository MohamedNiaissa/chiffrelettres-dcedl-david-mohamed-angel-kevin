package com.company;

public class NombreJouer {
    public static void commencerJeu() {
        System.out.println("""
                *********************************
                Sélectionnez le nombre de joueurs
                *********************************
                1) Joueur contre machine
                2) Joueur 1 contre joueur 2
                ***********************
                3) Revenir au menu principal
                """);

        String choixJouer = "";
        choixJouer = Main.scan.nextLine();
        switch (choixJouer) {
            case "1" -> System.out.println("Joueur contre machine");
            case "2" -> System.out.println("Joueur 1 contre joueur 2");
            case "3" -> {
            }
            default -> {
                System.out.println("Option non reconnue");
                commencerJeu();
            }
        }

    }
}
