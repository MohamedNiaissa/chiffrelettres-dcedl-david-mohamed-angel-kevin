package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Verification {

    public static boolean verificateurReponseMot(ArrayList<String> tab,ArrayList<String> tablettre ,String mot){

        ArrayList<Character> listeDecouperMot = new ArrayList<>();
        ArrayList<String> listeDecouperMotString = new ArrayList<>();
        int compteur = 0;

        for (int i = 0; i < tab.size() ; i++) {
            if(tab.get(i).toLowerCase().equals(mot)){

               System.out.println("Même mot !");

                for (int j = 0; j < mot.length(); j++) {

                    listeDecouperMot.add(mot.charAt(j));

                }

                for (int h = 0; h < listeDecouperMot.size(); h++) {
                   String str = Character.toString(listeDecouperMot.get(h));
                   listeDecouperMotString.add(str);

                }

                System.out.println("Listelettre = " + tablettre);

                System.out.println("ListeDecouperMot =" + listeDecouperMot);


                for (int k = 0; k < listeDecouperMot.size(); k++) {

                    for (int j = 0; j < tablettre.size(); j++) {
                        //System.out.println("avant condition");

                        System.out.println("listedecoupermot= "+ listeDecouperMot.get(k));
                        System.out.println("listelettre= "+ tablettre.get(j));

                        if (listeDecouperMotString.get(k).equals(tablettre.get(j))){
                            System.out.println("Compare lettre hasard et lettre mot utilisateur ");
                            compteur++;
                            tablettre.remove(j);
                            break;

                        }
                    }
                }

                System.out.println("compteur = " + compteur);

                if (compteur == mot.length()){
                    System.out.println("Vrai mot");
                    return true;
                } else {
                    System.out.println("Faux mot");
                    return false;
                }

            }

        }


        return true;

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
