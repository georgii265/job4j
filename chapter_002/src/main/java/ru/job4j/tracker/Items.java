package ru.job4j.tracker;

/**
 * 1. В классе ru.job4j.tracker.Item создайте два поля: String id, String name;
 * 2. Создайте три конструктора: без параметров, с параметром id, с параметрами id и name.
 * 3. Загрузите код в репозиторий. Оставьте ссылку на коммит.
 */
public class Items {

    String id;
    String name;

    public Items() {
    }

    public Items(String id) {
    }

    public Items(String id, String name) {
    }

    public static void main(String[] args) {
        Items items = new Items();
    }
}
