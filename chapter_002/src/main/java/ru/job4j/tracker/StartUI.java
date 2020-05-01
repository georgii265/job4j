package ru.job4j.tracker;


/**
 * Разорвать связь этих классов мы можем через введение интерфейса.
 * Мы уже создали интерфейс ru.job4j.tracker.Input, который отвечает за ввод данных от пользователя.
 * Этим интерфейсом мы и будем заменять Scanner.
 *
 * Порядок действий. Вам нужно выполнить действия описанные ниже.
 * 1. Открыть класс StartUI.
 * 2. Удалить строчку с import java.util.Scanner.
 * 3. Вместо объявленныx переменных Scanner scanner написать Input input.
 * 4. Вместо вызова scanner.nextLine() написать input.askStr(msg), где msg - это сообщение,
 *    которое вы хотели бы вывести пользователю перед его вводом, например "Enter id: ".
 * 5. В методе Start.main мы создаем объект new Scanner.
 * Вместо объекта new Scanner нужно прописать объект реализации интерфейса Input.
 */

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf( input.askStr("Select:"));
            if (select == 0) {
                System.out.println("--- Create a new Item ---");
                String name =  input.askStr("Enter name:");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("--- New item ---");
                System.out.println(item);
            } else if (select == 1) {
                System.out.println("--- All items ---");
                for (Item item : tracker.findAll()) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("--- Edit item ---");
                String name =  input.askStr("Enter name: ");
                String id =  input.askStr("Enter Id: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("[OK] Task changed");
                    System.out.println(item);
                } else {
                    System.out.println("[Error] Task not found");
                }
            } else if (select == 3) {
                System.out.println("--- Delete item ---");
                String id =  input.askStr("Enter item Id: ");
                if (tracker.delete(id)) {
                    System.out.println("[OK] Task deleted");
                } else {
                    System.out.println("[Error] Task not found");
                }
            } else if (select == 4) {
                System.out.println("--- Find item by Id ---");
                String id =  input.askStr("Enter item Id: ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Task not found");
                }
            } else if (select == 5) {
                System.out.println("--- Find item by name ---");
                String name =  input.askStr("Enter item name: ");
                for (Item item : tracker.findByName(name)) {
                    System.out.println(item);
                }
            } else if (select == 6) {
                System.out.println("--- Exit program ---");
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}



