package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int y) {
        return x / y;
    }

    public int sumAllOperation(int b) {
        return sum(x) + minus(x) + multiply(x) + divide(x);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        int result1 = Calculator.minus(2);
        Calculator calculator = new Calculator();
        int result2 = calculator.multiply(5);
        int result3 = calculator.divide(1);
        int result4 = calculator.sumAllOperation(2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
