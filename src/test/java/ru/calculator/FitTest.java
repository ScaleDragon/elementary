package ru.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void henManWeight180Then92() {
        short in = 180;
        double out = 92;
        double expected = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanWeight170Then69() {
        short in = 170;
        double out = 69;
        double expected = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));

    }
}