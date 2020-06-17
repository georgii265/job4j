package ru.job4j.tasks;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class hry {
    public static void main(String[] args) {
        Collection c = new HashSet();
        System.out.print(c);
    }
    public static void print(Collection c) {
        System.out.println("Collection");
    }
    public static void print(Set c) {
        System.out.println("Set");
    }
    public static void print(HashSet hs) {
        System.out.println("HashSet");
    }
}
