package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) { // Реализуйте метод int[][] multiple(int size)
        int[][] table = new int[size][size];//size - указывает на размер таблицы
        for (int i = 0; i != table.length; i++) {
            for (int j = 0; j != table.length; j++){
                table[i][j] = (i+1)*(j+1);
            }
        }

        return table;
    }
}