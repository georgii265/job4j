package ru.job4j.Duck;

public class FlyRocketPowered implements FlyBehavior {//определяем новое поведение-реактивный полет.
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
