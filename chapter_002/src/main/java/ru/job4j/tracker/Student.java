package ru.job4j.tracker;

public class Student {
    private String name;

    /**
     * Конструктор объекта студента.
     *
     * @param name Имя студента.
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Получение имени студента.
     *
     * @return Имя студента.
     */
    public String getName() {
        return name;
    }
}
