package com.company;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FinJeu {

    private void scoresSauvgardes() throws IOException {
        boolean chercherScores = true;
        if (chercherScores) {
            try (Scanner lecteur = new Scanner(Paths.get("scores.txt"))) {
                while (lecteur.hasNextLine()) {
                    String [] lignes = lecteur.nextLine().split(",");
                }
            } catch (Exception e) {
                System.out.println("Ooops, il y a eu un soucis : " + e);
            }
        }
        chercherScores = false;
    }

    public static void finDeJeu() {
        System.out.println("""
                Bravo! Vous avez terminé le jeux
                ********************************
                """);



        System.out.println("""
                Rentrez votre prénom
                Il sera ajouté à la clasification général
                """);
        String prenomJoueur = Main.scan.nextLine();

    }

}
