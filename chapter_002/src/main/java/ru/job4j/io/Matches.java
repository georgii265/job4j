package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int match = 11;
        int igrok = 0;
        while (match > 0) {
            int igrokName = igrok % 2 + 1;
            System.out.println("Количество спичек на столе: " + match);
            System.out.print("Выберите количество спичек от 1 до 3: \n");
            int select = Integer.valueOf(input.nextLine());
            igrok++;
            match -= select;
            System.out.println(igrokName + " игрок взял " + select + " спичек");
        }
        if (igrok % 2 == 0) {
            System.out.print("Антон");
        } else {
            System.out.print("Иван");
        }
        System.out.print(" победил!");
    }
}
