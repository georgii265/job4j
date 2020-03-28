package ru.job4j.profession;

/**
 * Наследник от класса Engineer.
 * Добавьте новые поля в наследниках и так же методы.
 * Это поля и методы, должны отображать особенность класса.
 */

public class Builder extends Engineer {
    private String type;
    //Тип
    private String characteristic;
    //Характеристика
    private String practice;
    //Практика

    public Builder(String name, String surname, String education, String birthday, String type,
                    String characteristic, String practice) {
        super(name, surname, education, birthday);
        this.type = type;
        this.characteristic = characteristic;
        this.practice = practice;
    }

    public String getType() {
        return type;
    }

     public String getCharacteristic() {
        return  characteristic;
     }

     public String getPractice() {
        return practice;
     }
}

