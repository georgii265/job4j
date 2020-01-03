package ru.job4j.tracker;

import java.util.Objects;

/**
 * Давайте создадим класс модель Item.
 * Item описывают бизнес модель заявки.
 * В нем будут два поля: id (уникальный ключ), name - имя.
 */

public class Item {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}