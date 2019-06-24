package ru.job4j.condition;

/**
 * @author Georgii Morgunov (georgii.morgunov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     *
     * @param question Вопрос от клиента.
     * @return
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        // заменить ... на правильный ответ rsl = "ответ по заданию".
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Привет, Бот.".equals(question)) { // заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "Привет, умник.";
        }
        if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        if ("Сколько будет 2 + 2?".equals(question)) {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        } else if ("Сколько будет 2 + 2?".equals(question)) {
            rsl =  "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return rsl;
    }
}

