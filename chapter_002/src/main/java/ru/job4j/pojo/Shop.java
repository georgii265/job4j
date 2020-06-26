package ru.job4j.pojo;

public class Shop {

    public static void main(String[] args) {

        Product[] products = new Product[5];

        products[0] = new Product("Молоко", 10);
        products[1] = new Product("Лимонад", 15);
        products[2] = new Product("Мороженое", 20);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }

    /**
     * Вам нужно написать метод, который вернет индекс первой пустой ячейки.
     * @param products
     * @return
     */
    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return -1;
    }
}


