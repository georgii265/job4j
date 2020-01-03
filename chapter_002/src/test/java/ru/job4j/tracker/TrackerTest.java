package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    /**
     * Tеst на метод add.
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
     * Test на метод  findAll.
     */
    @Test
    public void (){

    }
    /**
     * Test на метод findByName.
     */
    @Test
    public void (){

    }
    /**
     * Test на метод  findById.
     */
    @Test
    public void (){

    }
}
