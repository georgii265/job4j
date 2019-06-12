package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when1400RubleToDollarThen23() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(1400);
        assertThat(result, is(23));
    }

    @Test
    public void when73800RubleToEuroThen1054() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(73800);
        assertThat(result, is(1054));
    }

    @Test
    public void when73800ToEuroToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(73800);
        assertThat(result, is(1));
    }

    @Test
    public void when23DollarToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(23);
        assertThat(result, is(1));
    }
}