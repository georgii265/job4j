package ru.job4j.tasks;

/**
 * Всегда помните, что приватные, статические и final-методы связываются при помощи статического связывания,
 * а виртуальные – динамического.
 *
 * Аналогично, лучший пример статического связывания – перегрузка методов, а переопределение – динамического.
 */
public class main {
    public static void main(String[] args) {

        // Пример статического и динамического связывания в Java
        Insurance current = new CarInsurance();

        /**
         * Динамическое связывание на основе объекта,происходит во время выполнения.
         * динамическое связывание используется в языке Java для разрешения переопределенных методов.
         * все виртуальные методы разрешаются при помощи динамического связывания.
         * при динамическом связывании для нахождения нужного метода в Java используется конкретный объект.
         */
        int premium = current.premium();

        /**
         * Статическое связывание происходит на основе класса,во время компиляции
         * Статическое связывание используется в языке Java для разрешения перегруженных методов,
         * приватные, статические и терминальные методы разрешаются при помощи статического связывания,
         * поскольку их нельзя переопределять,
         * В случае статического связывания используются не конкретные объекты, а информация о типе,
         * то есть для обнаружения нужного метода используется тип ссылочной переменной.
         */
        String category = current.category();

        System.out.println("premium : " + premium);
        System.out.println("category : " + category);
    }
}
