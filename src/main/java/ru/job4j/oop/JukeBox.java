package ru.job4j.oop;

public class JukeBox {
    public String music(int position) {
        String music = switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спокойной ночи";
            default -> "Песня не найдена";
        };
        return music;
    }

    public static void main(String[] args) {
            JukeBox melodia = new JukeBox();
            melodia.music(1);
            melodia.music(2);
        }
    }
