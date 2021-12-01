package com.company;

import java.util.Arrays;

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
                System.out.println("Entrez votre nom :");
                String name = Main.scan.nextLine();
                for (int i = 0; i < 3; i++) {
                saisieUtilisateur.raffraichirRang();
                int[] listePlaque = new int[6];
                for (int j = 0; j < 3; j++) {
                    System.out.println("Dans quel rang piochez-vous, " + name + " ?");
                    String choix = Main.scan.next();
                    listePlaque[j] = saisieUtilisateur.saisieRang(choix);
                    System.out.println("La machine à choisit le rang blabla");
                }
                System.out.println((int) (Math.random()*(999)+101));
                System.out.println(Arrays.toString(listePlaque));
                chrono(60);
                long debut = System.currentTimeMillis();
                String test30 = Main.scan.next();
                long fin = System.currentTimeMillis();
                if (fin-debut > 30000){
                    System.out.println("Vous avez été trop long");
                }
                System.out.println("Résultat enregistré");
                }
            }
            case "2" -> {
                System.out.println("Joueur 1 contre jouer 2");
                System.out.println("Entrez votre nom joueur 1 :");
                String name1 = Main.scan.nextLine();
                System.out.println("Entrez votre nom joueur 1 :");
                String name2 = Main.scan.nextLine();
                for (int i = 0; i < 3; i++) {
                    saisieUtilisateur.raffraichirRang();
                    int[] listePlaque = new int[6];
                    for (int j = 0; j < 3; j++) {
                        System.out.println("Dans quel rang piochez-vous, " + name1 + " ?");
                        String choix1 = Main.scan.next();
                        listePlaque[j] = saisieUtilisateur.saisieRang(choix1);
                        System.out.println("Dans quel rang piochez-vous, " + name2 + " ?");
                        String choix2 = Main.scan.next();
                        listePlaque[j] = saisieUtilisateur.saisieRang(choix2);
                    }
                    System.out.println((int) (Math.random()*(999)+101));
                    System.out.println(Arrays.toString(listePlaque));
                    chrono(60);
                    long debut1 = System.currentTimeMillis();
                    System.out.println("Votre réponse "+ name1 +" :");
                    String test1 = Main.scan.next();
                    long fin1 = System.currentTimeMillis();
                    if (fin1-debut1 > 30000){
                        System.out.println("Vous avez été trop long");
                    }
                    System.out.println("Résultat enregistré");
                    long debut2 = System.currentTimeMillis();
                    System.out.println("Votre réponse "+ name2 +" :");
                    String test2 = Main.scan.next();
                    long fin2 = System.currentTimeMillis();
                    if (fin2-debut2 > 30000){
                        System.out.println("Vous avez été trop long");
                    }
                    System.out.println("Résultat enregistré");
                }
            }
            case "3" -> {
            }
            default -> {
                System.out.println("Option non reconnue");
                jouerNombreJouer();
            }
        }
    }
}
