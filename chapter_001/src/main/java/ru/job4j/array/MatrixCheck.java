package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) { //В классе MatrixCheck написать метод public boolean mono(boolean[][] data).
        boolean result = true;//Метод должен проверить, что все элементы по диагоналям равны true или false.
        for (int i = 0; i < data.length; i++) {
            if (data[1][1] != data[i][i] || data[1][1] != data[data.length - 1 - i][i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
