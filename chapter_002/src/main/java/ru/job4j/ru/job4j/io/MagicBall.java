package ru.job4j.ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. Создайте класс ru.job4j.io.MagicBall.
 * 2. Создайте в нем метод main.
 * В нем попросите пользователя ввести закрытый вопрос.
 * Это вопрос на который можно ответить либо да, либо нет. Например, "Будет ли завтра дождь?"
 * 3. В методе main должен быть объект Scanner для ввода вопроса от пользователя.
 * 4. Через класс Random сгенерируйте число от 0 до 3.
 * Если ответ равен 0, то на консоль нужно вывести "Да".
 * Если ответ - 1, то на консоль нужно вывести "Нет".
 * Во всех остальных случаях напечатать - "Может быть".
 * Это вопрос - "Будет ли завтра дождь?"
 * класс Random сгенерируйет число от 0 до 3.
 */
public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.print("Да");
        } else if (answer == 2) {
            System.out.print("Нет");
        } else {
            System.out.print("Может быть");
        }
    }
}
