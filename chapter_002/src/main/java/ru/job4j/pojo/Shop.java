package ru.job4j.pojo;

import java.util.Arrays;

public class Shop {
    /**
     * 1. Напишите метод в классе ru.job4j.pojo.Shop.
     * public Product[] delete(Product[] products, int index);
     * методы должен заменить ячейку с индексом index на нулевую ссылку.
     * а потом сместить все элементы на одну позицию влево, чтобы в массиве не было дырки.
     * Для того, чтобы сместить все элементы влево на одну позицию нужно использовать цикл for + index.
     * products[index] = products[index + 1];
     * 2. Добавьте демонстрацию работы примера в метод main.
     * Java предоставляет встроенный метод System.arraycopy() для копирования элементов из одного массива в другой.
     */
    public static Product[] delete(Product[] products, int index) {

        products[index] = null;
        for (int i = index; i < products.length -1; i++) {
             products[i] = products[i + 1];
        }
        return Arrays.copyOf(products, products.length - 1);
    }


    public static void main(String[] args) {

        Product products[] = new Product[5];//создание массива.

        products[0] = new Product("Молоко", 10);
        products[1] = new Product("Лимонад", 15);
        products[2] = new Product("Мороженое", 20);
        products[3] = new Product("Яйцо", 18);
        products[4] = new Product("Гречка", 23);
        Product[] delete = delete(products,4);// вызываем метод удаления.
        //new Shop().delete(products, 5); можно еще таким способом вызвать.

        for (int i = 0; i < delete.length; i++) {
            Product product = delete[i];
            System.out.println(product.getName());
        }
    }
}


