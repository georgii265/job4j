package ru.job4j.max;

class HighArray {
    private long[] a;                 // ссылка на массив а
    private int nElems;               // количество элементов в массиве

    public HighArray(int max) {       // конструктор
        a = new long[max];            // создание массива
        nElems = 0;                   // пока нет ни одного элемента
    }

    public boolean find(long searchKey) { // поиск заданного значения
        int j;
        for (j = 0; j < nElems; j++)          // для каждого элемента
            if (a[j] == searchKey)        // значение найдено?
                break;                    // да - выход из цикла
        if (j == nElems)                  // достигнут последний элемент?
            return false;                 // yes, can't find it
        else
            return true;                  // no, found it
    }

    public void insert(long value) {      // вставка элементов в массив
        a[nElems] = value;                // собственно вставка
        nElems++;                         // увеличение размера
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)       // поиск заданного значения
            if (value == a[j])
                break;
            if (j == nElems)                  // can't find it
                return false;
                else {                            // found it
                for (int k = j; k < nElems; k++)   // сдвиг последующих элементов
                    a[k] = a[k + 1];
                nElems--;                     // decrement size
                return true;
            }
        }

        public void display() {               // вывод содержимого массива
            for (int j = 0; j < nElems; j++)      // для каждого элемента
                System.out.print(a[j] + " "); // вывод
                System.out.println(" ");
            }
        }





