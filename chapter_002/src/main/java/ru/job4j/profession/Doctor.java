package ru.job4j.profession;

/**
 * Создайте наследников от класса Doctor(Surgeon,Dentist).
 * Добавьте новые поля в наследниках и так же методы.
 * Это поля и методы, должны отображать особенность класса.
 * Класс доктор.
 */
public class Doctor extends Profession {

    private String experience;
    // Стаж
    private int salary;
    // Зарплата
    private String category;
    // Категория

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.experience = experience;
        this.salary = salary;
        this.category = category;
    }

    public String getExperience() {
        return experience;
    }

    public int getSalary() {
        return salary;
    }

    public String getCategory() {
        return category;
    }
}