package ru.job4j.tracker;

/**
 * Произведем рефакторинг проекта. Нам нужно заменить вывод в консоль на интрефейс Output.
 *
 * Внедрение зависимости будем делать через конструторы.
 */
public class CreateAction implements UserAction {

    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "--- Create a new Item ---";
    }

    @Override
    public boolean execute(Input input,Tracker tracker) {
        System.out.println("--- Create a new Item ---");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
