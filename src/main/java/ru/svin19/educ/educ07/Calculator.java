package ru.svin19.educ.educ07;
@Cache
public interface Calculator {
    @Cache()
    public double calc (double v,long t);
    public double calc2 (double v);
    public double calc3 (double v);
}
