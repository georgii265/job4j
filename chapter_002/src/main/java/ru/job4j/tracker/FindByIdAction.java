package ru.job4j.tracker;

public class FindByIdAction implements UserAction {

    @Override
    public String name(){
        return "--- Find item by Id ---";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id =  input.askStr("Enter item Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("name: " + item.getName() + "id: " + item.getId());
        } else {
            System.out.println("Task not found");
        }
        return true;
    }
}
