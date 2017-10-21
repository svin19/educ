package ru.svin19.educ.educ07;

public class HardWorkCalculatorImpl implements Calculator {
    public double calc(double v,long timeInMills) {
        double result = v+300;
        System.out.println("Calculated:"+result);
        return result;
    }

    public double calc2(double v) {
        return 0;
    }

    public double calc3(double v) {
        return 0;
    }
}
