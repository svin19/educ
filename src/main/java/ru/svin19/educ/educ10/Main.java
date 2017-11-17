package ru.svin19.educ.educ10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static int x = 0;

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();

        for (int a = 0; a < 2; a++) {
            Thread thr1 = new Thread(() -> {
                    for (int i = 0; i < 10000; i++) {
//                        x=x+1;
                        increment();
                    }
            });
            thr1.start();
            threads.add(thr1);
        }

        for (Thread thread : threads){
            thread.join();
        }
        System.out.println("End " + x);
    }

    private synchronized static void increment(){//то же самое down
        x=x+1;
    }
    private static void increment11(){//то же самое up
        synchronized (Main.class) {
            x = x + 1;
        }
    }
    private synchronized void increment2(){
        x=x+1;
    }
    private synchronized void increment3(){
        synchronized (this) {//
            x = x + 1;
        }
    }


}
