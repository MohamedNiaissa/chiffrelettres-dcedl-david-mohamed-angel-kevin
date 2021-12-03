package com.company;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Type Recup mots.
 */
public class RecupMots {

    /**
     * Extraire mots array list.
     *
     * @return array list
     */
    public static ArrayList<String> extraireMots(){
        /**
         * Récupère e
         */

        ArrayList<String> listeMots = new ArrayList<>();

        try {
            // Le fichier d'entrée
            File file = new File("src/com/company/liste_francais.txt");
            // Créer l'objet File Reader
            FileReader fr = new FileReader(file);
            // Créer l'objet BufferedReader
            BufferedReader br = new BufferedReader(fr);
            String line;

            while((line = br.readLine()) != null) {
                // ajoute la ligne au buffer
                listeMots.add(line);
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listeMots;
    }
}