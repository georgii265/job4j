package ru.job4j.ru.job4j.io;

import java.util.Scanner;

/**
 * 1. Создайте класс ru.job4j.io.Matches с методом main.
 * 2. В методе main добавьте цикл. Игра заканчивается, когда игрок забрал последние спички.
 * В цикле нужно проверять количество спичек.
 * 3. Сделайте ввод данных от пользователя.
 * По порядку. Сначала первый игрок вводит число от 1 до 3, потом второй и так далее.
 * Когда игрок ввел цифру, нужно показать сколько спичек осталось на столе.
 * <p>
 * Двое игроков берут по очереди спички со стола.
 * Каждый из игроков может взять одну, две, или три спички.
 * Не взять ни одной нельзя, также как и взять более трех спичек.
 * Выигрывает тот игрок, который брал спички со стола последним.
 */
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int match = 11;
        int igrok = 0;
        while (match > 0) {
            System.out.println("Количество спичек на столе: " + match);
            System.out.print("Выберите количество спичек от 1 до 3: \n");
            int select = Integer.valueOf(input.nextLine());
            igrok++;
            match -= select;
            System.out.println();
        }
        if (igrok % 2 == 0) { //счетчик количества ходов победителя
            System.out.println("first");
        } else {
            System.out.println("second");
        }
        System.out.println();
    }
}
