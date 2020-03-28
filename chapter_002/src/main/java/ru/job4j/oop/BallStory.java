package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        //Здесь мы создали три объекта, а ниже вызвали методы у объектов и передали в них другие объекты.
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Hare hare = new Hare();

        ball.help(hare);
        wolf.tryEat(ball);
        fox.tryEat(ball);
        hare.play(ball);
    }
}