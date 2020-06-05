package ru.job4j.ex;

/**
 * 1. Создайте класс ru.job4j.ex.ElementNotFoundException.
 * Класс должен наследоваться от java.lang.Exception.
 */
public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
