package ru.svin19.educ.educ0.homework01.task2007;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        for (int i = 1; ; i++) {
            if (value % 2 != 0) {
                System.out.println(i - 1);
                return;
            }
            value /= 2;
        }
    }
}
