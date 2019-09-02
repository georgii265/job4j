package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
     //класс с методом, который вычисляет расстояние по точкам x1 x2 y1 y2.
    //давайте создадим два поля private int x; private int y;
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public double distance(Point that) {
        //Сейчас наш метод принимает четыре координаты x1, x2, y1, y2.
        //Эти координаты теперь содержатся в состоянии объекта Point.
        //Поэтому метод можно переписать следующий образом.
        //Теперь метод distance принимает переменную типа Point.
        //У нас появляются два объекта с состояниями - это текущий объект this и входящая переменная that.
        //У каждого объекта мы можем получить доступ к полям.
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    //public double distance(int x1, int y1, int x2, int y2) {
        //return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    //}

    public void info() {
        //Конструкторы.
        //метод, который вывод значения полей x и y.
        //В каждом классе по умолчанию есть конструктор. Конструктор нужен, чтобы создать объект из класса.
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}