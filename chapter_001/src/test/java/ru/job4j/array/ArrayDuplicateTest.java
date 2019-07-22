package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ArrayDuplicateTest {

    @Test
    public void whenArrayWithDuplicateThenUniqueArray() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] arr = {"Привет", "Мир", "Привет", "Мир", "Супер", "Привет", "Супер", "Привет"};
        final String[] res = arrayDuplicate.remove(arr);
        final String[] exp = {"Привет", "Мир", "Супер"};
        assertThat(res, is(exp));
    }
}





