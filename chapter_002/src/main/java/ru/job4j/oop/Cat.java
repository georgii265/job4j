package ru.job4j.oop;

public class Cat {

    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    private String food;

    public void show() {
        System.out.println("Cat " + this.name + " ate " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Woof");
        gav.eat("cutlet");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Chernysh");
        black.eat("fish");
        black.show();
    }
}