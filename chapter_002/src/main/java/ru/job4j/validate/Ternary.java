package ru.job4j.validate;

public class Ternary {

    public static void main(String[] args) {
        int i,k;
        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолютное значение");
        System.out.println(i + "  равно " + k);
    }
}
