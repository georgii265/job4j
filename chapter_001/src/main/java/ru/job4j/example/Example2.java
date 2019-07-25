package ru.job4j.example;

/*Это еще один короткий пример программы.
 *Присвоить исходному файлу имя "Example2.ja
 */
class Example2 {
    public static void main(String args[]) {
        int num; // В этой строке обьявляется переменная с именем num
        num = 25; // в этой строке кода переменной num
        //присваевается значение 100
        // int - обозначает целочисленный тип.
        System.out.println("Этo переменная num: " + num);
        num = num * 2;
        System.out.print("Знaчeниe переменной num * 2 равно ");
        System.out.println(num);
        if (num < 100) System.out.println("num меньше 100");
    }
}
