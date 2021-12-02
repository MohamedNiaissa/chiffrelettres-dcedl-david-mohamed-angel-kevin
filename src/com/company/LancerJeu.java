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
        ArrayList<String> listMots = RecupMots.extraireMots();

        Verification.scoreJoueur1 = 0;
        Verification.scoreJoueur2 = 0;
        switch (choixJouer) {

            case "1" -> {
                System.out.println("Joueur contre machine");
                ArrayList<String> tablettre = Lettre.partieLettreUnJoueur();
                Chrono.chrono(10);
                String reponseUtilisateur = tempsJoueur.tempsJoueurReponseLettre();
                Boolean verifValiditeReponse = Verification.verificateurReponseMot(listMots,tablettre,reponseUtilisateur);
                String reponseMachine = RechercheMotLong.motLong(listMots,tablettre);

                if (verifValiditeReponse){
                    Verification.jouerGagnantMancheLettre(reponseUtilisateur,reponseMachine);

                }else {
                    System.out.println("L'IA a trouvé le mot " + reponseMachine);
                    Verification.scoreJoueur2++;
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
                Chrono.chrono(10);
                System.out.println("Joueur1, veuillez saisir votre mot: ");
                String reponseUtilisateur1 = tempsJoueur.tempsJoueurReponseLettre();
                System.out.println("Joueur2, veuillez saisir votre mot: ");
                String reponseUtilisateur2 = tempsJoueur.tempsJoueurReponseLettre();
                Boolean verifValiditeReponse1 = Verification.verificateurReponseMot(listMots,tablettre,reponseUtilisateur1);
                Boolean verifValiditeReponse2 = Verification.verificateurReponseMot(listMots,tablettre,reponseUtilisateur2);

                if (verifValiditeReponse1 && verifValiditeReponse2){
                    if (reponseUtilisateur1.length() > reponseUtilisateur2.length()){
                        System.out.println("Joueur 1 possède le mot le plus long : " + reponseUtilisateur1);
                        Verification.scoreJoueur1++;
                    }else if (reponseUtilisateur1.length() < reponseUtilisateur2.length()){
                        System.out.println("Joueur 2 possède le mot le plus long : " + reponseUtilisateur2);
                        Verification.scoreJoueur2++;
                    }else{
                        if (reponseUtilisateur1=="" && reponseUtilisateur2==""){
                            System.out.println("Joueur 1 et Joueur 2 n'ont entré aucune réponse");
                        }else {
                            System.out.println("Égalité vos mots sont de mêmes longueur");
                        }
                    }

                }else if (verifValiditeReponse1 == false && verifValiditeReponse2 == false){
                    System.out.println("Vous avez tous les deux entré des mots inexistans");
                }else if (verifValiditeReponse1 && verifValiditeReponse2 == false){
                    System.out.println("Jouer2 a rentré un mot inexistant,donc Joueur1 remporte cette étape.");
                    Verification.scoreJoueur1++;
                }else{
                    System.out.println("Jouer1 a rentré un mot inexistant,donc Joueur2 remporte cette étape.");
                    Verification.scoreJoueur2++;
                }





            }

            case "3" -> {
            }
            default -> {
                System.err.println("Option non reconnue");
                menuSelectionMode();
            }
        }
    }
}
