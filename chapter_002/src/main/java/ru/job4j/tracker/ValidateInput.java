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

    /**
     * цикл do-while выполняется по крайней мере один раз, даже если условие изначально ложно
     * @param question
     * @return
     */
    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {// команда (тело цикла)
            try {
                value = super.askInt(question);//вопрос
                invalid = false;
            } catch (IllegalStateException moe) {
                System.out.println("Please select key from menu.");//Пожалуйста, выберите ключ из меню
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");//Пожалуйста, введите проверочные данные снова.
            }
        } while (invalid);//(условие-логическое выражение)
        return value;
    }//После оператора return указывается возвращаемое значение, которое является результатом метода.
    // Это может быть литеральное значение, значение переменной или какого-то сложного выражения.
}

