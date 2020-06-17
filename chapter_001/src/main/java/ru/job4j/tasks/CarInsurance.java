package ru.job4j.tasks;

public class CarInsurance extends Insurance {
    public static final int HIGH = 200;

    public int premium(){
        return HIGH;
    }

    public static String category(){
        return "Car Insurance";
    }
}
