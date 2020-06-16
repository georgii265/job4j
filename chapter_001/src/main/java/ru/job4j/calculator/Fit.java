package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public static double manWeight(short height) {
        double weight = (height - 100) * 1.15;
        return weight;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public static double womanWeight(short height) {
        double weight = (height - 110) * 1.15;
        return weight;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight((short)187);
        double woman = Fit.womanWeight((short)162);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 162 is " + woman);
    }
}
