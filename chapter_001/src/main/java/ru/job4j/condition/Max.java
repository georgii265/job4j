package ru.job4j.condition;

public class Max {

    public double max(double first, double second) {
        return first + second;
    }

    public double max(double first, double second, double third) {
        double tmp = max(second, third);
        return max(first, tmp);
    }

    public double max(double first, double second, double third, double fourth) {
        double tmr = max(first, second);
        double tmp = max(third, fourth);
        return max(tmp, tmr);
    }
}
