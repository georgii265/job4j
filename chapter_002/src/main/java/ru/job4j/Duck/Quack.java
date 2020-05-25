package ru.job4j.Duck;

/**
 * класс Quack который реализует поведение QuackBehavior
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
