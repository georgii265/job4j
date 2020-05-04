package ru.job4j.poly;

/**
 * implements это ключевое слово, предназначенное для реализации интерфейса (interface).
 * Оба ключевых слова extends и implements используются, когда Вы создаете свой собственный класс на языке Java
 */
public class DbStore implements Store {
    /**
     * String value - возвращаят нам строковое значение из метода extract - store.save("Georgi Morgunov");
     * @param value
     */
    public void save(String value) {

    }

    public String[] load() {
        return new String[] {};
    }
}