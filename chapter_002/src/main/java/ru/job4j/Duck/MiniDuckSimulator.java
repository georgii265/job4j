package ru.job4j.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        //первый вызов-передается реализация,заданной в конструкторе ModelDuck-т.е. экземпляру FlyNoWay
        model.performFly();
        //вызывает set-метод,унаследованный классом ModelDuck,и утка приманка вдруг взлетает на реактивном двигателе.
        model.setFlyBehavior(new FlyRocketPowered());
        //способность утки приманки к полету переключается динамически!
        //Если бы реалтизация находилась в иерархии Duck,такое было бы невозможно.
        model.performFly();
    }
}
