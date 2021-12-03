package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Type Recherche compte.
 */
public class RechercheCompte{
    static int scoreMachine = 0;
    static int[] operation = new int[5];
    static List<Integer> list = new ArrayList<>();
    static String ope;
    static String sauvegardeope = "";
    static int plusprestrouve = 1000;
    static List<String> opeccorrect = new ArrayList<>();
    static String objectif = 0+"";
    static String pluspres = 1000+"";
    static String valeur = 0+"";

    /**
     * Vérification.
     */
    public static void verification(){
        /**
         * Vérifie que les opérations définit dans la liste opération (Addition,Soustraction,Multiplication,Division) appliqué aux nombres de la liste list puisse atteindre l'objectif
         * Affiche "l'objectif" ou le résultat et résultat le plus proche
         */
        ope = list.get(0) + "";
        valeur = list.get(0) + "";
        sauvegardeope = "";
        for (int i = 1; i < 4; i++) {
            if (operation[i]==1) {
                valeur = parseInt(valeur) + list.get(i)+"";
                ope += "+" +list.get(i) + ")";
                if (valeur.equals(objectif)){
                    sauvegardeope = ope;
                    ope = "";
                    for (int j = 0; j < i; j++) {
                        ope += "(";
                    }
                    ope += sauvegardeope;
                    opeccorrect.add(ope);
                    break;
                }
            } else if (operation[i]==2) {
                if (parseInt(valeur)-list.get(i)<0){
                    break;
                }
                valeur = parseInt(valeur)-list.get(i)+"";
                ope += "-" +list.get(i) + ")";
                if (valeur.equals(objectif)){
                    sauvegardeope = ope;
                    ope = "";
                    for (int j = 0; j < i; j++) {
                        ope += "(";
                    }
                    ope += sauvegardeope;
                    opeccorrect.add(ope);
                    break;
                }
            }else if (operation[i]==3) {
                if (list.get(i).equals(1)||valeur.equals("1")){
                    break;
                }
                valeur = parseInt(valeur)*list.get(i)+"";
                ope += "*" +list.get(i) + ")";
                if (valeur.equals(objectif)){
                    sauvegardeope = ope;
                    ope = "";
                    for (int j = 0; j < i; j++) {
                        ope += "(";
                    }
                    ope += sauvegardeope;
                    opeccorrect.add(ope);
                    break;
                }
            } else {
                if (parseInt(valeur)%list.get(i)!=0){
                    break;
                }
                valeur = parseInt(valeur)/list.get(i)+"";
                ope += "/" +list.get(i) + ")";
                if (valeur.equals(objectif)){
                    sauvegardeope = ope;
                    ope = "";
                    for (int j = 0; j < i; j++) {
                        ope += "(";
                    }
                    ope += sauvegardeope;
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
            plusprestrouve = parseInt(objectif) - parseInt(valeur);
        }
    }

    /**
     * Toute operation.
     */
    public static void touteOperation(){
        /**
         * Génère la liste des opérations élémentaires(Addition,Soustraction,Multiplication,Division) qui seront appliqué aux nombres de la liste list
         */
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

    /**
     * Tout ordre.
     * @param plaquette the plaquette
     * @param recherche the recherche
     */
    public static void toutOrdre(List<Integer> plaquette, String recherche){
        /**
         * Récupère la liste des plaques choisis par l'utilisateur et la machine ou les utilisateurs et renvoi si les nombres fournis permettent d'atteindre l'objectif
         * Renvoie les solutions pour atteindre l'objectif si celui-ci est atteignable
         * Sinon affiche les opérations du résultat plus proche
         */
        list = plaquette;
        objectif = recherche;
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
        if (parseInt(pluspres) == 0) {
            List<String> opecorrectcorrige = new ArrayList<>();
            String correct = opeccorrect.get(0);
            for (int i = 1; i < opeccorrect.size(); i++) {
                boolean pasDeja = true;
                if (!(opeccorrect.get(i).equals(correct))) {
                    for (int j = 0; j < opecorrectcorrige.size(); j++) {
                        if (opecorrectcorrige.get(j).equals(correct)){
                            correct = opeccorrect.get(i);
                            pasDeja = false;
                        }
                    }
                    if (pasDeja) {
                        opecorrectcorrige.add(correct);
                    }
                }
            }
            opecorrectcorrige.add(correct);
            System.out.println("On pouvait atteindre " + (parseInt(objectif)-plusprestrouve) + " comme ceci " + opecorrectcorrige);
            scoreMachine += 10;
        } else {
            System.out.println("La plus proche valeur différait de " + (plusprestrouve*-1));
            System.out.println(parseInt(objectif)-plusprestrouve);
            toutOrdre(list,(parseInt(objectif)-plusprestrouve)+"");
        }
    }
}
