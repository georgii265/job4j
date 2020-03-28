package ru.job4j.oop;

public class DummyDic {
    /*
     *В этом уроке мы познакомимся с возможностью возвращать значение из метода.
     *Термин "вернуть значение" означает записать в переменную результат вычисления метода.
     * Чтобы метод мог вернуть значение надо в объявление метода вместо слова void указать тип данных,
     * которые мы ходим вернуть.
     */
    private String engToRus() {
        //Внутри метода мы создаем переменную String voice и ее указываем операторе return.
        String voice = "Unknown word";
        return voice;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        //Теперь вызов метод peppy.sound() можно представить как переменную типа String. Ниже в методе main.
        //String say = ... вместо точек мы можем написать строку или подставить вывоз метода sound();
        String eng = dic.engToRus();
        System.out.println("Неизвестное слово - " + eng);
    }
}



