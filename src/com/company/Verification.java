package com.company;

import java.util.ArrayList;

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

                if(compteur == mot.length()){
                    System.out.println("Vrai mot");
                    return true;
                }else {
                    System.out.println("Faux mot");
                    return false;
                }

            }

        }


        return true;

    }


}
