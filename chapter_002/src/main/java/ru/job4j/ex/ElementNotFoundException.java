package ru.job4j.ex;

/**
 * Создайте класс ru.job4j.ex.ElementNotFoundException - Исключение не найдено.
 * Класс должен наследоваться от java.lang.Exception.
 */
public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}

