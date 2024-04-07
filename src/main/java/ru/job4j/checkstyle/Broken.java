package ru.job4j.checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    public String surname;

    void echo() { }

    void method(int a, int b, int c, int d) {
    }

    public static final String NEWVALUE = "";

    String name;

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    Broken() {
    }
}
