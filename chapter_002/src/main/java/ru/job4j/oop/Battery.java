package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int value) {
        this.load = value;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery exchange = new Battery(0);
        Battery another = new Battery(10);
        System.out.println("exchange : " + exchange.load + ". another : " + another.load);
        exchange.exchange(another);
    }
}