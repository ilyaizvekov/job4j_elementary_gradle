package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(11, 2, 6, 3);
        double result2 = Point.distance(4, 3, 7, 1);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (11, 2) to (6, 3) " + result1);
        System.out.println("result (4, 3) to (7, 1) " + result2);
    }
}
