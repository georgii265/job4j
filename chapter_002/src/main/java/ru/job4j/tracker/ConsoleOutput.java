package ru.job4j.tracker;

/**
 * Консольный вывод.
 */
public class ConsoleOutput implements Output {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}

