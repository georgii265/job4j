package ru.job4j.max;

public class LowArray { //инструмент

    private  long[] a; //ссылка на масив

    public LowArray(int size) { //конструктор,создание массива
        a = new long[size];
    }

    public  void setElem(int index, long value) { //запись элемента(sey-устанавливать) или вставлять
        a[index] = value;
    }

    public long getElem(int index) { //чтение элемента(get-получать) или выбирать
        return  a[index];
    }
}
