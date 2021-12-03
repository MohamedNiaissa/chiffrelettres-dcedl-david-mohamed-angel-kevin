package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LancerJeu {
    public static String choixordi;
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
                System.out.println("Entrez votre nom :");
                String name = Main.scan.nextLine();
                // Chiffres
                for (int i = 0; i < 3; i++) {
                    SaisieUtilisateur.raffraichirRang();
                    List<Integer> listePlaque = new ArrayList<>();
                    for (int j = 0; j < 3; j++) {
                        System.out.println("Dans quel rang piochez-vous, " + name + " ?");
                        String choix = Main.scan.next();
                        while (!(choix.equals("1") || choix.equals("2") || choix.equals("3"))){
                            System.out.println("Vous ne pouvez choisir que le rang 1, 2 ou 3.");
                            choix = Main.scan.next();
                        }
                        listePlaque.add(SaisieUtilisateur.saisieRang(choix));
                        choixordi = (int) (Math.random()*(3)+1)+"";
                        System.out.println("La machine à choisit le rang " + choixordi + ".");
                        listePlaque.add(SaisieUtilisateur.saisieRang(choixordi));
                    }
                    String objectif = (int) (Math.random()*(999-101)+101)+"";
                    System.out.println(objectif);
                    System.out.println(listePlaque);
                    Chrono.chrono(10);
                    tempsJoueur.tempsJoueurReponseLettre();
                    RechercheCompte.toutOrdre(listePlaque,objectif);
                Boolean verifValiditeReponse = Verification.verificateurReponseMot(listMots,tablettre,reponseUtilisateur);
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
                if (verifValiditeReponse){
                    Verification.jouerGagnantMancheLettre(reponseUtilisateur,reponseMachine);
                }else {

                    System.out.println("L'IA a trouvé le mot " + reponseMachine);
                    Verification.scoreJoueur2++;
                    System.out.println("Votre réponse n'étant point valide l'IA gagne cette étape");
                    System.out.println("L'IA a "+Verification.scoreJoueur2+" points.");

                }
                }
                int manche = 1;
                for (int i = 0; i < 3; i++) {
                    System.out.println("\nManche : " + manche);
                    // Lettres
                    ArrayList<String> tablettre = Lettre.partieDeuxJoueurs();
                    Chrono.chrono(10);
                    manche +=1;
                }
                System.out.println("Joueur1, veuillez saisir votre mot: ");
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





                String reponseUtilisateur1 = tempsJoueur.tempsJoueurReponseLettre();
            }
            case "2" -> {
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
                        while (choix1 != "1" && choix1 != "2" && choix1 != "3"){
                            System.out.println("Vous ne pouvez choisir que le rang 1, 2 ou 3.");
                            choix1 = Main.scan.next();
                        }
                        listePlaque[j] = SaisieUtilisateur.saisieRang(choix1);
                        System.out.println("Dans quel rang piochez-vous, " + name2 + " ?");
                        String choix2 = Main.scan.next();
                        while (choix2 != "1" && choix2 != "2" && choix2 != "3"){
                            System.out.println("Vous ne pouvez choisir que le rang 1, 2 ou 3.");
                            choix2 = Main.scan.next();
                        }
                        listePlaque[j + 1] = SaisieUtilisateur.saisieRang(choix2);
                    }
                    System.out.println((int) (Math.random() * (999-101) + 101));
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
                System.err.println("Option non reconnue");
                menuSelectionMode();
            }
        }
    }
}