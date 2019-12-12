package ru.job4j.pojo;

/**
 * Создайте класс ru.job4j.pojo.Library и в нем метод main.
 * В методе main создайте 4 объекта Book. Добавьте их в массив.
 * Сделайте одну книгу с именем "Clean code".
 */
public class Library {
    public static void main(String[] args) {
        Book Head_First_Java = new Book("Head First Java", 257);
        Book HTML = new Book("HTML", 159);
        Book CSS = new Book("CSS", 320);
        Book Clean_code = new Book("Clean code", 264);

        Book[] books = new Book[4];

        books[0] = Head_First_Java;
        books[1] = HTML;
        books[2] = CSS;
        books[3] = Clean_code;

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
        Book clean_code = new Book("Clean code", 264);
        books[0] = clean_code;


        Book head_first_java = new Book("Head First Java",  257);
        books[3] = head_first_java;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + "page" + ": " + bk.getCount());
        }

        /**
         * Добавьте цикл с выводом книги с именем "Clean code".
         */

        System.out.println("Добавил цикл с выводом книги с именем : " + System.lineSeparator() +
                "Clean code" + " - " + "page: 264");
        for (int index = 4; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getCount() > 4) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}

