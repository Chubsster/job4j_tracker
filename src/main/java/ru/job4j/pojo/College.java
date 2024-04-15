package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Shamaev Evgeny");
        student.setGroup("Java");
        student.setCreated(new Date());

        System.out.println(student.getFullName() + " joins the group " + student.getGroup() + " when arrived " + student.getCreated());
    }
}


