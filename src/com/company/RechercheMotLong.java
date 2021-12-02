package com.company;

import java.util.ArrayList;

public class RechercheMotLong {

    public static String motLong(ArrayList<String> tabMots,ArrayList<String> tablettres){

        ArrayList<String> motsValide = new ArrayList<>();
        ArrayList<Character> decoupeMot = new ArrayList<>();

        for (int i = 0; i <tabMots.size() ; i++) {
            for (int k = 0; k < tabMots.get(i).length(); k++) {
                decoupeMot.add(tabMots.get(i).charAt(k));
                System.out.println(decoupeMot);
            }
            System.out.println(decoupeMot);
            decoupeMot = new ArrayList<>();
        }


return "";
    }

}
