package com.company;

public class RechercheCompte {
    int verifCompte(int recherche,int[] listePlaque){
        int resultat = 0;
        int i = 6;
        int random1 = (int) (Math.random()*(i));
        int verif1 = listePlaque[random1];
        listePlaque[random1] = -1;
        i--;
        int random2 = (int) (Math.random()*(i));
        int verif2 = listePlaque[random2];
        while (verif2 == -1){
            random2 = (int) (Math.random()*(i));
            verif2 = listePlaque[random2];
        }
        listePlaque[random1] = -1;
        i--;
        int choix = (Math.random()*(i)
        if (verif1-verif2 > 0){
            System.out.println("arret sous");
        } else {
            resultat = verif1-verif2;
        }
        if (verif2-verif1 > 0){
            System.out.println("arret sous");
        } else {
            resultat = verif2-verif1;
        }
        if (verif1 == 1 || verif2 == 1){
            System.out.println("arret mult div");
        } else if (verif1%verif2 != 0){
            System.out.println("arret div");
        } else if (verif2%verif1 != 0) {

        } else {
            resultat = verif2*verif1;
            resultat = verif2/verif1;
            resultat = verif1/verif2;
            resultat = verif1*verif2;
        }
    }
}
