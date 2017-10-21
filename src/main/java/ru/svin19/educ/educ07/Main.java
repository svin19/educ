package ru.svin19.educ.educ07;

import static ru.svin19.educ.educ07.Cached.isCached;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = isCached(new HardWorkCalculatorImpl());

        calculator.calc(10,5);
        calculator.calc(7,6);
        calculator.calc(9,8);
        calculator.calc(10,2);
        calculator.calc(24,1);
        calculator.calc(9,9);
    }
}
