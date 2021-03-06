package ru.job4j.profession;

/**
 * Наследник от класса Doctor.
 * Добавьте новые поля в наследниках и так же методы.
 * Это поля и методы, должны отображать особенность класса.
 */
public class Surgeon extends Doctor {

    private int numbeSurgeon;
    private String specialization;
    private int kolOperations;

    public Surgeon(String name, String surname, String education, String birthday, int numbeSurgeon,
                   String specialization, int kolOperations) {
        super(name, surname, education, birthday);
        this.numbeSurgeon = numbeSurgeon;
        this.specialization = specialization;
        this.kolOperations = kolOperations;
    }

    public int getNumbeSurgeon() {
        return numbeSurgeon;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getKolOperations() {
        return kolOperations;
    }
}
