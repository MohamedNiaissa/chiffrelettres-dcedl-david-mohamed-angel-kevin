package com.company;

import java.util.ArrayList;

public class RechercheMotLong {

    public static String motLong(ArrayList<String> tabMots,ArrayList<String> tabLettres){

        int compteur = 0;

        ArrayList<String> motsValide = new ArrayList<>();

        ArrayList<Character> decoupeMot = new ArrayList<>();
        ArrayList<String> decoupeMotString = new ArrayList<>();

        boolean boolA = false;
        boolean boolB = false;

        ArrayList<String> tabLettresclone = new ArrayList<>();


        for (int i = 0; i <tabMots.size() ; i++) {


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

                        //System.out.println("Je suis egal");
                        compteur++;
                        tabLettresclone.remove(l);
                        //System.out.println("_________________________________Lettre pareil :" + tabMots.get(i) + "  =  "+ decoupeMotString.get(j) + "_______________________________");
                        boolA = true;
                        break;

                    }else {

                        boolA = false;
                        boolB = true;

                    }


                }



            }
            //System.out.println("compteur "+ tabMots.get(i) +  " ---> " + compteur);
            if (boolA && compteur == decoupeMotString.size()){
                //System.out.println("ajout dans liste ");
                motsValide.add(tabMots.get(i));
            }
            decoupeMot = new ArrayList<>();
            decoupeMotString = new ArrayList<>();

            boolA = false;
            compteur = 0;
            System.out.println("liste mot valide = " + motsValide);

        }



        return "";
    }

}
