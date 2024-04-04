package ru.job4j.oop;

public class JukeBox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        }
        if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        JukeBox melodia = new JukeBox();
        melodia.music(1);
        melodia.music(2);
        melodia.music(6);
    }
}
