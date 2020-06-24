package ru.job4j.max;

public class LowArrayApp { //пользователь инструмента

    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int nElem = 0;
        int j;
        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 88);
        arr.setElem(4, 22);
        arr.setElem(5, 66);
        arr.setElem(6, 33);
        arr.setElem(7, 11);
        arr.setElem(8, 55);
        arr.setElem(9, 65);
        nElem = 10;

        for (j = 0; j < nElem; j++) { //вывод элементов
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println();

        int searchKey = 26; //поиск элемента
        for (j = 0; j < nElem; j++) {
            if (arr.getElem(j) == searchKey) {
                System.out.println("Found " + searchKey);
            } else if (j != nElem) {
                System.out.println("Can't find " + searchKey);
            }
            break;
        }
        for (j = 0; j < nElem; j++) { //удаление элемента
            if (arr.getElem(j) == 55) {
                for (int k = j; k < nElem; k++) {
                    arr.setElem(k, arr.getElem(k + 1));
                    nElem--;
                }
            }
        }
            for (j = 0; j < nElem; j++) { //вывод оставшихся элементов
                System.out.print(arr.getElem(j) + " ");
            }
        }
    }




