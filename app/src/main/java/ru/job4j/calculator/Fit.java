package ru.job4j.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fit {

    private static final double MAN_WEIGHT_FACTOR = 1.15;
    private static final double WOMAN_WEIGHT_FACTOR = 1.15;
    private static final int MAN_HEIGHT_OFFSET = 100;
    private static final int WOMAN_HEIGHT_OFFSET = 110;
    private static final int DECIMAL_PLACES = 1;

    public static double manWeight(short height) {
        return round((height - MAN_HEIGHT_OFFSET) * MAN_WEIGHT_FACTOR);
    }

    public static double womanWeight(short height) {
        return round((height - WOMAN_HEIGHT_OFFSET) * WOMAN_WEIGHT_FACTOR);
    }

    private static double round(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(DECIMAL_PLACES, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static void main(String[] args) {
        short height = 200;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 200 is " + man);
        System.out.println("Woman 200 is " + woman);
    }
}
