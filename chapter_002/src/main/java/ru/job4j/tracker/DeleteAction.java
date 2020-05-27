package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    @Override
    public String name(){
        return "--- Delete item ---";
    }

   @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter item Id: ");
        tracker.delete(id);
        return true;
    }
}
