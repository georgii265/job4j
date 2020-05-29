package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Давайте мы сделаем новый класс, который реализует интерфейс Input и который внутри будет работать с Scanner.
 * Мы создали объект сканера и указали для него источник данных (строку с текстом - System.in).
 */
public class ConsoleInput implements Input {

        private Scanner scanner = new Scanner(System.in);

        @Override
        public String askStr(String question) {
            System.out.print(question);
            return scanner.nextLine();
        }

        @Override
        public int askInt(String question) {
            return Integer.valueOf(askStr(question));
        }
    }

