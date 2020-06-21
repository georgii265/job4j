package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMaxFo2Numbers() {
        Max max = new Max();
        double result = max.add(1, 2);
        assertThat(result, is(3.0));
    }

    @Test
    public void whenMaxFo3Numbers() {
        Max max = new Max();
        double result = max.add(1, 2, 3);
        assertThat(result, is(6.0));
    }

    @Test
    public void whenMaxFo4Numbers() {
        Max max = new Max();
        double result = max.add(1, 2, 3, 4);
        assertThat(result, is(10.0));
    }
}