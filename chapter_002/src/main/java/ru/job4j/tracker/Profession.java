package ru.job4j.tracker;


/*
 * Создайте базовый класс Profession - вынесите туда все общие поля (name, surname, education, birthday)
 * и метод (get методы на поля (public String getName()))
 * Создайте классы Engineer, Doctor, унаследовав их от Profession;
 */
public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;


    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        /*
         * И метод (get методы на поля (public String getName()))
         */
        public String getName () {
            return ;
        }

        public String getSurname () {
            return ;
        }

        public String getEducation () {
            return ;
        }

        public String getBirthday () {
            return ;
        }
    }
}