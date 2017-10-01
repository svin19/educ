package ru.dukhanov.educ.homework01.Task2003;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <count; i++) {
            sum = sum + (-1)*i%2 + scanner.nextInt();
        }
        System.out.println(sum);
    }
}
