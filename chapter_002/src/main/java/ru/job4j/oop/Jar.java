package ru.job4j.oop;

/**
 * То есть в нашем методе есть два объекта и два значения value,
 * первый это у кого мы вызываем метод pour и второй этот тот объект, который мы передаем в метод pour.
 * Здесь мы видим все мощь использования ООП над процедурным стилем.
 * Давайте сделаем класс ru.job4j.oop.Jar и создадим в нем поле private int value;
 * В поле будет содержаться количество воды.
 */
public class Jar {

    private int value;

    /**
     * Так же добавим конструктор для инициализации начального состояния сосуда.
     * @param size
     */
    public Jar(int size) {
        this.value = size;
    }

    /**
     * Теперь давайте добавим в него метод который будет принимать объект типа Jar.
     * дальше в методе pour передается переменная another. у нее мы тоже можем получить значение.
     * но обращаться к полу этого объекта мы должны через имя переменной another.value.
     */
    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    /**
     * Так же напишем метод main с демонстрацией работы.
     * Вначале мы создаем два объекта first, second.
     * В каждом объекте хранятся свои данные.
     * Дальше мы выводим на консоль значение value для каждого объекта.
     * А дальше идет главная строка, здесь мы у объекта first вызывает метод pour.
     * В нем есть поле this.value - this - указывает на то что нужно взять значение этой переменной
     * у объекта для которого мы вызываем метод.
     * то есть если мы вызываем метод pour у объекта first, то this.value будет 10.
     * если мы вызовем у объекта second метод pour, то для него будет значение this.value  равно 5
     */

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);

    }
}