package com.company;
import java.util.ArrayList;
import java.util.List;

/**
 * Type Verification.
 */
public class Verification {
    static int scoreJoueur1 = 0;
    static int scoreJoueur2 = 0;

    /**
     * Verificateur réponse mot boolean.
     *
     * @param tab       un tab
     * @param tablettre un tablettre
     * @param mot       un mot
     * @return un boolean
     */
    public static boolean verificateurReponseMot(ArrayList<String> tab,ArrayList<String> tablettre ,String mot){
        /**
         *
         */

        ArrayList<Character> listeDecouperMot = new ArrayList<>();
        ArrayList<String> listeDecouperMotString = new ArrayList<>();
        int compteur = 0;

        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i).toLowerCase().equals(mot)) {

                for (int j = 0; j < mot.length(); j++) {
                    listeDecouperMot.add(mot.charAt(j));
                }

                for (int h = 0; h < listeDecouperMot.size(); h++) {
                    String str = Character.toString(listeDecouperMot.get(h));
                    listeDecouperMotString.add(str);
                }

                for (int k = 0; k < listeDecouperMot.size(); k++) {
                    for (int j = 0; j < tablettre.size(); j++) {
                        if (listeDecouperMotString.get(k).equals(tablettre.get(j))) {
                            compteur++;
                            tablettre.remove(j);
                            break;
                        }
                    }
                }

                if (compteur == mot.length()) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        if (compteur == mot.length()) {
            return true;
        } else {
            return false;
        }
    }
    public static int jouerGagnantMancheLettre(String motUtilisateur1, String motUtilisateur2){
        if (motUtilisateur2.length() > motUtilisateur1.length()){
            System.out.println("L'IA gagne avec le mot " + motUtilisateur2);
            return scoreJoueur2++;
        } else if (motUtilisateur2.length() < motUtilisateur1.length()){
            System.out.println("Vous gagnez avec le mot " + motUtilisateur1);
            return scoreJoueur1++;
        } else {
            System.out.println("Joueur et IA sont à égalité");
            return 0;
        }
    }
    public static boolean verificateurReponseCalcul(List<Integer> plaquette, String proposition){
        List<String> verif = new ArrayList<>();
        for (int i = 0; i < proposition.length(); i++) {
            if (proposition.length()-i-2 > 0) {
                String test100 = "" + proposition.charAt(i) + proposition.charAt(i + 1) + proposition.charAt(i + 2);
                if  (test100.equals("100")){
                    verif.add(test100);
                    i++;
                    i++;
                    continue;
                }
            }
            if (proposition.length()-i-1 > 0) {
                String testdizaine = "" + proposition.charAt(i) + proposition.charAt(i + 1);
                if (testdizaine.equals("25") || testdizaine.equals("50") || testdizaine.equals("75") || testdizaine.equals("10")) {
                    verif.add(proposition.charAt(i) + "" + proposition.charAt(i + 1));
                    i++;
                    continue;
                }
            }
            if (Character.toString(proposition.charAt(i)).matches("[0-9]")) {
                verif.add(Character.toString(proposition.charAt(i)));
            }
        }
        int resultat = Integer.parseInt((verif.get(0)));
        int selection = 1;
        for (int i = 1; i < proposition.length(); i++) {
            if (Character.toString(proposition.charAt(i)).equals("+")){
                resultat += Integer.parseInt((verif.get(selection)));
                selection++;
            }
            if (Character.toString(proposition.charAt(i)).equals("-")){
                resultat -= Integer.parseInt((verif.get(selection)));
                selection++;
            }
            if (Character.toString(proposition.charAt(i)).equals("*")){
                resultat *= Integer.parseInt((verif.get(selection)));
                selection++;
            }
            if (Character.toString(proposition.charAt(i)).equals("/")){
                resultat /= Integer.parseInt((verif.get(selection)));
                selection++;
            }
        }
        System.out.println(resultat);
        for (int i = 0; i < plaquette.size(); i++) {
            for (int j = 0; j < verif.size(); j++) {
                if ((plaquette.get(i)+"").contains(verif.get(j)+"")){
                    verif.remove(j);
                    plaquette.remove(i);
                    i = 0;
                    break;
                }
            }
        }
        if (verif.size()==0){
            return true;
        } else {
            return false;
        }
    }
}