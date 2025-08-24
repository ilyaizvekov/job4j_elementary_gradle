package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
          float in = 420;
          float expectedEuro = 6;
          float expectedDollar = 7;
          float outEuro = Converter.rubleToEuro(in);
          float outDollar = Converter.rubleToDollar(in);
          boolean passedEuro = expectedEuro == outEuro;
          boolean passedDollar = expectedDollar == outDollar;
          System.out.println("420 rubles are 6. Test result : " + passedEuro);
          System.out.println("420 rubles are 7. Test result : " + passedDollar);
    }
}
