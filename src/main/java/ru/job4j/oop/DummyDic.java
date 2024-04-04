package ru.job4j.oop;

public class DummyDic {
    public static String eng(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        String dummyDic = new String();
        String word = DummyDic.eng("Java");
        System.out.println("Неизвестное слово " + word);
    }
}
