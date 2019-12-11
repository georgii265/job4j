package ru.job4j.pojo;
import java.util.Date;
/**
 * Создайте модель данных - Студент. ru.job4j.pojo.Student.
 * В модели должны быть поля: ФИО, группа, дата поступления.
 * Сгенерируйте аксессоры для этих полей.
 */
public class Student {
    private String fullName;
    private String group;
    private String receiptDate;
    private Date created;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}