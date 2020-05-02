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
    private static Input input;
    private static Tracker tracker;
    private static String id;
    private static String name;
    private static Item item;
    /**
     * Чтобы создать статический метод нам нужно в объявлении метода добавить ключевое слово static.
     * Вызов этого метода происходит через обращение к классу, а не к объекту.
     * @param input
     * @param tracker
     */
    public static void  createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findAllItem(Input input,Tracker tracker) {
        System.out.println("--- All items ---");
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findAll();
        System.out.println(item);
    }

    public static void replaceItem(Input input,Tracker tracker) {
        System.out.println("--- Edit item ---");
        String name =  input.askStr("Enter name: ");
        String id =  input.askStr("Enter Id: ");
        Item item = new Item(name);
        tracker.replace(id,item);
        System.out.println("[OK] Task changed");
        System.out.println(item);
        System.out.println("[Error] Task not found");
    }

    public static void deleteItem(Input input,Tracker tracker) {
        System.out.println("--- Delete item ---");
        String id =  input.askStr("Enter item Id: ");
        tracker.delete(id);
        System.out.println("[OK] Task deleted");
        System.out.println("[Error] Task not found");
    }

    public static void findByIdItem(Input input,Tracker tracker) {
        System.out.println("--- Find item by Id ---");
        String id =  input.askStr("Enter item Id: ");
        tracker.findById(id);
        System.out.println("Task not found");
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        System.out.println("--- Find item by name ---");
        String name =  input.askStr("Enter item name: ");
        tracker.findByName(name);
    }

    /**
     * В классе StartUI есть метод init в котором будет содержится блок из множественного if.
     * Давайте все блоки в условии вынесем в статические методы.
     * @param input
     * @param tracker
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItem(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findByNameItem(input, tracker);
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

    /**
     * Вызов не статического метода. Необходимо обратиться через объект.
     *     new StartUI().init(input, tracker);
     *  Вызов статического метода. Обращаемся через класс.
     *     StartUI.createItem(input, tracker);
     * @param args
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
        StartUI.createItem(input, tracker);
        StartUI.findAllItem(input,tracker);
        StartUI.deleteItem(input, tracker);
        StartUI.replaceItem(input, tracker);
        StartUI.findByIdItem(input, tracker);
        StartUI.findByNameItem(input, tracker);
    }
}



