package ru.job4j.tracker;

/**
 * Полиморфизм дословно означает много форм.
 * полиморфизм осуществляется за счет элемента interface.
 * Interface  - это элемент, который содержит объявления методов,
 * но не содержит реализации этих методов.
 * Интерфейс будет определять, что должен делать класс, но он не знает как.
 */
public interface Input {
    /**
     * метод, который возвращает введенную строку от пользователя
     * После метода мы сразу ставим точку с запятой, а не начинаем блок кода { }.
     */
    String askStr(String question);

    /**
     *  метод, который будет возвращать от пользователя число, а не строку.
     *
     */
    int askInt(String question);
}