package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class PointTest {

    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(1, 2, 3);
        Point second = new Point(1, 2,3);
        double result = first.distance3d(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(0.0));
    }

    /*так я добавил тест, который считает расстояния до себя.
     *point.distance(point); - очевидно, что расстояние будет 0.
     */

    @Test
    public void whenCheckItself() {
        Point point = new Point(1,2,3);
        double result = point.distance3d(point);
        assertThat(result, is(0.0));
    }

    /*Давайте в тесте создадим два объекта класса Point.
     *Из класса мы создали два объекта с разными начальными состояниями.
     */

    @Test
    public void whenShowInfo() {
        Point first = new Point(1,2,3);
        first.info();
        Point second = new Point(1,2,3);
        second.info();
    }
}