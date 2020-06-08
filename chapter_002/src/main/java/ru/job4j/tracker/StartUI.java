package ru.job4j.tracker;


import org.graalvm.compiler.debug.CSVUtil;

import static sun.jvm.hotspot.runtime.VMOps.Exit;

/**
 * 1.Мы получаем от пользователя пункт меню.
 *   int select = input.askInt("Select: ");
 *
 * 2.Этот параметр мы используем в качестве индекса в массиве actions.
 *     UserAction action = actions[select];
 *
 * 3.Далее мы получаем из массива один из объектов UserAction (CreateAction, ReplaceAction ....);
 *   for (int index = 0; index < actions.length; index++) {
 *   System.out.println(index + ". " + actions[index].name());
 *   }
 *
 * 4.У полученного объекта вызываем метод execute с передачей параметров input и tracker.
 *     run = action.execute(input, tracker);
 *
 * Нам нужно добавить параметр UserAction[] в метод init.
 *
 */
public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    /**
     * массив с действиями.
     * UserAction[] actions = {
     * new CreateAction() и т.д.
     * };
     */
    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new Exit(),
                new CreateAction(), new ReplaceAction(),
                new DeleteAction(), new FindAllAction(),
                new FindByNameAction(), new FindByIdAction(),
                new ExitProgramAction(), new StubAction()
        };
        new StartUI(output).init(input, tracker, actions);
    }
}