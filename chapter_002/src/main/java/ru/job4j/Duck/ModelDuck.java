package ru.job4j.Duck;

/**
 * создаем новый субкласс.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();//утка приманка изначально летать не умеет.
        quackBehavior = new Quack();
    }
    public void display() {
       System.out.println("I'm a model Duck");
    }
}
