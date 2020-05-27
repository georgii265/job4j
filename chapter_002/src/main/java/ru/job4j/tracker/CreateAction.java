package ru.job4j.tracker;

/**
 * Давайте это сделаем на примере метода createItem, а остальные классы Вы создадите самостоятельно.
 */
public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "--- Create a new Item ---";
    }

    @Override
    public boolean execute(Input input,Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
