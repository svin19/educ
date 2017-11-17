package ru.svin19.educ.educ10;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (true) {
            }
        });

        t1.start();

        Thread thread = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                System.out.println("End");
                return;
            }
        });
        thread.start();
        thread.interrupt();
    }
}
