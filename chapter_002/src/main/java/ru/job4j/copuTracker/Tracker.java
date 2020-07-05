package ru.job4j.copuTracker;

import java.util.Arrays;

/**
 * В классе Tracker должны быть методы:
 * добавление заявок - public Item add(Item item);
 * получение списка всех заявок - public Item[] findAll();
 * получение списка по имени - public Item[] findByName(String key);
 * получение заявки по id - public Item findById(int id);
 *
 */
public class Tracker {

    private final Item[] items = new Item[100];
    private int ids = 1; //Поле ids используется для генерации нового ключа.
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++); //уникальный ключ в объектe Item item
        items[size++] = item; //добавляет заявку,переданную в массив заявок items
        return item;
    }

    /**
     * Перебирать все 100 элементов не нужно. У нас есть поле size. Это поле и есть размер нового массива.
     * Чтобы получить новый массив, нужно использовать метод Arrays.copyOf.
     * Этот метод принимает два параметра: массив элементов и новый размер.
     * @return
     */
    public Item[] findAll() {
        return Arrays.copyOf(items,size);
    }

    /**
     * Проверяет в цикле все элементы массива items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.
     * Алгоритм этого метода аналогичен методу findAll.
     * @param key
     * @return
     */
    public Item[] findByName(String key) {
        Item[] items = new Item[size];
        int size = 0;
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                items[size++] = items[index];
            }
        }
        return Arrays.copyOf(items, size);
    }

    public  Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
