package ru.svin19.educ.homework01.Task2004;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int leapYear = 0;
        if (year % 4 == 0 & year % 100 != 0) {
            System.out.println(1);
            return;
        } else {
            if (year % 400 == 0) {
                System.out.println(1);
                return;
            }
            System.out.println(0);
        }
    }
}
