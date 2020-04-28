package ru.job4j.oop;

/**
 * Создайте классы в пакете ru.job4j.oop;
 * Object > Student > Freshman
 * Создайте класс ru.job4j.oop.College с методом main.
 * В нем сделайте приведение объекта Freshman к Student, а потом к Object.
 * Ответьте на вопрос к какому типу приведения это относится?
 * Ответ : Dow casting понижение типа или нисходящее преобразование.
 * создаем объекта класса Frechman.
 * делаем приведение к типу родителя Studdent1.
 * делаем приведение к типу родителя Object.
 *
 * Из-за того что я сделал понижение типа код падает с ошибкой.
 * Dow casting.
 * Exception in thread "main" java.lang.ClassCastException: class ru.job4j.oop.Object cannot be cast to class ru.job4j.oop.Frechman (ru.job4j.oop.Object and ru.job4j.oop.Frechman are in unnamed module of loader 'app')
 * 	at ru.job4j.oop.College.main(College.java:20)
 * 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 * 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 * 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 * 	at java.base/java.lang.reflect.Method.invoke(Method.java:564)
 * 	at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)
 */
public class College{
    public static void main(String[] args){
        Frechman frechman = new Frechman();
        Student1 student1 = (Student1)frechman;
        student1.add();
        Object student2 = new Object();
        Frechman frechman1 = (Frechman)student2;

        /**
         * Здесь я сделал Up casting - повышение типа или восходящее преобразование.
         */
        Frechman frechman2 = new Frechman();
        Student1 student3 = frechman2;
        frechman2.messanger();
    }
}
