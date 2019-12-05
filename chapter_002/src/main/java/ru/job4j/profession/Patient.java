package ru.job4j.profession;

public class Patient {
    private String name;

    /**
     * Конструктор объекта пациент.
     *
     * @param name Имя пациента.
     */
    public Patient(String name) {
        this.name = name;
    }

    /**
     * Получение имени пациента.
     *
     * @return Имя пациента.
     */
    public String getName() {
        return name;
    }
}