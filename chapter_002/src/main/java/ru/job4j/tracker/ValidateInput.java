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
public class ValidateInput extends ConsoleInput {
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (IllegalStateException moe) {
                System.out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}

