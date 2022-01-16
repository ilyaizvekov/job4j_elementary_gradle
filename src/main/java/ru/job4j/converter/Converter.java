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
          float in = 420; // входные данные
          float expectedEuro = 6; // ожидаемое значение для Евро
          float expectedDollar = 7; // ожидаемое значение для Доллара
          float outEuro = Converter.rubleToEuro(in); // результат работы программы для Евро
          float outDollar = Converter.rubleToDollar(in); //   результат работы программы для Доллара
          boolean passedEuro = expectedEuro == outEuro; //   сравнение резульатата работы программы и ожидаемых значений
          boolean passedDollar = expectedDollar == outDollar;
          System.out.println("420 rubles are 6. Test result : " + passedEuro);
          System.out.println("420 rubles are 7. Test result : " + passedDollar);
    }
}
