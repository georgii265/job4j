package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter a = new Counter();
        int result = a.sumByEven(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }
}