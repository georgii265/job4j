package ru.job4j.tracker;


import java.util.Scanner;

public class StartUI {
    /**
     * обьявляем переменную run =  для хранения(true или false).
     * выполняем цикл пока run = true.
     * вызываем метод ShoMenu().
     * Дальше пользователю нужно ввести пункт меню от 0 до 6.
     * обьявляем строковую переменную типа name,
     * происходит считывание  строки начиная от ранее введенного числа.
     * обьявляем переменную типа Item с именем item и передаем ей параметры name.
     * вызываем из класса Tracker метод add с параметрами item и добавляем новый предмет(item).
     * цикл for each (тип Item и название массива item :название масссива =
     * = т.е. здесь у нас находиться скопированный кусок массива(return Arrays.copyOf(items, position))/коллекции)
     * вызываем метод findAll из класса Tracker для вызова заявки.
     * вызываем метод replace из класса Tracker в котором делаем замену индефикатора и элемента.
     * @param scanner
     * @param tracker
     */
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select:");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name:");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("=== New item ===");
                System.out.println(item);
            } else if (select == 1) {
                System.out.println("=== All items ===");
                for (Item item : tracker.findAll()) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("--- Edit item ---");
                System.out.print("Enter name: ");
                System.out.println("=== Edit item ===");
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Id: ");
                System.out.print("Enter new id: ");
                String id = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("[OK] Task changed");
                    System.out.println(item);
                } else {
                    System.out.println("[Error] Task not found");
                }
            } else if (select == 3) {
                System.out.println("--- Delete item ---");
                System.out.print("Enter item Id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("[OK] Task deleted");
                } else {
                    System.out.println("[Error] Task not found");
                }
            } else if (select == 4) {
                System.out.println("--- Find item by Id ---");
                System.out.print("Enter item Id: ");
                System.out.println("=== Find item by Id ===");
                System.out.print("Enter item id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Task not found");
                }
            } else if (select == 5) {
                System.out.println("--- Find item by name ---");
                System.out.println("=== Find item by name ===");
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                for (Item item : tracker.findByName(name)) {
                    System.out.println(item);
                }
            } else if (select == 6) {
                System.out.println("--- Exit program ---");
                System.out.println("=== Exit program ===");
                run = false;
            }
        }
    }


    /**
     * При запуске метода main в классе StartUI пользователю отображается следующее меню в консоле:
     * За вывод метод отвечает метод: private void showMenu();
     */
    public void showMenu() {
        System.out.println("==== Menu ===");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}



