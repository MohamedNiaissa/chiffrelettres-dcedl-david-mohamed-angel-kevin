package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class RechercheCompte{
    static int[] operation = new int[5];
    static List<Integer> list = new ArrayList<>();
    static String ope;
    static List<String> opeccorrect = new ArrayList<>();
    static String objectif = 0+"";
    static String pluspres = 0+"";
    static String valeur = 0+"";
    public static void verification(){
        ope = list.get(0) + "";
        valeur = list.get(0) + "";
        for (int i = 1; i < 4; i++) {
            if (operation[i]==1) {
                valeur = parseInt(valeur) + list.get(i)+"";
                ope += "+" +list.get(i);
                if (valeur.equals(objectif)){
                    opeccorrect.add(ope);
                    break;
                }
            } else if (operation[i]==2) {
                valeur = parseInt(valeur)-list.get(i)+"";
                ope += "-" +list.get(i);
                if (valeur.equals(objectif)){
                    opeccorrect.add(ope);
                    break;
                }
            }else if (operation[i]==3) {
                valeur = parseInt(valeur)*list.get(i)+"";
                ope += "*" +list.get(i);
                if (valeur.equals(objectif)){
                    opeccorrect.add(ope);
                    break;
                }
            } else {
                valeur = parseInt(valeur)/list.get(i)+"";
                ope += "/" +list.get(i);
                if (valeur.equals(objectif)){
                    opeccorrect.add(ope);
                    break;
                }
            }
        }
        int plusProcheTrouve = parseInt(objectif) - parseInt(valeur);
        if (plusProcheTrouve < 0){
            plusProcheTrouve *= -1;
        }
        if (plusProcheTrouve < parseInt(pluspres)){
            pluspres = plusProcheTrouve + "";
        }
    }
    public static void touteOperation(){
        for (int i = 0; i < 4; i++) {
            operation[i] = 0;
        }
        for (int i = 0; i < 4; i++) {
            operation[0]++;
            for (int j = 0; j < 4; j++) {
                operation[1]++;
                for (int k = 0; k < 4; k++) {
                    operation[2]++;
                    for (int l = 0; l < 4; l++) {
                        operation[3]++;
                        for (int m = 0; m < 4; m++) {
                            operation[4]++;
                            verification();
                        }
                        operation[4]=0;
                    }
                    operation[3]=0;
                }
                operation[2]=0;
            }
            operation[1]=0;
        }
    }
    public static void toutOrdre(List<Integer> plaquette, String recherche){
        list = plaquette;
        objectif = recherche;
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                for (int h = 0; h < 6; h++) {
                    int stock = list.get(0);
                    for (int k = 0; k < 5; k++) {
                        list.set(k, list.get(k+1));
                    }
                    list.set(5,stock);
                    touteOperation();
                }
                int stock = list.get(j);
                list.set(j, list.get(j+1));
                list.set(j+1,stock);
            }
        }
        System.out.println(opeccorrect);
    }
}
