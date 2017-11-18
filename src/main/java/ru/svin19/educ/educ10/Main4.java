package ru.svin19.educ.educ10;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        new Producer().start();
        new Consumer().start();
    }

    private static class Producer extends Thread {
        @Override
        public void run() {
            int x = 0;
            while (true) {
                synchronized (list) {
                    if (list.size() < 100) {
                        list.add(++x);
                        list.notify();
                        if (list.size() > 100) {
                            try {
                                list.wait();
                            } catch (InterruptedException e) {

                            }
                        }
                    }
                }
            }
        }
    }

    private static class Consumer extends Thread {
        @Override
        public void run() {
            int x = 0;
            while (true) {
                synchronized (list) {
                    while (list.isEmpty()) {
                        try {
                            list.wait();
                        } catch (InterruptedException e) {

                        }
                    }
                    Integer result;
                    synchronized (list){
                        result = list.remove(0);
                        try {
                            list.wait();
                        }catch (InterruptedException e){}
                    }
                    System.out.println(result);
                }
            }
        }



    }
}


