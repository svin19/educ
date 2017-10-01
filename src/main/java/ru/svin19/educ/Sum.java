package ru.svin19.educ;

public class Sum {


    public static void sum(String[] args) {
        int x = 2;
        int sum = 0;
        String s = "";

        while (x < 1000000) {
            sum += x;
            x*=2;
        }
        System.out.println(sum);
    }
}
