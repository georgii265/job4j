package ru.job4j.oop;

public class  BallStory {
    public static void main(String[] args) {
        //Здесь мы создали три объекта, а ниже вызвали методы у объектов и передали в них другие объекты.
        Ball Ball = new Ball();
        Wolf Wolf = new Wolf();
        Fox Fox = new Fox();
        Hare  Hare = new  Hare();

        Ball.help(Hare);
        Wolf.tryEat(Ball);
        Fox.tryEat(Ball);
        Hare.play(Ball);
    }
}