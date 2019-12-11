package ru.job4j.pojo;
import java.util.Date;
/**
 * Создайте класс ru.job4j.pojo.College с методом main.
 * В методе main создайте объект Student и заполните поля через set.
 * Добавьте вывод на консоль объекта student через методы get.
 * System.lineSeparator()- такой формат я сделал,так как интересней читается(для себя).))))
 */
public class College{
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Morgunov Georgii");
        student.setGroup("job4j");
        student.setReceiptDate("April.");
        student.setCreated(new Date());

        System.out.println(student.getFullName() + System.lineSeparator() + "student from - " + " group "
                + student.getGroup() + " entered " + student.getReceiptDate());
    }
}

