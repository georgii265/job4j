package ru.job4j.stragery;

import org.testng.annotations.Test;
import java.util.StringJoiner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * @author Georgii Morgunov (georgii.mogunov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class SquareTest {
    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+++++++++")
                                .add("+       +")
                                .add("+       +")
                                .add("+++++++++")
                                .toString()
                )
        );
    }
}