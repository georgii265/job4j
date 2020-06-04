package ru.job4j.ex;

/**
 * java.lang.IllegalArgumentException - метод вызывает с не корректными параметрами.
 *
 * java.lang.IllegalStateException - метод вызывается с объекта в не корректном состоянии.
 *
 * java.lang.NullPointerException - методы вызывается у переменной, которая инициализирована null ссылкой.
 *
 */
    public class Fact {

        public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less then 0");
        }
        int rsl = 1;
        for (int index = 1; index != n; index++) {
            rsl += index;
        }
        return rsl;
    }
}

