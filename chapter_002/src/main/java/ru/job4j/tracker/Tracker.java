package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
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

    private final List<Item>  items = new ArrayList<>();

    public Item add(Item item) {
        items.add(item);
        item.setId(this.generateId());
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item count : items) {
            if (count.getName().equals(key)) {
                result.add(count);
            }
        }
        return result;
    }


    public Item findById(String id) {
        int index = indexOf(id);
        if (index != -1) {
             items.get(index);
        }
        return null;
    }

   
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        if (index != -1) {
            items.set(index, item);
            return true;
        }
        return false;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
            return true;
        }
        return false;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}



