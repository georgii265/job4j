package ru.job4j.oop;



  /*
   * Создайте три класса Animal >Predator > Tiger.
   * В каждом классе создайте контруктор без параметров.
   * В каждом конструкторе сделайте вызов конструктора родителя и вывод на консоль имени класса.
   */
public class Animal {

   public Animal() {
      super();
      System.out.println("Animal");
   }
   public static void main(String[] args) {
      Animal animal = new Animal();
   }
}
