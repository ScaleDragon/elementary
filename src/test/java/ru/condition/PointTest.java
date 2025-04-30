package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when0And0To2And0Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when4And3To2And6Then3Dot60() {
        Point a = new Point(4, 3);
        Point b = new Point(2, 6);
        double expected = 3.60;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when43And56To50And23Then33Dot73() {
        Point a = new Point(43, 56);
        Point b = new Point(50, 23);
        double expected = 33.73;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when5And6To0And3Then5Dot83() {
        int x1 = 5;
        int y1 = 6;
        int x2 = 0;
        int y2 = 3;
        Point a = new Point(5, 6);
        Point b = new Point(0, 3);
        double expected = 5.83;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}