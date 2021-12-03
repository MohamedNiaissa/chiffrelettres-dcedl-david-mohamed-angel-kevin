package com.company;

import java.util.ArrayList;

/**
 * Type Lettre.
 */
public class Lettre {

    /**
     * Partie lettre un joueur array list.
     * @param name un name
     * @return array list
     */
    public static ArrayList<String> partieLettreUnJoueur(String name){
        /**
         *
         */
        ArrayList<String> lettreChoisis = new ArrayList<>();

        System.out.println("""
                Désormais passons à la partie Lettre (Joueur contre Machine)
                
                Instructions
                """);


        for (int i = 1; i <= 5 ; i++) {

            String lettreUtilisateur = SaisieUtilisateur.SaisieConsVoy(name);
            lettreChoisis.add(lettreUtilisateur);

            System.out.println(lettreChoisis);

            String lettreMachine = SaisieUtilisateur.saisieConsVoyRobot();
            lettreChoisis.add(lettreMachine);

            System.out.println(lettreChoisis);
        }

        return lettreChoisis;

    }

    /**
     * Partie lettre deux joueur array list.
     * @param name1 un name 1
     * @param name2 un name 2
     * @return array list
     */
    public static ArrayList<String> partieLettreDeuxJoueur(String name1, String name2){
        /**
         *
         */
        ArrayList<String> lettreChoisis = new ArrayList<>();

        System.out.println("""
                Désormais passons à la partie Lettre (Joueur contre Machine)
                
                Instructions
                """);

        for (int i = 1; i <= 5 ; i++) {

            String lettreUtilisateur = SaisieUtilisateur.SaisieConsVoy(name1);
            lettreChoisis.add(lettreUtilisateur);

            System.out.println(lettreChoisis);

            String lettreUtilisateur2 = SaisieUtilisateur.SaisieConsVoy(name2);
            lettreChoisis.add(lettreUtilisateur2);

            System.out.println(lettreChoisis);

        }
        return lettreChoisis;
    }
}
