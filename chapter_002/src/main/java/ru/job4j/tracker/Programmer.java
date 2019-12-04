package ru.job4j.tracker;

/*
 * Наследник от класса Engineer.
 * Добавьте новые поля в наследниках и так же методы.
 * Это поля и методы, должны отображать особенность класса.
 */
public class Programmer  extends Engineer{

    private String developer;// Разработчик
    private String experience;//Стаж
    private int income;//Доход

    public Programmer(String name, String surname, String education, String birthday,String developer,
                      String experience, int income){
        super(name, surname, education, birthday);
        this.developer = developer;
        this.experience = experience;
        this.income = income;
    }

    public String getDeveloper(){
        return developer;
    }

    public String getExperience(){
        return experience;
    }

    public int getIncome(){
        return income;
    }
}
