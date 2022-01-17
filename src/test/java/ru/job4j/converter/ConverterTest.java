package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert420RblThen6Euro() {
        float in = 420;
        float expected = 6;
        float out = Converter.rubleToEuro(in);
        float eps = 0.001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert420RblThen7Dlr() {
        float in = 420;
        float expected = 7;
        float out = Converter.rubleToDollar(in);
        float eps = 0.001f;
        Assert.assertEquals(expected, out, eps);
    }
}