package ru.job4j.oop;

public class Battery {

    private int value;

    public Battery(int load) {

        this.value = load;
    }

    public void exchange(Battery another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Battery exchange = new Battery(0);
        Battery another = new Battery(10);
        System.out.println("exchange : " + exchange.value + ". another : " + another.value);
        exchange.exchange(another);
    }
}