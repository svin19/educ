package ru.svin19.educ.educ0.homework01.task2006;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthSm = scanner.nextInt();
        int lengthInSm = lengthSm % 36;
        int lengthInAdd = 0;
        if (lengthInSm % 3 == 2) lengthInAdd = 1;

        System.out.println((lengthSm - lengthSm % 36) / 36 + " " + ((lengthInSm-lengthInSm%3) / 3 + lengthInAdd));
    }
}

