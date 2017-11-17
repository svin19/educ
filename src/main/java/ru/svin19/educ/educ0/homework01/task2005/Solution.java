package ru.svin19.educ.educ0.homework01.task2005;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int index = 1;
        int value = 10000;
        for (int i = 1; i <= count; i++) {
            int re = scanner.nextInt();
            if (re < value) {
                value = re;
                index = i;
            }
        }
        System.out.println(index);
    }
}
