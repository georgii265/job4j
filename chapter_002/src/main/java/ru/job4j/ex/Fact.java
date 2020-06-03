package ru.job4j.ex;

/**
 * java.lang.IllegalArgumentException - метод вызывает с не корректными параметрами.
 *
 * java.lang.IllegalStateException - метод вызывается с объекта в не корректном состоянии.
 *
 * java.lang.NullPointerException - методы вызывается у переменной, которая инициализирована null ссылкой.
 *
 * Добавьте проверку входного параметра в метод calc. Если n < 0,
 * то нужно прервать программу с исключением IllegalArgumentException.
 */
    public class Fact {
        public static void main(String[] args) {
            System.out.println("fact : " + calc(3));
        }

        public static int calc(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("input parameter in method calc n < 0");
            }
            int rsl = 1;
            for (int index = 1; index <= n; index++) {
                rsl *= index;
            }
            return rsl;
        }
    }