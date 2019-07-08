package ru.job4j.loop;

public class Counter {

    public int add(int start, int finish ) {
        int result = 0;
        int index;
        for (index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                result = result + index;
            }
        }
        return result;
    }
}