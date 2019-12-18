package ru.job4j.pojo;

public class Shop {
    /**
     1. Напишите метод в классе ru.job4j.pojo.Shop.

     public Product[] delete(Product[] products, int index);

     методы должен заменить ячейку с индексом index на нулевую ссылку.

     а потом сместить все элементы на одну позицию влево, чтобы в массиве не было дырки.

     Для того, чтобы сместить все элементы влево на одну позицию нужно использовать цикл for + index.

     products[index] = products[index + 1];

     2. Добавьте демонстрацию работы примера в метод main.

     */
    public static void main(String[] args) {

        Product products[] = new Product[5];//создание массива.
        products[0] = new Product("Молоко", 10);
        products[1] = new Product("Лимонад", 15);
        products[2] = new Product("Мороженое", 20);
        products[3] = new Product("Яйцо", 18);
        products[4] = new Product("Гречка", 23);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        //удаляем значение из ячейки с индексом 1
        products[1] = null;

        for (int i = 0; i < products.length ; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        //записываем в ячейку с индексом 1 значение ячейки с индексом 2.
        products[1] = products[2];
        //удаляем значение из ячейки с индексом 2.
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}

