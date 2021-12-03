package com.company;
import java.util.*;

/**
 * Type Temps joueur.
 */
public class TempsJoueur {


    static boolean valUtiliChiffre = false;
    /**
     * Temps joueur reponse lettre string.
     *
     * @return un string
     */
    public static String tempsJoueurReponseLettre(){
        /**
         *
         */
        String valUtilistateur = "";

        try {
            String str ="";
            final boolean[] bool = {true};

            TimerTask task = new TimerTask() {
                public void run() {
                    String answer ="";

                    if ( str.equals("")) {
                        System.out.println("\nVotre temps est écoulé, vous ne gagnez pas de point");
                        //System.exit( 0 );
                        bool[0] = false;
                        answer = "PasDeReponse";
                    }
            }
        };

        while (bool[0]) {
            Timer timer = new Timer();
            timer.schedule(task, 30000);

            valUtilistateur = SaisieUtilisateur.saisitMot();
            timer.cancel();
            System.out.println("Vous avez saisie : " + valUtilistateur);
            return valUtilistateur;
        }

        } catch (Exception e) {
        }

        return "fin";
    }

    public static String tempsJoueurReponseChiffre() {
        String valUtilistateur = "";

        try {
            String str ="";
            final boolean[] bool = {true};

            TimerTask task = new TimerTask() {
                public void run() {
                    String answer ="";

                    if ( str.equals("")) {
                        System.out.println("\nVotre temps est écoulé, vous ne gagnez pas de point");
                        System.out.println("Veuillez entrez une valeur pour continuer");
                        //System.exit( 0 );
                        bool[0] = false;
                        answer = "PasDeReponse";

                    }
                }
            };

            while (bool[0]) {
                Timer timer = new Timer();
                timer.schedule(task, 30000);
                valUtilistateur = SaisieUtilisateur.saisitChiffre();
                timer.cancel();
                System.out.println("Vous avez saisie : " + valUtilistateur);

                return valUtilistateur;
            }

        } catch (Exception e) {
        }

        return "";
    }
}