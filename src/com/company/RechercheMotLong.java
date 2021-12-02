package com.company;

import java.util.ArrayList;

public class RechercheMotLong {

    public static String motLong(ArrayList<String> tabMots,ArrayList<String> tabLettres){

        int compteur = 0;

        ArrayList<String> motsValide = new ArrayList<>();
        ArrayList<Character> decoupeMot = new ArrayList<>();
        ArrayList<String> decoupeMotString = new ArrayList<>();


        for (int i = 0; i <tabMots.size() ; i++) {
            ArrayList<String> tabLettresclone = new ArrayList<>();


            for (int k = 0; k < tabMots.get(i).length(); k++) {

                decoupeMot.add(tabMots.get(i).toLowerCase().charAt(k));

            }


            for (int h = 0; h < decoupeMot.size(); h++) {
                String str = Character.toString(decoupeMot.get(h));
                decoupeMotString.add(str);
            }


            for (int h = 0; h < tabLettres.size(); h++) {
                tabLettresclone.add(tabLettres.get(h));

            }
            for (int j = 0; j < decoupeMotString.size(); j++) {

                for (int l = 0; l < tabLettresclone.size() ; l++) {

                    if (decoupeMotString.get(j).equals(tabLettresclone.get(l))){

                        compteur++;
                        tabLettresclone.remove(l);
                        break;

                    }

                }

            }
            if (compteur == decoupeMotString.size()){
                motsValide.add(tabMots.get(i));
            }
            decoupeMot = new ArrayList<>();
            decoupeMotString = new ArrayList<>();

            compteur = 0;

        }


        /* Trouver le mot le plus long*/

        String motLePlusLongprovi = "";
        String motLePlusLong = "";

        for (int u = 0; u < motsValide.size(); u++) {

            for (int i = 0; i < motsValide.size()-1; i++) {
                if (motsValide.get(u).length() >= motsValide.get(i).length()){
                    motLePlusLongprovi = motsValide.get(u);
                }else {
                    motLePlusLongprovi = motsValide.get(i);
                }

            }

            if ( motLePlusLong.length() >= motLePlusLongprovi.length()){
                motLePlusLong = motLePlusLong;
            }else {
                motLePlusLong = motLePlusLongprovi;
            }

        }


        return motLePlusLong;

    }

}
