package ru.job4j.tracker;

public class Teacher extends Profession {

    /**
     * Конструктор объекта профессии учителя.
     *
     * @param name Имя учителя.
     */
    public Teacher(String name) {
        super("Андрей","Иванов","Высшее","Апрель");
    }

    /**
     * Обучение студента.
     *
     * @param student Студент.
     */
    public void teache(Student student) {
    }
}