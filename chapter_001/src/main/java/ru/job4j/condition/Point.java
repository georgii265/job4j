package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Point (int first, int second, int third, int fourth) {
        this.x1 = first;
        this.x2 = second;
        this.y1 = third;
        this.y2 = fourth;

    }

    public Point(int x1, int y1, int x2) {
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        double rsl = sqrt(pow(x2 - x1, 2) + (pow(y2 - y1, 2)));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }

    public void info() {
    }

    public double distance3d(Point point) {
        return 0;
    }
}
