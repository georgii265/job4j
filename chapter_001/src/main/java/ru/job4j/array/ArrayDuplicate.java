package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int dupl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - dupl; ) {
                if (array[i].equals(array[j])) {
                    array[j] = array[array.length - dupl - 1];
                    array[array.length - dupl - 1] = "duplicate";
                    dupl++;
                } else {
                    j++;
                }
            }
        }
        return Arrays.copyOf(array, array.length - dupl);
    }
}