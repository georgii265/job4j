package ru.job4j.condition;

public class Max {

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        double tmp = add(second, third);
        return add(first, tmp);
    }

    public double add(double first, double second, double third, double fourth) {
        double tmr = add(first, second);
        double tmp = add(third, fourth);
        return add(tmp, tmr);
    }
}
