package com.company;

import java.util.ArrayList;

public class RechercheMotLong {

    public static String motLong(ArrayList<String> tabMots,ArrayList<String> tablettres){

        ArrayList<String> motsValide = new ArrayList<>();

        ArrayList<Character> decoupeMot = new ArrayList<>();


        for (int i = 0; i <tabMots.size() ; i++) {

            for (int k = 0; k < tabMots.get(i).length(); k++) {
                System.out.println("Mot actuel " + tabMots.get(k) );
                decoupeMot.add(tabMots.get(k).charAt(k));

            }
            System.out.println("Tab decouperMot = " +decoupeMot);

            /*for (int j = 0; j < tablettres.size(); j++) {

            }*/

            decoupeMot = new ArrayList<>();
            System.out.println("Tableau vide = " + decoupeMot);
           /* for (int h = 0; h < decoupeMot.size(); h++) {
                decoupeMot.remove(h);
            }*/

        }


return "";
    }

}
