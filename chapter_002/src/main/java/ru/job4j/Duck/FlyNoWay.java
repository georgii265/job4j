package ru.job4j.Duck;

public class FlyNoWay implements FlyBehavior { //реализация поведения для уток, которые  НЕ ЛЕТАЮТ(например резиновых)
    public void fly() {
        System.out.println(" I can't fly");
    }
}
