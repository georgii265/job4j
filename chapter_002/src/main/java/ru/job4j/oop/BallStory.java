package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
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