package ru.job4j.tracker;


import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
            boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");//Создать новый предмет.
                System.out.println("Enter name: ");//Введите имя.
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);//Метод добавления заявки в хранилище.
            } else if (select == 1) {
                System.out.println("--- Show all items ---");
                tracker.findAll();//Метод на получение строки в меню.
            } else if (select == 2) {
                System.out.println("--- Edit item ---");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Id: ");
                String id = scanner.nextLine();
                Item item = new Item(name);
                tracker.replace(id, item);//Найходит индекс ячейки по id.
            } else if (select == 3) {
                System.out.println("--- Delete item ---");
                System.out.print("Enter item Id: ");
                String id = scanner.nextLine();
                tracker.delete(id);//Метод удаления строки из меню.
            } else if (select == 4) {
                System.out.println("--- Find item by Id ---");
                System.out.print("Enter item Id: ");
                String id = scanner.nextLine();
                tracker.findById(id);//Метод на получение строки из меню по id.
            } else if (select == 5) {
                System.out.println("--- Find items by name ---");
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                tracker.findByName(name);//Метод на получение строки по имени.
            } else if (select == 6) {
                System.out.println("--- Exit Program ---");
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


