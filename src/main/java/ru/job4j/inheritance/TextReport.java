package ru.job4j.inheritance;

public class TextReport {

    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }

    public static class JSONReport extends TextReport {
        public String generate(String name, String body) {
            return "{" + System.lineSeparator()
                    + "\t\"name\" :" + " " + name + ", "  + System.lineSeparator()
                    + "\t\"body\" :" + " " + body + System.lineSeparator()
                    + "}";
        }
    }
}