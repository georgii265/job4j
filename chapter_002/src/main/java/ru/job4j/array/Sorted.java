package ru.job4j.array;

/**
 * Задан числовой массив.
 * Необходимо написать программу, которая проверит, что массив отсортирован по возрастанию.
 * Сортировать массив не нужно!
 */
public class Sorted {

    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}




