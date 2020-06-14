package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;


public class TriangleTest {

    /* Создаем три объекта класса Point.
     * Создаем объект треугольник и передаем в него объекты точек.
     * Вычисляем площадь.
     * Задаем ожидаемый результат.
     * Проверяем результат и ожидаемое значение.
     */

    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point first = new Point(1,2,3);// ниполучается реализовать то ,что он от меня просит
        first.info();
        Point second = new Point(1,2,4);
        second.info();
        Point third = new Point(1,2,5);
        third.info();
        Triangle triangle = new Triangle(first,second,third);
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 3.0));
    }
}