package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
        int max;
        if (left < right)
            max = right;
        else
            max = left;
        return max;
    }
}