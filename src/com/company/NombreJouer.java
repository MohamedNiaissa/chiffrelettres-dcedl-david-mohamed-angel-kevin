package com.company;

public class NombreJouer {


    public static void jouerNombreJouer() {
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
            case "1" -> {
                System.out.println("Joueur contre machine");
                Chrono.chrono(60);
                long debut = System.currentTimeMillis();
                String test30 = Main.scan.nextLine();
                long fin = System.currentTimeMillis();
                if (fin-debut > 30000){
                    System.out.println("Vous avez été trop long");
                }
                System.out.println("Résultat enregistré");
            }
            case "2" -> System.out.println("Joueur 1 contre jouer 2");
            case "3" -> {
            }
            default -> {
                System.out.println("Option non reconnue");
                jouerNombreJouer();
            }
        }
    }
}
