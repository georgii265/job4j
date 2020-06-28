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
     * Одновременно объявляем переменную и определяем массив.
     * Если массив создаётся таким образом, то всем элементам массива автоматически присваиваются значения по умолчанию.
     * Например, для числовых значений начальное значение будет 0.
     * В нашем примере мы создали массив из 100 элементов типа Item и присвоили его ранее объявленной переменной items.
     * final в этом случае означает что нельзя изменить ссылку на данный объект.
     * При создании массива с помощью ключевого слова new, все элементы массива автоматически инициализированы нулевыми значениями.
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     * Для того, чтобы присвоить элементам массива свои начальные значения,
     * необходимо провести его инициализацию. Инициализацию можно проводить как поэлементно так и с помощью цикла,
     * например:for(int index = 0;index < position; index++){ items[index] = position }
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     *             Метод public Item add(Item item) добавляет заявку, переданную в аргументах в массив заявок this.items;
     *             В методе add нужно проставить уникальный ключ в объект Item item. Это нужно сделать через метод setId.
     *             Уникальный ключ нужно генерировать на основании времени и произвольного числа - item.setId(this.generateId());
     *             В качестве ключа нельзя использовать индекс от массива.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод на получение списка всех заявок - public Item[] findAll();
     * Метод public Item[] findAll() возвращает копию массива this.items без null элементов (без пустых клеток).
     * Метод findAll можно записать в одно строку return Arrays.copyOf(items, position);
     * Сделать так мы можем, потому что у нас элементы хранятся только до position, с position у нас хранятся только null.
     * Соответственно, нам достаточно скопировать заполненный кусок массива
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод на получение списка по имени - public Item[] findByName(String key)
     * Метод public Item[] findByName(String key) проверяет в цикле все элементы массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.
     * Алгоритм этого метода аналогичен методу findAll.
     * Метод findByName можно реализовать так. Создать массив размера position.
     * Записать в него элементы которые удолетворяют условию items[i].getName().equals(key).
     * Записать можно просто result[count++] = items[i];
     * count мы считаем чтобы обрезать массив, т.е. оставить его без null элементов по аналогии с пунктом 1,
     * а также чтобы записывать значения в массив
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int count = 0;
        for (int index = 0; index < position; index++) {
            if (items[index].getName().equals(key)) {
                result[count++] = items[index];
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Метод на получение заявки по id - public Item findById(String id)
     * Метод public Item findById(String id) проверяет в цикле все элементы массива this.items,
     * сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.
     * Помните, что для сравнения строк мы должны использовать метод equals() например:
     * item.getId().equals(tmp.getId()). Сравнивать через == нельзя.
     */
    public Item findById(String id) {
        int index = indexOf(id);
        if (index != -1) {
            return items[index];
        }
        return null;
    }

    /**
     * 1. Найти индекс ячейки по id.
     * 2. Проставить id с item. При замене нужно сохранять старый id.
     * 3. Записать в ячейку с найденным индекс объект item. Это входящий параметр.
     *
     * @return
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        if (index != -1) {
            items[index] = item;
            return true;
        }
        return false;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, items.length - index - 1);
            position--;
        }
        return true;
    }

    /**
     * Метод возвращает index по id.
     * Метод indexOf объявлен как private, потому что он используется только внутри системы.
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}



