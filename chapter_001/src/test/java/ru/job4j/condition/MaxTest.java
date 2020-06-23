package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void max() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMaxFo3NumbersMaxFo4Numbers() {
        Max max = new Max();
        int result = max.max(1, 2, 3,4);
        assertThat(result, is(4));
    }
}