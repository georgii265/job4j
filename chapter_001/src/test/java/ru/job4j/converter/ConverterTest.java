package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when140RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when73800RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void when70ToEuroToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(20);
        assertThat(result, is(1));
    }

    @Test
    public void when60DollarToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(40);
        assertThat(result, is(1));
    }
}