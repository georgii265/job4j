package ru.job4j.tracker;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        CreateAction createAction = new CreateAction(out);
        createAction.execute(input, tracker);
        Item created = tracker.findAll().get(0);
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    /**
     * Порядок действий.
     * 1. Создаем объект tracker.
     * 2. Создаем объект item.
     * 3. Добавляем item в tracker. После этой операции у нас есть id.
     * 4. Достаем item.id и создаем массив с ответами пользователя.
     * 5. Вызываем тестируемый метод replaceItem. Это действие изменит состояние объекта tracker.
     * 6. Ищем по item.id замененный item в объекте tracker.
     * 7. Сравниваем имя найденной заявки с ожидаемой.
     *  String[] answers = {
     *                 item.getId(), // id сохраненной заявки в объект tracker.
     *                 "replaced item"
     *         };
     */
    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("replaced item");
        ReplaceAction replaceAction = new ReplaceAction();
        tracker.add(item);
        String[] answers = {
                item.getId(),
                "replaced item"
        };
        replaceAction.execute(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    /**
     * Напишите тест на метод StartUI.deleteItem. В этом случае поиск в объекте tracker должен вернуть null.
     * Порядок действий.
     * 1. Создаем объект tracker.
     * 2. Создаем объект item.
     * 3. Добавляем item в tracker. После этой операции у нас есть id.
     * 4. Достаем item.id и создаем массив с ответами пользователя.
     * 5. Вызываем тестируемый метод deleteItem. Это действие изменит состояние объекта tracker.
     * 6. Получаем результат по item.id замененный item в объекте tracker.
     * 7. Сравниваем полученный результат.
     */
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("replaced item");
        tracker.add(item);
        String[] answers = {item.getId()};
        Input input = new StubInput(answers);
        DeleteAction deleteAction = new DeleteAction();
        deleteAction.execute(input, tracker);
        Item result = tracker.findById(item.getId());
        Item expected = null;
        assertThat(result, is(expected));
    }

    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        Output out = new StubOutput();
        new StartUI(out).init(input, new Tracker(), new UserAction[]{action});
        assertThat(action.isCall(), is(true));
    }

    /**
     * Создаем объект ByteArrayOutputStream.
     * Получаем ссылку на системный объект PrintStream.
     * Устанавливаем в системный вывод объект из пункта 1.
     * Производим действия по выводу информации на консоль.
     * Сравниваем знания.
     * Проставляем в системный вывод объект из пункта 2.
     * Здесь используется новый класс StringJoiner.
     * Этот класс позволяет объединить несколько строк через разделитель.
     */
    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        Output output = new ConsoleOutput();
        new StartUI(output).init(input, new Tracker(), new UserAction[]{action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. --- Stub Action ---")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
