package ru.job4j.profession;

/*
 * Создайте наследников от класса Engineer (Programmer,Builder).
 */
public class Engineer extends Profession{

 private String qualification;//Квалификация
 private String education;//Образование
 private int serviceCost;//Стоимость услуг

  public Engineer(String name, String surname, String education, String birthday){
      super(name, surname, education, birthday);
      this.qualification = qualification;
      this.education = education;
      this.serviceCost = serviceCost;
  }

  public String getQualification(){
      return qualification;
  }

  public String getEducation(){
      return  education;
  }

  public  int getServiceCost(){
      return  serviceCost;
  }
}