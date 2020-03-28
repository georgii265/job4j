package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    /**
     * Создайте класс JSONReport.
     * Он должен наследоваться от TextReport.
     * Переопределите методы generate.
     * Этот метод должен вернуть шаблон в формате JSON.
     * Пример шаблона
     * <p>
     * {
     * <p>
     * name : name,
     * body : body
     * <p>
     * }.
     * Добавьте аннотации @Override.
     */
    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + System.lineSeparator() + name
                + " :" + " name" + "," + System.lineSeparator()
                + "body" + " : " + body + System.lineSeparator()
                + System.lineSeparator() + "}" + ".";
    }
}
