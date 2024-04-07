package ru.job4j.oop;

public class JukeBox {
    public void music(int position) {
        String music = switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спокойной ночи";
            default -> "Песня не найдена";
        };
        System.out.println(music);
    }

    public static void main(String[] args) {
            JukeBox melodia = new JukeBox();
            melodia.music(1);
            melodia.music(2);
            melodia.music(6);
        }
    }

