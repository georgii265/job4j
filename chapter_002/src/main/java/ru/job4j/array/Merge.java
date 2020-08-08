package ru.job4j.array;

/**
 *  Даны два отсортированных по возрастанию массива. Как без сортировки их объединить в третий массив?
 *  новый создать и запихнуть в него элементы по одному
 */
public class Merge {
    public static int[] merge(int[] left, int[] right) {
//        int countL = 0;
//        int countR = 0;
//        int countOfResult = 0;
//        int[] result = new int[left.length + right.length];
//        while (countOfResult < result.length) {
//            if (countL < left.length && countR < right.length) {
//                result[countOfResult++] = left[countL] < right[countR] ? left[countL++] : right[countR++];
//            } else if (countL == left.length && countR < right.length) {
//                result[countOfResult++] = right[countR++];
//            } else if (countR == right.length && countL < left.length) {
//                result[countOfResult++] = left[countL++];
//            }
//        }
//        return result;
//    }
//}
        int[] rsl = new int[left.length + right.length];
        int i = 0; int j = 0; int z = 0;
        while (i < left.length && j < right.length) {
            rsl[z++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            rsl[z++] = left[i++];
        }
        while (j < right.length) {
            rsl[z++] = right[j++];
        }
            return rsl;
    }
}

