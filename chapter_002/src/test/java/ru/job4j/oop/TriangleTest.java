package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class TriangleTest {

    /*
     * Создадим три поля с типом Point.
     */

    @Test
    public void point() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        double result = first.distance(second);
        first.info();
        second.info();
        third.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(2D));
    }

    @Test
    public void period() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0.0));
    }

    @Test
    public void area() {
        Point first = new Point(0, 0);
        first.info();
        Point second = new Point(0, 2);
        second.info();
        Point third = new Point(2, 0);
        third.info();
    }
}