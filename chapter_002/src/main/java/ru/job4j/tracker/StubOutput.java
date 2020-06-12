package ru.job4j.tracker;

/**
 * Заглушка.
 * Метод append() — обновляет значение объекта, который вызвал метод.
 * Этот метод в Java принимает boolean, char, int, long, Strings и т.д.
 */
public class StubOutput implements Output{
    private final StringBuilder buffer = new StringBuilder();

    /**
     *  Этот метод принимает объект обязательного параметра, который является объектом, который будет напечатан в потоке.
     * @param obj
     */
    @Override
    public void println(Object obj) {
        if (obj != null) {
            buffer.append(obj.toString());
        } else {
            buffer.append("null");
        }
        buffer.append(System.lineSeparator());//Этот метод не принимает никаких параметров.
    }

    @Override
    public String toString() {
        return buffer.toString();
    }
}

