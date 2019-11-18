package ru.job4j.condition;

public class Point {
    public double distance(int x1, int y1, int x2, int y2) {
        double distance = 10;
        return (distance) ;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}