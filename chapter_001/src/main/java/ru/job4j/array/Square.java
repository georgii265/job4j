package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (i + 1)* (i + 1);
        }

        return rst;
    }
}