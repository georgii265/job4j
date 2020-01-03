package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    /**
     * Tеst на метод add - добавления заявки в хранилище.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    /**
     * Test на метод  findAll - получение списка всех заявок.
     */
    @Test
    public void whenFindAllOneItemInTheTrackerThenGetOneItem(){
        Tracker tracker = new Tracker();
        Item[] items = {new Item("test1")};
        for (Item item : items) {
            tracker.add(item);
        }
        assertThat(tracker.findAll(), is(items));
    }

    /**
     * Test на метод findByName - получение списка по имени .
     */
    @Test
    public void whenFindByNameOfTheItemThenFindIt(){
        Tracker tracker = new Tracker();
        Item[] items = {new Item("test1")};
        for (Item item : items) {
            tracker.add(item);
        }
        Item[] expectedNames = {items[0]};
        assertThat(tracker.findByName("test1"), is(expectedNames));
    }

    /**
     * Test на метод  findById - получение заявки по id.
     */
    @Test
    public void whenFindByIdItemThenFindHim(){
        Tracker tracker = new Tracker();
        Item[] items = { new Item("test1")};
        for (Item item : items) {
            tracker.add(item);
        }
        assertThat(tracker.findById(items[0].getId()), is(items[0]));
    }
}

