package ru.job4j.tracker;


import java.util.Random;
import java.util.Arrays;
/** В классе ru.job4j.tracker.Tracker должны быть методы:
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
     * @return
     */
    public Item[] findAll() {
        Item[] namesPosition = new Item[this.position];
        int position = 0;
        for (int index = 0; index < this.position; index++) {
            if (namesPosition != null) {
                position++;
            }
        }
        namesPosition = Arrays.copyOf(namesPosition, position);
        for (int index = 0; index < namesPosition.length; index++) {
            return new Item[0];
        }

        /**
     * Метод на получение списка по имени - public Item[] findByName(String key)
     * @param key
     * @return
     * Метод public Item[] findByName(String key) проверяет в цикле все элементы массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.
     * Алгоритм этого метода аналогичен методу findAll.
     */
    public Item[] findByName(String key){

    }

    /**
     * Метод на получение заявки по id - public Item findById(String id)
     * @param id
     * @return
     * Метод public Item findById(String id) проверяет в цикле все элементы массива this.items,
     * сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.
     * Помните, что для сравнения строк мы должны использовать метод equals() например:
     * item.getId().equals(tmp.getId()). Сравнивать через == нельзя.
     */
    public Item findById(String id){

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


