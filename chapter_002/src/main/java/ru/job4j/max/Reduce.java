package ru.job4j.max;

public class Reduce {
    /**
     * Как правило, ключевое слово this в Java используется для:
     * дифференцирования между переменными экземпляра и локальными переменными в случае,
     * если у них одинаковые имена, в составе конструктора или метода.
     */
    private int[] array;// переменная которая принадлежит обьекту изначально int[] array = null

    public void to(int[] array) {// переменная принадлежит методу
        // array1 = array; здесь получается что мы присваеваем значение переменной array переменной int[] array,
        // что было бы ни верно.
        this.array = array;// this.array - это private int[] array;
        // теперь у нас получается что array: {1,2,3}
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}