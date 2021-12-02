package com.company;

public class Times extends Thread {
    public void run() {
        int sec = 15;
        for (int i = sec; i >= 0; i--) {
            try {
                System.out.print("\015"+i);
                Thread.sleep(1000) ;
            }
            catch (InterruptedException e) {
                System.out.println("error");
            }
        }
    }
}
/*
Thread thread = new Thread();
        int sec = 5;
        thread.start();
        if(sec==0){
            for (int i = sec; i >= 0; i--) {
                System.out.print("\015"+i);
                break;
            }
        }
        else{
            boolean off =false;
            if (off){
                String quest = Main.scan.next();
                thread.stop();
            }else{
                for (int i = sec; i >= 0; i--) {
                    System.out.print("\015"+i);
                    thread.sleep(1000);
                }
            }
        }
 */