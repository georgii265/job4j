package ru.job4j.tracker;

/**
 * Давайте создадим класс, который будет использовать этот интерфейс.
 * implements Input - эта строчка заставляет нас в классе StubInput создать те же методы,
 * что и в интерфейсе Input и добавить в них реализацию.
 * Как мы видим здесь мы должны написать тело метода {} и добавить какой-то код.
 */
public class StubInput implements Input {
    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
