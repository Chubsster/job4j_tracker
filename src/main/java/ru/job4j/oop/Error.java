package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String massege) {
        this.active = active;
        this.status = status;
        this.message = massege;
    }

    public Error() {

    }

    public void printInfo() {
        System.out.println("Ошибка: " + active);
        System.out.println("Номер ошибки: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(false, 101, "Ошибка");
        error.printInfo();

        Error error1 = new Error();
        error1.printInfo();

        Error noerror = new Error(true, 0, "Ошибок нет");
        noerror.printInfo();

    }
    }

