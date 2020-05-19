package ru.job4j.stragery;

/**
 * В классе Paint реализовать метод public void draw(Shape shape).
 * В классе Paint реализовать метод публичного рисования пустот (Shape shape).
 * Метод draw() должен печатать псевдокартинку на консоль через метод System.out.println(shape.draw()).
 */
public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Triangle());
        paint.draw(new Square());
    }
}