package ru.job4j.tracker;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.nullValue;


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
    public void whenFindAllOneItemInTheTrackerThenGetOneItem() {
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
    public void whenFindByNameOfTheItemThenFindIt() {
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
    public void whenFindByIdItemThenFindHim() {
        Tracker tracker = new Tracker();
        Item[] items = {new Item("test1")};
        for (Item item : items) {
            tracker.add(item);
        }
        assertThat(tracker.findById(items[0].getId()), is(items[0]));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        // Добавляем заявку в трекер.В объект проинициализирован id.
        tracker.add(bug);
        // Создаем новую заявку "bug".
        String id = bug.getId();
        // Передаем значение поля id с помощью метода getId в bug.
        Item bugWithDesc = new Item("Bug with description");
        // Здесь мы получается добавляем еще одну заявку.В объект проинициализирован id.
        tracker.replace(id, bugWithDesc);
        // Проверяем, что заявка с таким id имеет новое имя "Bug with description".
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}


