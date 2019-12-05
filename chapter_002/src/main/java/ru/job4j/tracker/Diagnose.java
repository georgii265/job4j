package ru.job4j.tracker;

public class Diagnose {
    private Doctor doctor;
    private Patient patient;
    private String description;

    /**
     * Конструктор объекта диагноза.
     *
     * @param doctor      Лечащий доктор.
     * @param patient     Обратившийся пациент.
     * @param description Выставленный диагноз пациента.
     */
    public Diagnose(Doctor doctor, Patient patient, String description) {
        this.doctor = doctor;
        this.patient = patient;
        this.description = description;
    }

    /**
     * Получение лечащего врача.
     *
     * @return Лечащий врач.
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Получение обратившегося больного.
     *
     * @return Пациент.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Метод получения описания диагноза.
     *
     * @return Описание диагноза.
     */
    public String getDescription() {
        return description;
    }
}
