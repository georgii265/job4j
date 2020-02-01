package ru.job4j.tracker;

import java.util.Scanner;
public class StartUI {

        public void init(Scanner scanner, Tracker tracker) {
            boolean run = true;
            while (run) {
                this.showMenu();
                System.out.print("Select: "); //Выбрать
                int select = Integer.valueOf(scanner.nextLine());
                if (select == 0) {
                    System.out.println("=== Create a new Item ====");//Создать новый предмет
                    System.out.print("Enter name: ");//Введите имя
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.add(item);
           } else if (select == 1) {
                    //  Добавить остальные действия системы по меню.
                    System.out.println(" 0. Add new Item ");
                } else if (select == 2) {
                    System.out.println("1. Show all items ");
                } else if (select == 3) {
                    System.out.println("2. Edit item  ");
                } else if (select == 4) {
                    System.out.println("3. Delete item ");
                } else if (select == 5) {
                    System.out.println("4. Find item by Id");
                } else if (select == 6) {
                    System.out.println("5. Find items by name ");
                } else if (select == 7) {
                    System.out.println("6. Exit Program ");
                } else {
                    run = false;
                }
            }
        }

    /**
     * При запуске метода main в классе StartUI пользователю отображается следующее меню в консоле:
     * За вывод метод отвечает метод: private void showMenu();
     */
    private void showMenu() {
        System.out.println("Menu.");
        // добавить остальные пункты меню.
        System.out.println("0. Add new Item ");
        System.out.println("1. Show all items ");
        System.out.println("2. Edit item ");
        System.out.println("3. Delete item ");
        System.out.println("4. Find item by Id ");
        System.out.println("5. Find items by name ");
        System.out.println("6. Exit Program ");
        System.out.println(" Select: ");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}

