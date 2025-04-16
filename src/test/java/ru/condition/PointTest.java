package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when0And0To2And0Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when4And3To2And6Then3Dot60() {
        int x1 = 4;
        int y1 = 3;
        int x2 = 2;
        int y2 = 6;
        double expected = 3.60;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when43And56To50And23Then33Dot73() {
        int x1 = 43;
        int y1 = 56;
        int x2 = 50;
        int y2 = 23;
        double expected = 33.73;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when5And6To0And3Then5Dot83() {
        int x1 = 5;
        int y1 = 6;
        int x2 = 0;
        int y2 = 3;
        double expected = 5.83;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}