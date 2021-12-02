package com.company;

import java.util.ArrayList;

public class Lettre {

    public static ArrayList<String> partieLettreUnJoueur(){

        ArrayList<String> lettreChoisis = new ArrayList<>();

        System.out.println("""
                Désormains passons à la partie Lettre (Joueur contre Machine)
                
                Instructions
                """);


        for (int i = 1; i <= 5 ; i++) {

            String lettreUtilisateur = SaisieUtilisateur.saisieConsVoy();
            lettreChoisis.add(lettreUtilisateur);

            String lettreMachine = SaisieUtilisateur.saisieConsVoyRobot();
            lettreChoisis.add(lettreMachine);


        }
        System.out.println(lettreChoisis);

        return lettreChoisis;

    }






}
