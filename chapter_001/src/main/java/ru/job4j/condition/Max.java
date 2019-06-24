package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
        int max;
        max = left < 0 ? -right : right;
        return max;
    }
}