package ru.job4j.array;

/**
 * @author Georgii Morgunov (georgii.morgunov@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class BubbleSort { //Необходимо создать класс BubbleSort.
    public int[] sort(int[] array) { //В классе BubbleSort написать метод public int[] sort(int[] array).
        for (int i = array.length - 1; i > 0; i--) { //Метод должен сортировать массив целых чисел,
            // используя алгоритм сортировки пузырьком.
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int result;
                    result = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = result;
                }
            }
        }
        return array;
    }
}
