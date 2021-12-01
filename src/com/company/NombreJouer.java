package com.company;

public class NombreJouer {
    public static void chrono(int seconde){
        int temps = seconde;
        System.out.println(0 + "...|...10....|...20....|...30....|...40....|...50....|..." + temps);
        for (int i = 0; i < seconde; i++) {
            try{
                Thread.sleep(1000);
                temps--;
                if (i == 0){
                    System.out.print("+");
                } else if (i%10 == 9) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
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
                chrono(60);
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
