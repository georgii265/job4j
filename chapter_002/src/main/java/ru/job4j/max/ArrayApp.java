package ru.job4j.max;

public class ArrayApp {

    public static void main(String[] args) {
        long[] arr = new long[100]; //создание массива
        int nElems = 0; //кол-во элементов
        int j;
        arr[0] = 66;
        arr[1] = 77;
        arr[2] = 88;
        arr[3] = 99;
        arr[4] = 44;
        arr[5] = 33;
        arr[6] = 22;
        nElems = 7;
        for (j = 0; j < nElems; j++) {
            System.out.println(arr[j] + " ");
        }

        int searchKey = 65;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                System.out.println("Found :  " + searchKey);
            } else if (j != nElems) {
                System.out.println("Can't find : " + searchKey);
            }
            break;
        }

        int searchKed = 33;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKed) {
                for (int k = j; k < nElems - 1; k++) {
                    arr[k] = arr[k + 1];
                    nElems--;
                    System.out.println("Deleted : " + searchKed);
                }
            }
        }
        for (j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

