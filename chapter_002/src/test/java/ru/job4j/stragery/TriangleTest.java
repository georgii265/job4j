package ru.job4j.stragery;

import org.testng.annotations.Test;


import java.util.BitSet;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("  +  ")
                                .add(" + + ")
                                .add("+   + ")
                                .add("+++++   ")
                                .toString()
                )
        );
    }
}