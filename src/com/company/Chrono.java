package com.company;

public class Chrono {
    public static void chrono(int seconde) {
        int temps = seconde;

        System.out.println(0 + "...|...10....|...20....|...30....|...40....|...50....|..." + temps);

        for (int i = 0; i < seconde; i++) {
            try {
                Thread.sleep(1000);
                temps--;
                if (i == 0){
                    System.out.print("+");
                } else if (i%10 == 9) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}