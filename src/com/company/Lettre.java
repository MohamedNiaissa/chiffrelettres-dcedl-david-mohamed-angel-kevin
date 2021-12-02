package com.company;

import java.util.ArrayList;

public class Lettre {

    public static ArrayList<String> partieLettreUnJoueur(){
        ArrayList<String> lettreChoisis = new ArrayList<>();

        System.out.println("""
                *******************************************************
                              Vous avez choisi le mode:
                                Joueur contre machine
                *******************************************************
                
                
                *******************************************************
                ******************* Instructions **********************
                *******************************************************
                Vous devez coisir 5 lettres
                5 lettres supplémentaires seront choisis par la machine
                *******************************************************
                """);

        for (int i = 1; i <= 5 ; i++) {
            String lettreUtilisateur = SaisieUtilisateur.saisieConsVoy();
            lettreChoisis.add(lettreUtilisateur);
            String lettreMachine = SaisieUtilisateur.saisieConsVoyRobot();
            lettreChoisis.add(lettreMachine);
        }

        System.out.println("La sélection finale de lettres pour cette manche est : " + lettreChoisis);
        return lettreChoisis;
    }

    public static ArrayList<String> partieDeuxJoueurs() {

        ArrayList<String> lettreChoisis2= new ArrayList<>();

        System.out.println("""
                *******************************************************
                              Vous avez choisi le mode:
                                Joueur contre Joueur
                *******************************************************
                
                
                *******************************************************
                ******************* Instructions **********************
                *******************************************************
                Vous devrez choisir 5 lettres chacun
                D'abord, le Joueur 1 choisi ses 5 lettres
                Ensuite, le Joueur 2 choisi les sienne
                *******************************************************
                """);
        System.out.println("Lancement de la saisie Joueur 1...");
        for (int i = 1; i <= 5 ; i++) {
            String lettreUtilisateur = SaisieUtilisateur.saisieConsVoy();
            lettreChoisis2.add(lettreUtilisateur);
        }

        System.out.println("Lancement de la saisie Joueur 2...");
        for (int i = 1; i <= 5 ; i++) {
            String lettreUtilisateur = SaisieUtilisateur.saisieConsVoy();
            lettreChoisis2.add(lettreUtilisateur);
        }

        System.out.println("La sélection finale de lettres pour cette manche est : " + lettreChoisis2);
        return lettreChoisis2;
    }
}
