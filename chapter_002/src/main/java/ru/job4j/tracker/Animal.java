package ru.job4j.tracker;

public class Animal {
    /*
     * 2. Перегрузка конструктора. [#173890]
     * Вернитесь к заданию про конструкторы по умолчанию и добавьте в базовый класс Animal поле String name,
     * которое должно инициализироваться через конструктор.
     * Поправьте классы наследники, чтобы весь код после изменений был корректным.
     */
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}