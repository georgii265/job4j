package ru.job4j.Duck;

public class FlyWithWings implements FlyBehavior{ //реализация поведения для уток,которые умеют летать.
    public void fly() {
        System.out.println("I'm flying");
    }
}
