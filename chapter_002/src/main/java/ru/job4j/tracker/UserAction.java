package ru.job4j.tracker;

/**
 * Этим интерфейсом можно описать все действия системы.
 *
 */
public interface UserAction {

    String name();
    /**
     * Обратите внимание метод execute возвращает boolean переменная.
     * Это нужно, чтобы создать действия выхода из программы.
     * Если действие вернуло false, то мы считаем, что пользователь вышел из системы.
     */
    boolean execute(Input input, Tracker tracker);

}

