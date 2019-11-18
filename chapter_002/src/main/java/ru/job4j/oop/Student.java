package ru.job4j.oop;

public class Student {
/*
 *Добавьте метод public void song(). Это метод должен выводить на консоль слова "I believe I can fly"
 *В методе main попросите Петю три раза сыграть на баяне и три раза спеть.
*/
    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.song();
        petya.song();
        petya.song();
    }
}