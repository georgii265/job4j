package ru.job4j.tracker;


import java.util.Random;
import java.util.Arrays;

/**
 * В классе ru.job4j.tracker.Tracker должны быть методы:
 * добавление заявок - public Item add(Item item);
 * получение списка всех заявок - public Item[] findAll();
 * получение списка по имени - public Item[] findByName(String key);
 * получение заявки по id - public Item findById(String id);
 */

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     * Метод public Item add(Item item) добавляет заявку, переданную в аргументах в массив заявок this.items;
     * В методе add нужно проставить уникальный ключ в объект Item item. Это нужно сделать через метод setId.
     * Уникальный ключ нужно генерировать на основании времени и произвольного числа - item.setId(this.generateId());
     * В качестве ключа нельзя использовать индекс от массива.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }
    /**
     *  Метод на получение списка всех заявок - public Item[] findAll();
     *  Метод public Item[] findAll() возвращает копию массива this.items без null элементов (без пустых клеток).
     *  Метод findAll можно записать в одно строку return Arrays.copyOf(items, position);
     *  Сделать так мы можем, потому что у нас элементы хранятся только до position, с position у нас хранятся только null.
     *  Соответственно, нам достаточно скопировать заполненный кусок массива
     */
    public Item[] findAll() {
        return Arrays.copyOf(items,position);
    }

    /**
     * Метод на получение списка по имени - public Item[] findByName(String key)
     * Метод public Item[] findByName(String key) проверяет в цикле все элементы массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.
     * Алгоритм этого метода аналогичен методу findAll.
     *
     *  Метод findByName можно реализовать так. Создать массив размера position.
     * Записать в него элементы которые удолетворяют условию items[i].getName().equals(key).
     * Записать можно просто result[count++] = items[i];
     *  count мы считаем чтобы обрезать массив, т.е. оставить его без null элементов по аналогии с пунктом 1,
     *  а также чтобы записывать значения в массив
     */
    public Item[] findByName(String key){
        //Создаем массив в кол-ве элементов
        //т.к. все элементы могут быть с одиноковыми именем.
        Item[] result = new Item[position];
        int count = 0;
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(key)) {
                result [count++] = items[i];
            }
        }
        //Обрезаем массив, оставляя его без null элементов.
        return Arrays.copyOf(result,count);
    }
    /**
     * Метод на получение заявки по id - public Item findById(String id)
     * Метод public Item findById(String id) проверяет в цикле все элементы массива this.items,
     * сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.
     * Помните, что для сравнения строк мы должны использовать метод equals() например:
     * item.getId().equals(tmp.getId()). Сравнивать через == нельзя.
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < position; i++) {
            if (id.equals(items[i].getId())) {
                result = items[i];
                break;
            }
        }
        return result;
    }

    /**
     * Весь метод replace будет состоять из 3 строчек кода.
     * 1. Найти индекс ячейки по id.
     * 2. Проставить id с item. При замене нужно сохранять старый id.
     * 3. Записать в ячейку с найденным индекс объект item. Это входящий параметр.
     */
    public void replace(String id, Item item) {

    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}

