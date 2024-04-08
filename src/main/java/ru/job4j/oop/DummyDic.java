package ru.job4j.oop;

public class DummyDic {
    public String eng(String eng) {
        return "Неизвестное слово: " + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String eng = dic.eng("Java");
        System.out.println(eng);
    }
}
