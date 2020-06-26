package ru.job4j.max;

import java.util.Scanner;

/**
 * Программа Java, чтобы проверить, является ли число главным или нет.
 * Эта программа принимает число из командной строки и проверяет, является ли оно простым или нет.
 */
public class CheckPrimeNumber {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        System.out.println("Введите число, чтобы проверить, простое ли или нет: ");
        while (number != 0) {
            number = scnr.nextInt();
            System.out.printf("Является ли %d простым? %s %s %s %n",number,
                    check(number), checkNumber(number),
                    checkOrNot(number));
        }
    }

    /**
     * Java-метод для проверки, является ли целое число простым или нет.
     * @param number
     * @return
     */
    public static boolean check(int number) {
        int sqrt = (int) Math.sqrt(number) +1;
        boolean prime = true;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // число идеально делится - нет простого числа
                prime =  false;
                break;
            }
        }
        return prime;
    }

    /**
     * Вторая версия метода checkNumber, с улучшением,
     * например, не проверяет деление на четное число, если оно не делится на 2.
     * @param number
     * @return
     */
    public static boolean checkNumber(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Третий способ проверить, является ли число простым или нет.
     * @param num
     * @return
     */
    public static String checkOrNot(int num) {
        if (num < 0) {
            return "not valid"; //недействительно
        }
        if (num == 0 || num == 1) {
            return "not prime"; //не простое
        }
        if (num == 2 || num == 3) {
            return "prime number"; //простое число
        }
        if ((num * num - 1) % 24 == 0) {
            return "prime"; //простое
        } else {
            return "not prime"; //непростое
        }
    }
}

