package ru.svin19.educ.homework01.task2005;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenghSm = scanner.nextInt();
        int lenghFt = (lenghSm - lenghSm%36)/36;
        int lenghIn = (lenghSm%36)%3
        System.out.println(lenghFt);
    }
}
