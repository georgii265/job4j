package ru.job4j.condition;

/**
 * @author Georgii Morgunov (georgii.morgunov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Привет, умник.";
        if ("Привет, Бот.".equals(question)) {
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            System.out.println("Привет, умник.");
        } else if ("Привет, Бот.".equals(question)) { // заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            System.out.println("Привет, умник.");
        }
        return rsl;
    }
}
