package ru.job4j.pojo;

import java.util.Objects;

/**
 * Создайте класс ru.job4j.pojo.Library и в нем метод main.
 * В методе main создайте 4 объекта Book. Добавьте их в массив.
 * Сделайте одну книгу с именем "Clean code".
 */
public class Library {

    public static void main(String[] args) {
        Book headFirstJava = new Book("Head First Java", 257);
        Book html = new Book("HTML", 159);
        Book css = new Book("CSS", 320);
        Book cleanCode = new Book("Clean code", 264);

        /**
         * Для сравнения ссылочных типов данных на равенство необходимо использовать метод equals.
         */
        System.out.println(Book.equals(headFirstJava, html, css, cleanCode));

        Book[] books = new Book[4];

        books[0] = headFirstJava;
        books[1] = html;
        books[2] = css;
        books[3] = cleanCode;

        /**
         * Выведите содержимое массива на консоль через цикл for + index.
         */
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + "page" + ": " +  bk.getCount());
        }

        /**
         * Переставьте книгу с индексом 0 и 3. Выведите содержимое массива на консоль.
         */
        System.out.println("Replace Head First Java to Clean code : ");
        Book cleanCode1 = new Book("Clean code", 264);
        books[0] = cleanCode1;

        Book headFirstJava1 = new Book("Head First Java",  257);
        books[3] = headFirstJava1;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + "page" + ": " + bk.getCount());
        }

        /**
         * Добавьте цикл с выводом книги с именем "Clean code".
         */
        System.out.println("Добавил цикл с выводом книги с именем : " + System.lineSeparator()
               + "Clean code" + " - " + "page: 264");
        for (int index = 4; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getCount() > 4) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}

