package com.company;
import java.util.ArrayList;
import java.util.Random;

public class SaisieUtilisateur {
    public static String saisieConsVoy(){
        String[] voyelles = {"a","e","i","o","u","y"};
        String[] consonnes = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","z"};

        System.out.println("""
                ***********************************************************
                Pour une consonne tapez -> c
                Pour une voyelle tapez -> v
                ***********************************************************
                """);
        String randomValeur ="";

        boolean valeurCorrect = true;
        while (valeurCorrect) {
            String valeurUtilisateur = Main.scan.nextLine();

            if (valeurUtilisateur.equals("c")) {
                int rnd = new Random().nextInt(consonnes.length);
                randomValeur = consonnes[rnd];
                valeurCorrect = false;
            } else if (valeurUtilisateur.equals("v")) {
                int rnd = new Random().nextInt(voyelles.length);
                randomValeur = voyelles[rnd];
                valeurCorrect = false;
            } else {
                System.out.println("Veuillez mettre les commandes : c ou v ");
            }
        }
        return randomValeur;
    }

    public static String saisieConsVoyRobot() {
        String[] voyelles = {"a","e","i","o","u","y"};
        String[] consonnes = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","z"};
        ArrayList<String[]> listeVoyelleConsonne = new ArrayList<>();

        listeVoyelleConsonne.add(voyelles);
        listeVoyelleConsonne.add(consonnes);

        int randTab = new Random().nextInt(listeVoyelleConsonne.size());
        String[] tabHasard = listeVoyelleConsonne.get(randTab);
        int randTabHasard = new Random().nextInt(listeVoyelleConsonne.size());
        String lettreTabHasard = tabHasard[randTabHasard];

        return lettreTabHasard;
    }

    public static String saisitMot() {
        String motUtilisateur = Main.scan.nextLine();

        return  motUtilisateur;
    }
}