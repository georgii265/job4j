package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

   @Override
    public String name() {
        return "--- Edit item ---";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        String id = input.askStr("Enter Id: ");
        Item item = new Item(name);
        tracker.replace(id, item);
        return true;
    }
}


