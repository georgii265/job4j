package ru.job4j.tracker;

public class FindByNameAction implements UserAction {

    @Override
    public String name() {
        return "--- Find item by name ---";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name =  input.askStr("Enter item name: ");
        for (Item item : tracker.findByName(name)) {
            System.out.println(item);
        }
        return true;
    }
}
