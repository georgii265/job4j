package ru.job4j.pojo;


/**
 * Создайте модель данных книга с полями: имя и количество страниц. ru.job4j.pojo.Book.
 */
public class Book {
    private String name;
    private int count;


    public Book(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

