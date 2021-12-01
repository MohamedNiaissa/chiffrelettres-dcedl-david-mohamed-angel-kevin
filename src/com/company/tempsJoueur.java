package com.company;

import java.util.*;

public class tempsJoueur {


    public static boolean tempsJoueurReponseLettre(){

        try {

        String str ="";

        final boolean[] bool = {true};


        TimerTask task = new TimerTask()

        {
            public void run()
            {
                String answer ="";

                if( str.equals("") )
                {
                    System.out.println("Votre temps est écoulé, vous ne gagnez pas de point");
                    //System.exit( 0 );

                    bool[0] = false;
                    answer = "PasDeReponse";

                }
            }
        };



        while (bool[0]) {

            Timer timer = new Timer();
            timer.schedule(task, 10000);

          /*  Scanner sc = new Scanner(System.in);
            String in = sc.nextLine();
*/
            SaisieUtilisateur.tentativeUtilisateur();


            timer.cancel();
        }

    }catch (Exception e){
            System.out.println("ok " + e);
        }

        return true;
        }


}
