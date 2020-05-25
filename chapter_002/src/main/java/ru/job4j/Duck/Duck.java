package ru.job4j.Duck;

public abstract class Duck {
    /**
     * обьявляем две ссылочные переменные с типами интерфейсоф поведения.
     * переменные наследуются всеми субклассами Duck (в том же пакете)
     * а не с типом конкретного класса реализации.
     * Каждый обьект на стадии выполнения присваивается  этим переменным полиморфные значения,
     * соответсвующие конкретному типу повединия (FlyWithWings,Squeak и т.д.)
     */
    FlyBehavior flyBehavior;// каждый  обьект Duck содержит ссылку на реализацию интерфейса FlyBehavior.
    QuackBehavior quackBehavior;// каждый  обьект Duck содержит ссылку на реализацию интерфейса QuackBehavior.

    public Duck(){
    }
    public abstract void display();

    public void performFly() { //делегирование операции классам поведения.этот метод заменяют fly().
        flyBehavior.fly();
    }
    public void performQuack() { //обьект Duck делегирует поведения обьекту,на который ссылается quackBehaviorия.
        quackBehavior.quack();
    }

    /**
     * добавим два новых метода
     * предположим мы хотим,чтобы тип поведения задавался set-методом подкласса(вместо создания экземпляра в конструкторе)
     * вызывая эти методы в любой момент,мы можем изменить поведение утки "на лету"
     * @param fb
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
          System.out.println("All duck float, even decoys!");
    }
}
