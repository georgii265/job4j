package ru.job4j.stragery;

import org.junit.Test;
import java.util.StringJoiner;
import static org.junit.Assert.assertThat;
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
                                .add("    +    ")
                                .add("   + +   ")
                                .add("  +   +  ")
                                .add(" +     + ")
                                .add("+++++++++")
                                .toString()
                )
        );
    }
}


