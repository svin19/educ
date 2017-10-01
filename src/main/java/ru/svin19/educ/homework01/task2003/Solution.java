package ru.svin19.educ.homework01.task2003;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            int re = scanner.nextInt();
            if (i % 2 == 1) {
                sum = sum + re;
            } else {
                sum = sum - re;
            }
        }
        System.out.println(sum);
    }
}
