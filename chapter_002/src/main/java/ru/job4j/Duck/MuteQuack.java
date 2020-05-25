package ru.job4j.Duck;

/**
 * класс MuteQuack который реализует поведение QuackBehavior
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
