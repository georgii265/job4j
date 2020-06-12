package ru.job4j.tracker;

import static java.lang.Integer.valueOf;

/**
 * Давайте его доработаем таким образом, чтобы метод askStr возвращал параметры, которые мы хотим.
 * добавим в этот класс поле с вариантами ответов пользователя.
 */
public class StubInput implements Input {
    /**
     * Добавим в этот класс поле с вариантами ответов пользователя.
     * Это поле будет описывать массив строк
     */
    private String[] answers;
    /**
     * А так же добавим счетчик, чтобы при повторном вызове метода askStr мы получали следующую ячейку из нашего массива.
     */
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }



    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}