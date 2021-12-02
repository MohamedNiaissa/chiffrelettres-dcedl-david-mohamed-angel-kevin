package com.company;
import java.util.ArrayList;

public class LancerJeu {
    public static void menuSelectionMode() {
        System.out.println("""
                ***********************************************************
                ****************** Menu selection de mode *****************
                ***********************************************************
                Pour jouer contre la machine tapez -> 1
                Pour jouer contre un autre jouer tapez -> 2
                ***********************************************************
                Pour revenir au menu principal tapez -> 3
                ***********************************************************
                """);

        String choixJouer = "";
        choixJouer = Main.scan.nextLine();

        switch (choixJouer) {
            case "1" -> {
                int manche = 1;
                for (int i = 0; i < 3; i++) {
                    System.out.println("\nManche : " + manche);
                    // Lettres
                    ArrayList<String> tablettre = Lettre.partieLettreUnJoueur();
                    Chrono.chrono(2);
                    String reponseUtilisateur = tempsJoueur.tempsJoueurReponseLettre();
                    manche +=1;
                    ArrayList<String> listMots = RecupMots.extraireMots();
                    Verification.verificateurReponseMot(listMots,tablettre,reponseUtilisateur);
                    String reponseMachine = RechercheMotLong.motLong(listMots,tablettre);
                }
            }
            case "2" -> {
                int manche = 1;
                for (int i = 0; i < 3; i++) {
                    System.out.println("\nManche : " + manche);
                    // Lettres
                    ArrayList<String> tablettre = Lettre.partieDeuxJoueurs();
                    Chrono.chrono(10);
                    String reponseUtilisateur = tempsJoueur.tempsJoueurReponseLettre();
                    manche +=1;
                }
            }
            case "3" -> {
            }
            default -> {
                System.out.println("Option non reconnue");
                menuSelectionMode();
            }
        }
    }
}