package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when1400RubleToDollarThen23() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(1200);
        assertThat(result, is(20));
    }

    @Test
    public void when73800RubleToEuroThen1054() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(1400);
        assertThat(result, is(20));
    }

    @Test
    public void when73800EuroToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(200);
        assertThat(result, is(14000));
    }

    @Test
    public void when23DollarToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(10);
        assertThat(result, is(670));
    }
}