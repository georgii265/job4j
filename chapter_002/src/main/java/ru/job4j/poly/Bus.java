package ru.job4j.poly;

public class Bus implements Transport {
    public static void main(String[] args) {

    }

    @Override
    public void go() {
        Bus bus = new Bus();
        bus.go();

    }

    @Override
    public void passengers(int passengers) {
        Bus bus = new Bus();
        bus.passengers(10);

    }

    @Override
    public int fillUp(int fuelbus) {
        Bus bus = new Bus();
        bus.fillUp(50);
        return 20;
    }
}
