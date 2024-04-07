package ru.job4j.oop;

public class DummyDic {
    public String eng(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        String dummyDic = new String();
        String eng = ("Java");
        System.out.println("Неизвестное слово: " + eng);
    }
}
