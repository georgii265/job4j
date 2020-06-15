package ru.job4j.tracker;

/**
 * Ввод строки вместо числа
 *
 * Если мы посмотрим на метод ConsoleInput.askInt(String question), то увидим, что в нём предусмотрены не все действия пользователя.
 *
 * Давайте добавим в него нужное поведение за счет механизма переопределения (override).
 *
 * Чтобы использовать переопределение метода, нужно создать класс, который будет наследовать ConsoleInput.
 *
 * Давайте назовем его ValidateInput.
 */
public class ValidateInput implements Input {

    private final Output out;
    private final Input in;

    public ValidateInput(Output out, Input input) {
        this.out = out;
        this.in = input;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    /**
     * цикл do-while выполняется по крайней мере один раз, даже если условие изначально ложно
     * @param question
     * @return
     */
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
           } catch (IllegalStateException moe) {
               out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}

