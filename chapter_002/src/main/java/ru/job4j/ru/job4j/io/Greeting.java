package ru.job4j.ru.job4j.io;

import java.util.Scanner;

/**
 * мы собираемся использовать объект класса Scanner, нам нужно сперва импортировать этот класс.
 * import java.util.Scanner;
 * Сделаем программу которая просит ввести имя и поприветствует нас.
 * Greeting - приветствие.
 * input - вход.
 * nextLine - следующая строка.
 *
 * нужно создать объект Scanner.
 * Он принимает в качестве параметра объект "System.in".
 *         Scanner input = new Scanner(System.in);
 *         System.out.print("Добро пожаловать. Как Вас зовут? ");
 * У объекта Scanner есть метод nextLine(),
 * который считывает все символы строки после нажатия на клавишу Enter.
 * После того, как пользователь нажал кнопку Enter,
 * программа записывает введенные символы в переменную и продолжает выполнение программы.
 *         String name = input.nextLine();
 *         System.out.println(name + ", рад Вас видеть!");
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать. Как Вас зовут? ");
        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть!");
    }
}