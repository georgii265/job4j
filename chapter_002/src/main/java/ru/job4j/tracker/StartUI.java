package ru.job4j.tracker;


import java.util.Scanner;

 public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;//обьявляем переменную run =  для хранения(true или false).
        while (run) {//выполняем цикл пока run = true.
            this.showMenu();//вызываем метод ShoMenu().
            System.out.print("Select: ");//Выбрать.
            //Дальше пользователю нужно ввести пункт меню от 0 до 6.
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");//Создать новый предмет
                System.out.print("Enter name: ");//Введите имя
                //обьявляем строковую переменную типа name,
                //происходит считывание  строки начиная от ранее введенного числа.
                String name = scanner.nextLine();
                //обьявляем переменную типа Item с именем item и передаем ей параметры name.
                Item item = new Item(name);
                //вызываем из класса Tracker метод add с параметрами item и добавляем новый предмет(item).
                tracker.add(item);
                System.out.println("=== New item ===");//новый предмет.
                System.out.println("name: " + item.getName() + "id: " + item.getId());
            } else if (select == 1) {
                System.out.println("--- All items ---");//Все детали.
                //вызываем метод findAll из класса Tracker для вызова заявки.
                tracker.findAll();
                System.out.println("=== All items ===");
                //цикл for each (тип Item и название массива item :название масссива =
                // = т.е. здесь у нас находиться скопированный кусок массива(return Arrays.copyOf(items, position))/коллекции)
                for (Item item : tracker.findAll()) {
                    System.out.println("Name: " + item.getName() + " id: " + item.getId());
                }
            } else if (select == 2) {
                System.out.println("--- Edit item ---");//Изменить элемент.
                System.out.print("Enter name: ");
                System.out.println("=== Edit item ===");
                System.out.print("Enter new name: ");//Введите новое имя.
                String name = scanner.nextLine();
                System.out.print("Enter Id: ");
                System.out.print("Enter old id: ");//Введите старый идентификатор.
                String id = scanner.nextLine();
                Item item = new Item(name);
                //вызываем метод replace из класса Tracker в котором делаем замену индефикатора и элемента.
                tracker.replace(id, item);
                if (tracker.replace(id, item)) {
                    System.out.println("[OK] Task changed");//Задача изменена.
                    System.out.println("Name: " + item.getName() + " id: " + item.getId());
                } else {//если мы в водим неправильное имея или индефикатор то выполняется это условие.
                    System.out.println("[Error] Task not found");//Задача не найдена.
                }
            } else if (select == 3) {
                System.out.println("--- Delete item ---");//Удалить пункт.
                System.out.print("Enter item Id: ");//Введите идентификатор предмета.
                System.out.println("=== Delete item ===");
                System.out.print("Enter item id: ");
                String id = scanner.nextLine();
                tracker.delete(id);
                if (tracker.delete(id)) {
                    System.out.println("[OK] Task deleted");
                } else {
                    System.out.println("[Error] Task not found");
                }
            } else if (select == 4) {
                System.out.println("--- Find item by Id ---");//Найти предмет по идентификатору.
                System.out.print("Enter item Id: ");
                System.out.println("=== Find item by Id ===");
                System.out.print("Enter item id: ");
                //обьявляем строковую переменную типа id ,
                //происходит считывание  строки индификатора начиная от ранее введенного индификатора.
                String id = scanner.nextLine();
                //вызываем метод findById из класса Tracker в котором получаем предмет по индификатору.
                tracker.findById(id);
                //переменной item с помощью метода передаем параметры индефикатора.
                Item item = tracker.findById(id);
                //если item неравен null то...
                if (item != null) {
                    System.out.println("name: " + item.getName() + "id: " + item.getId());
                } else {//если равно null то...
                    System.out.println("Task not found");
                }
            } else if (select == 5) {
                System.out.println("--- Find item by name ---");//Найти предмет по имени.
                System.out.println("=== Find item by name ===");
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                tracker.findByName(name);
                for (Item item : tracker.findByName(name)) {
                    System.out.println("Name: " + item.getName() + " id: " + item.getId());
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
        public void showMenu () {
            System.out.println("==== Menu ===");
            System.out.println("0. Add new Item");
            System.out.println("1. Show all items");
            System.out.println("2. Edit item");
            System.out.println("3. Delete item");
            System.out.println("4. Find item by Id");
            System.out.println("5. Find items by name");
            System.out.println("6. Exit Program");
        }


        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            Tracker tracker = new Tracker();
            new StartUI().init(scanner, tracker);
        }
    }



