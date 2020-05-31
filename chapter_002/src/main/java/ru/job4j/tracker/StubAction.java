package ru.job4j.tracker;

/**
 * Мы будем использовать класс StubInput - для ввода знаний в наш тест.
 * StubAction для загрузки действия и проверки, что мы выполнили этот тест.
 */
public class StubAction implements UserAction {
    /**
     * В это классе мы создаем поле call.
     * По этому полю мы будет проверять выбрали мы пункт меню или нет.
     */
    private boolean call = false;

    @Override
    public String name() {
        return "--- Stub Action ---";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}
