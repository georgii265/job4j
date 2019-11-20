package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {

    /* Создаем три объекта класса Point.
     * Создаем объект треугольник и передаем в него объекты точек.
     * Вычисляем площадь.
     * Задаем ожидаемый результат.
     * Проверяем результат и ожидаемое значение.
     */

    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        Triangle triangle = new Triangle(first,second,third);
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 2.0));
    }
}