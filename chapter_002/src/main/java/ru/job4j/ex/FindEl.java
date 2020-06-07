package ru.job4j.ex;

/**
 * Допишите метод поиска индекса элемента в строковом массиве.
 * Если элемента нет, то нужно выкинуть исключение ElementNotFoundException.
 * В сингатуре метода объявить это исключение.
 * Добавьте метод main, и в нем вызовите метод indexOf.
 * В методе main используйте конструкцию try-catch.
 */
public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("If there is no item.");
        }
        return rsl;
    }


    public static void main(String[] args) {
        String[] value = new String[] { "A", "B", "C" };
        try {
            indexOf(value, "If there is no item.");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}