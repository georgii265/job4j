package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

//public class CalculatorTest {
//    @Test
//    public void whenAddOnePlusOneThenTwo() {
//        Calculator calc = new Calculator();
//        double result = calc.add(1D, 1D);
//        double expected = 2D;
//        assertThat(result, is(expected));
//    }
//
//    @Test
//    public void whenSubstractOneMinusOneThenZero() {
//        Calculator calc = new Calculator();
//        double result = calc.subtract(1D, 1D);
//        double expected = 0D;
//        assertThat(result, is(expected));
//    }
//
//    @Test
//    public void whenDivOneDivisionOneThenZero() {
//        Calculator calc = new Calculator();
//        double result = calc.div(10D, 2D);
//        double expected = 5D;
//        assertThat(result, is(expected));
//    }
//
//    @Test
//    public void whenMultipleTwoMultiplicationOneThenTwo() {
//        Calculator calc = new Calculator();
//        double result = calc.multiple(2D, 1D);
//        double expected = 2D;
//        assertThat(result, is(expected));
//    }
//}