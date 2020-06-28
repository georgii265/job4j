package ru.job4j.max;

public class ClassDataArray {

    private Person[] a;
    private int nElems;

    public ClassDataArray(int max) {
        a = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName) {
        int j;                       //поиск заданного значения
        for (j = 0; j < nElems; j++)  // для каждого элемента
            if (a[j].getLast().equals(searchName))  // значение найдено?
                break;
        if (j == nElems)  // достигнут последний элемент?
            return null; // да, значение не найдено
        else
            return a[j]; // нет,значение найдено
    }

    // включение записи в массив
    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++; // увеличение размера
    }

    public boolean delete(String searchName) { //удление из массива
        int j;
        for (j = 0; j < nElems; j++) //поиск удаляемого массива
            if (a[j].getLast().equals(searchName))
                break;
        if (j == nElems) //найти не удалось
            return false;
        else //значение найдено
        {
            for (int k = j; k < nElems; k++) //сдвиг последующих элементов
                a[k] = a[k + 1];
            nElems--; // уменьшение размера
            return true;
        }
    }

    public void displayA() { //вывод одержимого массива
        for ( int j = 0; j < nElems; j++) //для каждого элемента
            a[j].displayPerson(); //вывод
    }
}
