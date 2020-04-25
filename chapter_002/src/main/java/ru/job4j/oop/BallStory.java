package ru.job4j.oop;

public class BallStory {
    /**
     *  Здесь мы создали три объекта,
     *  а ниже вызвали методы у объектов и передали в них другие объекты.
     * @param args
     */
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