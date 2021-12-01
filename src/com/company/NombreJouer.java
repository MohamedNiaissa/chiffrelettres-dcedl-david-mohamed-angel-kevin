package com.company;

public class NombreJouer {
    public static void chrono(){
        int temps = 60;
        System.out.println(temps);
        for (int i = 0; i < 60; i++) {
            try{
                Thread.sleep(1000);
                temps--;
                System.out.println(temps);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
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
                chrono();
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
