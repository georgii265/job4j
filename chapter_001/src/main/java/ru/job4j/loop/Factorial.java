package ru.job4j.loop;

 public class Factorial {
     public int calc(int n) {
         int result = 1;
         int i;
         for (i = 1; i <= n; i++) {
             result = result * i;
         }
         return result;
    }
}