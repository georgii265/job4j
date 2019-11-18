package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;


public class TriangleTest {

    /* Создаем объект треугольник.
     * Вычисляем площадь.
     * Задаем ожидаемый результат.
     * Проверяем результат и ожидаемое значение.
     */

    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Triangle triangle = new Triangle();
        double result = triangle.area(0, 0, 0, 2, 2, 0);
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }
}