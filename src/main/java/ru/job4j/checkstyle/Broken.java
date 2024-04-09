package ru.job4j.checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    public String surname;

    public static final String NEWVALUE = "";

    private String name;

    public Broken() {
    }

    public void echo() { }

    public void method(int a, int b, int c, int d) {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}
