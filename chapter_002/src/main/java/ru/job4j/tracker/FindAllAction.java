package ru.job4j.tracker;



public class FindAllAction implements UserAction {

    @Override
    public String name() {
        return "--- All items ---";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(item);
        }
            return true;
        }
    }




