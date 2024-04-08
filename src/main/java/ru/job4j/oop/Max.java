package ru.job4j.oop;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

        public int max(int left, int right, int third) {
            return max(
                    left,
                    max(left, right, third)
                    );
        }


        public int max(int left, int right, int third, int fourth) {
            return max(
                left,
                max(left, right, third, fourth)
        );
        }
        }




