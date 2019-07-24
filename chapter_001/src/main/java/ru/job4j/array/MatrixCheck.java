package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) { //В классе MatrixCheck написать метод public boolean mono(boolean[][] data).
        int last = data.length - 1;
        boolean result = true;//Метод должен проверить, что все элементы по диагоналям равны true или false.
        for (int index = 1; index <= last; index++) {
            if (data[0][0] != data[index][index] || data[0][last] != data[index][last - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}