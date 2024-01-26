package ru.job4j.checkstyle;

public class Broken {
    private static final String NEW_VALUE = "";

    private final int sizeOfEmpty = 10;

    private final String name;

    private final String surName;

    public Broken(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c, int d, int e, int f, int g) {

    }

}

