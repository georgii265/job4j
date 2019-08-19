package ru.job4j.oop;

public class DummyDic {

    private String engToRus() {
        String voice = "Unknown word";
        return voice;
    }

    public static void main(String[] args) {
        DummyDic Dic = new DummyDic();
        String eng = Dic.engToRus();
        System.out.println("Неизвестное слово - " + eng);
    }
}



