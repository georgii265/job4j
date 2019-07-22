package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) { //В классе MatrixCheck написать метод public boolean mono(boolean[][] data).
        boolean result = true;//Метод должен проверить, что все элементы по диагоналям равны true или false.
        for (int i = 0; i < data.length; i++)
            if (data[0][0] != data[i][i]) {

                for (int j = 0; j < data.length; j++)
                    if (data[0][data.length - 1] != data[j][data.length - 1 - j]) {
                        result = false;
                        break;
                    }

            }
        return result;
    }
}