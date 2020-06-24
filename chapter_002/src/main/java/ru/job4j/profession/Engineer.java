package ru.job4j.profession;

public class Engineer extends Profession {

    private String qualification;
    private String education;
    private int serviceCost;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.qualification = qualification;
        this.education = education;
        this.serviceCost = serviceCost;
    }

    public String getQualification() {
        return qualification;
    }

    public String getEducation() {
        return education;
    }

    public int getServiceCost() {
        return serviceCost;
    }
}