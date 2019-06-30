package ru.job4j.condition;

public class Max {
    /**
     * Method max.
     * Находит максимальное из двух чисел.
     *
     * @param left  - Первое число.
     * @param right - Второе число.
     * @return Значение максимального из двух чисел.
     */
    public int max(int left, int right) {
        return left > right ? left : right;
    }
}