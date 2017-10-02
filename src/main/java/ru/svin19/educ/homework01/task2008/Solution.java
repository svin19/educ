package ru.svin19.educ.homework01.task2008;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargoMaxCount = scanner.nextInt();
        int truckCapacity = scanner.nextInt();
        int cargoCount = 0;
        int truckCharge = 0;
        for (int i = 1; i <= cargoMaxCount; i++) {
            int iCargoCharge = scanner.nextInt();
            if (truckCharge + iCargoCharge <= truckCapacity) {
                truckCharge += iCargoCharge;
                cargoCount++;
            }
        }
        System.out.println(cargoCount + " " + truckCharge);
    }
}
