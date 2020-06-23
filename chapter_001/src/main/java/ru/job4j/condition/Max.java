package ru.job4j.condition;

public class Max {

    public int max(int left, int right) {
        return left < right ? right : left;
    }

    public int max(int first, int second, int third, int fourth) {
        int abv = max(first, second);
        int gde = max(third, fourth);
        return max(abv, gde);
    }
}
