package com.company;
import java.util.ArrayList;

public class Lettre {
    public static ArrayList<String> partieLettreUnJoueur() {
        ArrayList<String> lettreChoisis = new ArrayList<>();

        System.out.println("""
                ***********************************************************
                ********************** Instructions ***********************
                ***********************************************************
                Vous devez coisir 5 lettres
                5 lettres supplémentaires seront choisis par la machine
                ***********************************************************
                """);

        for (int i = 1; i <= 5 ; i++) {
            String lettreUtilisateur = SaisieUtilisateur.saisieConsVoy(LancerJeu.name);
            lettreChoisis.add(lettreUtilisateur);
            System.out.println("Lettres générées : " + lettreChoisis);
        }

        for (int i = 0; i < 5; i++) {
            String lettreMachine = SaisieUtilisateur.saisieConsVoyRobot();
            lettreChoisis.add(lettreMachine);
        }

        System.out.println("\nLa sélection finale de lettres pour cette manche, y compris la sélection de la machine est : " + lettreChoisis + "\n");
        return lettreChoisis;
    }

    public static ArrayList<String> partieLettreDeuxJoueur(String name1, String name2) {
        ArrayList<String> lettreChoisis2 = new ArrayList<>();

        System.out.println("""
                ***********************************************************
                ********************** Instructions ***********************
                ***********************************************************
                Vous devez choisir 5 lettres chacun
                D'abord, le Joueur 1 choisi ses 5 lettres
                Ensuite, le Joueur 2 choisi les sienne
                ***********************************************************
                """);

        System.out.println("\nLancement de la saisie Joueur 1...\n");
        for (int i = 1; i <= 5 ; i++) {
            String lettreUtilisateur = SaisieUtilisateur.saisieConsVoy(LancerJeu.name);
            lettreChoisis2.add(lettreUtilisateur);
            System.out.println("Lettres générées : " + lettreChoisis2);
        }

        System.out.println("\nLancement de la saisie Joueur 2...\n");
        for (int i = 1; i <= 5 ; i++) {
            String lettreUtilisateur = SaisieUtilisateur.saisieConsVoy(LancerJeu.name);
            lettreChoisis2.add(lettreUtilisateur);
            System.out.println("Lettres générées : " + lettreChoisis2);
        }

        System.out.println("\nLa sélection finale de lettres pour cette manche est : " + lettreChoisis2 + "\n");
        return lettreChoisis2;
    }
}