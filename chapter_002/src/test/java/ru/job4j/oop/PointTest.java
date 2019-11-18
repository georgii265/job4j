package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }
//public class PointTest {
    //@Test
    //public void whenZeroAndTenThenTen() {
        //Point point = new Point(0, 0);
        //double result = point.distance(0, 0, 0, 10);
        //assertThat(result, is(10D));
   // }
    @Test
    public void whenCheckItself() {
        //так я добавил тест, который считает расстояния до себя.
        //point.distance(point); - очевидно, что расстояние будет 0.
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    @Test
    public void whenShowInfo() {
        //Давайте в тесте создадим два объекта класса Point.
        //Из класса мы создали два объекта с разными начальными состояниями.
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }
}