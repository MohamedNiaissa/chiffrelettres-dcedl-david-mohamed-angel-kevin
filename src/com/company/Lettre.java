package com.company;

import java.util.ArrayList;

public class Lettre {

    public static ArrayList<String> partieLettreUnJoueur(String name){

        ArrayList<String> lettreChoisis = new ArrayList<>();

        System.out.println("""
                Désormains passons à la partie Lettre (Joueur contre Machine)
                
                Instructions
                """);


        for (int i = 1; i <= 5 ; i++) {

            String lettreUtilisateur = SaisieUtilisateur.saisieConsVoy(name);
            lettreChoisis.add(lettreUtilisateur);

            System.out.println(lettreChoisis);

            String lettreMachine = SaisieUtilisateur.saisieConsVoyRobot();
            lettreChoisis.add(lettreMachine);

            System.out.println(lettreChoisis);
        }

        return lettreChoisis;

    }
    public static ArrayList<String> partieLettreDeuxJoueur(String name1, String name2){

        ArrayList<String> lettreChoisis = new ArrayList<>();

        System.out.println("""
                Désormains passons à la partie Lettre (Joueur contre Machine)
                
                Instructions
                """);


        for (int i = 1; i <= 5 ; i++) {

            String lettreUtilisateur = SaisieUtilisateur.saisieConsVoy(name1);
            lettreChoisis.add(lettreUtilisateur);

            System.out.println(lettreChoisis);

            String lettreUtilisateur2 = SaisieUtilisateur.saisieConsVoy(name2);
            lettreChoisis.add(lettreUtilisateur2);

            System.out.println(lettreChoisis);

        }

        return lettreChoisis;

    }







}
