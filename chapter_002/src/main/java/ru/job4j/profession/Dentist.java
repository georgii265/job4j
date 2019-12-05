package ru.job4j.profession;

/**
 * Наследник от класса Doctor.
 * Добавьте новые поля в наследниках и так же методы.
 * Это поля и методы, должны отображать особенность класса.
 */
public class Dentist extends Doctor {

    private int numberDentist;// Номер дантиста
    private String degree;// Ученая степень
    private String workingHours;// Рабочее время

    public Dentist(String name, String surname, String education,
                   String birthday, int numberDentist, String degree, String workingHours) {
        super(name, surname, education, birthday);
        this.numberDentist = numberDentist;
        this.degree = degree;
        this.workingHours = workingHours;
    }

    public int getNumberDentist() {
        return numberDentist;
    }

    public String getDegree() {
        return degree;
    }

    public String getWorkingHours() {
        return workingHours;
    }
}

