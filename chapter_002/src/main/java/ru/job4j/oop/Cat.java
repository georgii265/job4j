package ru.job4j.oop;

public class Cat {

    private String name;
    //Создайте дополнительное поле private String name. Это поле должно содержать кличку котика.
    public void giveNick(String nick) {
        this.name = nick;
    }
    //Здесь мы создали поле класса Cat, которое называется food.
    private String food;
    //Давайте создадим метод void show(), который будет выводить в консоль содержимое поля food.
    public void show () {
        System.out.println("Кот " + this.name + " съел " + this.food);
    }
        //Для того, чтобы обратиться к полю объекта, нам нужно использовать ключевое слово this.
        //Это слово указывает, что нужно вывести содержимое поля.
        //this. - дальше указываем имя поля, которое нужно вывести(food).


    public void eat(String meat) {
        //Давайте теперь доработаем наш код и научимся записывать в поле объекта данные.
        //Для этого создадим метод, который принимает параметры: void eat(String meat).
        this.food = meat;
        //Выше приведенная строчка записывает в поле объект food значение переменной meat.
        //Значение переменной meat присваивается в методе main:gav.eat("kotleta") и black.eat("fish").
    }

    public static void main(String[] args) {
        //Давайте в особом методе main создадим два объекта класса Cat.
        //Назовем их gav, black и у каждого объекта вызовем метод show();
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("котлету");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Черныш");
        black.eat("рыбу");
        black.show();
        //Как мы видим, в консоли появились null. По умолчанию, во всех полях объекта записываются значения по умолчанию.
        //String - это ссылочный тип, его значение по умолчанию - нулевая ссылка.
        //Для примитивных типов int, long, short, byte, double, float = 0, для boolean = false, для char пустой символ ''.
        //Также помните: чтобы выполнить метод объекта, нужно обратиться к имени переменой объекта и через точку написать необходимый метод.
    }
}