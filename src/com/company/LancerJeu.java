package com.company;

import java.util.ArrayList;

public class LancerJeu {
    public static void menuSelectionMode() {
        System.out.println("""
                ****************************
                Menu selection de mode
                ****************************
                1) Joueur contre machine
                2) Joueur 1 contre Joueur 2
                ****************************
                3) Revenir au menu principal
                """);

        String choixJouer = "";
        choixJouer = Main.scan.nextLine();
        switch (choixJouer) {
            case "1" -> {
                System.out.println("Joueur contre machine");
                ArrayList<String> tablettre = Lettre.partieLettreUnJoueur();
                Chrono.chrono(10);
                String reponseUtilisateur = tempsJoueur.tempsJoueurReponseLettre();
                ArrayList<String> listMots = RecupMots.extraireMots();
                Boolean verifValiditeReponse = Verification.verificateurReponseMot(listMots,tablettre,reponseUtilisateur);
                String reponseMachine = RechercheMotLong.motLong(listMots,tablettre);

                if (verifValiditeReponse){
                    Verification.jouerGagnantMancheLettre(reponseUtilisateur,reponseMachine);

                }else {
                    System.out.println("L'IA a trouvé le mot " + reponseMachine);
                    System.out.println("Votre réponse n'étant point valide l'IA gagne cette étape");
                    System.out.println("L'IA a "+Verification.scoreJoueur2+" points.");

                }


               /* long debut = System.currentTimeMillis();
                long fin = System.currentTimeMillis();
                if (fin-debut > 30000){
                    System.out.println("Vous avez été trop long");
                }
                System.out.println("Résultat enregistré"); */
            }
            case "2" -> {
                System.out.println("Joueur 1 contre jouer 2");
                ArrayList<String> tablettre = Lettre.partieDeuxJoueurs();


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
