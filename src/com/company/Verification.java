package com.company;
import java.util.ArrayList;

public class Verification {

    static int scoreJoueur1 = 0;
    static int scoreJoueur2 = 0;

    public static boolean verificateurReponseMot(ArrayList<String> tab,ArrayList<String> tablettre ,String mot) {

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


                if(compteur == mot.length()){
                    System.out.println("Vrai mot");
                    return true;
                }else {
                    System.out.println("Faux mot");
                    return false;
                }

            }
        }
        if (compteur == mot.length()) {
            return true;
        } else {
            return false;
        }


        return true;

    }

    public static int jouerGagnantMancheLettre(String motUtilisateur1, String motUtilisateur2){

        if (motUtilisateur2.length() > motUtilisateur1.length()){
            System.out.println("L'IA gagne avec le mot " + motUtilisateur2);
            return scoreJoueur2++;
        }else if (motUtilisateur2.length() < motUtilisateur1.length()){
            System.out.println("Vous gagnez avec le mot " + motUtilisateur1);
            return scoreJoueur1++;
        }else {
            System.out.println("egalite entre les deux joueurs");
            return 0;
        }


    }



}
