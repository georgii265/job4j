package ru.job4j.profession;


/**
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
    }

    public Profession() {
        }

        /**
         * И метод (get методы на поля (public String getName()))
         * Метод возвращает имя.
         */
        public String getName() {
            return name;
        }

        public String getSurname(){
            return surname;
        }

        public String getEducation(){
            return education;
        }

        public String getBirthday(){
            return birthday;
        }
    }
