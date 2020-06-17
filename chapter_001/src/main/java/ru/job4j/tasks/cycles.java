package ru.job4j.tasks;

import java.util.Scanner;

public class cycles {
    public static void main(String[] args) {
        System.out.println("Введите любое положительное число : ");
        Scanner nb = new Scanner(System.in);
        int n = nb.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
           sum = sum + i;
        }
        System.out.println(sum);
    }

}
