package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class LancerJeu {

    public static String choixordi;
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
                System.out.println("Entrez votre nom :");
                String name = Main.scan.nextLine();
                for (int i = 0; i < 3; i++) {
                    SaisieUtilisateur.raffraichirRang();
                    int[] listePlaque = new int[6];
                    for (int j = 0; j < 6; j += 2) {
                        System.out.println("Dans quel rang piochez-vous, " + name + " ?");
                        String choix = Main.scan.next();
                        listePlaque[j] = SaisieUtilisateur.saisieRang(choix);
                        choixordi = (int) (Math.random()*(3)+1)+"";
                        System.out.println("La machine à choisit le rang " + choixordi + ".");
                        listePlaque[j+1] = SaisieUtilisateur.saisieRang(choixordi);
                    }
                    System.out.println((int) (Math.random()*(999)+101));
                    System.out.println(Arrays.toString(listePlaque));
                    Chrono.chrono(60);
                    tempsJoueur.tempsJoueurReponseLettre();

                    ArrayList<String> tablettre = Lettre.partieLettreUnJoueur(name);
                    Chrono.chrono(60);
                    tempsJoueur.tempsJoueurReponseLettre();
                    String motUtilisateur = SaisieUtilisateur.saisitMot();
                    ArrayList<String> listMots = RecupMots.extraireMots();
                    Verification.verificateurReponseMot(listMots,tablettre,motUtilisateur);
                    tempsJoueur.tempsJoueurReponseLettre();
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
                System.out.println("Entrez votre nom joueur 1 :");
                String name1 = Main.scan.nextLine();
                System.out.println("Entrez votre nom joueur 2 :");
                String name2 = Main.scan.nextLine();
                for (int i = 0; i < 3; i++) {
                    SaisieUtilisateur.raffraichirRang();
                    int[] listePlaque = new int[6];
                    for (int j = 0; j < 6; j += 2) {
                        System.out.println("Dans quel rang piochez-vous, " + name1 + " ?");
                        String choix1 = Main.scan.next();
                        listePlaque[j] = SaisieUtilisateur.saisieRang(choix1);
                        System.out.println("Dans quel rang piochez-vous, " + name2 + " ?");
                        String choix2 = Main.scan.next();
                        listePlaque[j + 1] = SaisieUtilisateur.saisieRang(choix2);
                    }
                    System.out.println((int) (Math.random() * (999) + 101));
                    System.out.println(Arrays.toString(listePlaque));
                    Chrono.chrono(60);
                    System.out.println("Votre réponse " + name1 + " :");
                    tempsJoueur.tempsJoueurReponseLettre();
                    System.out.println("Votre réponse " + name2 + " :");
                    tempsJoueur.tempsJoueurReponseLettre();

                    ArrayList<String> tablettre = Lettre.partieLettreDeuxJoueur(name1, name2);
                    Chrono.chrono(60);
                    tempsJoueur.tempsJoueurReponseLettre();
                    String motUtilisateur = SaisieUtilisateur.saisitMot();
                    ArrayList<String> listMots = RecupMots.extraireMots();
                    Verification.verificateurReponseMot(listMots,tablettre,motUtilisateur);
                    tempsJoueur.tempsJoueurReponseLettre();
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
