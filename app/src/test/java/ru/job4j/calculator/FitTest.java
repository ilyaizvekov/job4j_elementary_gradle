package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FitTest {

    @Test
    public void whenManHeight200ThenWeight115() {
        short height = 200;
        double expected = 115.0;
        double result = Fit.manWeight(height);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenManHeight180ThenWeight92() {
        short height = 180;
        double expected = 92.0;
        double result = Fit.manWeight(height);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenWomanHeight200ThenWeight103Point5() {
        short height = 200;
        double expected = 103.5;
        double result = Fit.womanWeight(height);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenWomanHeight160ThenWeight57Point5() {
        short height = 160;
        double expected = 57.5;
        double result = Fit.womanWeight(height);
        assertThat(result).isEqualTo(expected);
    }
}
