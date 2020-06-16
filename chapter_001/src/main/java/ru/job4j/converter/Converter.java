package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары.
     */
    public static int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public static int euroToRuble(int value) {
        return value * 70;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */

    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(70);
        int ruble1 = Converter.euroToRuble(1);
        int dollar = Converter.rubleToDollar(60);
        int ruble = Converter.dollarToRuble(1);
        System.out.println("70 rubles are " + euro + " euro.");
        System.out.println("1 euro are " + ruble1 + " ruble.");
        System.out.println("60 rubles are " + dollar + " dollar.");
        System.out.println("1 dollar are " + ruble + " ruble.");


    }
}