package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

   @Override
    public String name() {
        return "--- Edit item ---";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter new name: ");
        String id = input.askStr("Enter Id: ");
        Item item = new Item(name);
        tracker.replace(id, item);
        if (tracker.replace(id, item)) {
            System.out.println("[OK] Task changed");
            System.out.println("Name: " + item.getName() + " id: " + item.getId());
        } else {
            System.out.println("[Error] Task not found");
        }
        return true;
    }
}


