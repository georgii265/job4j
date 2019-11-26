package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {

    private int x;

    private int y;

    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     *
     * @param first  координата x
     * @param second координата y
     */
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2) + (Math.pow(that.y - this.y, 2) + (Math.pow(that.z - this.z, 2))));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y, this.z));
    }
}
