package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void sumWhereStart0AndFinish10() {
        int start = 0;
        int finish = 10;
        int out = Counter.sum(start, finish);
        int expected = 55;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void sumWhereStartNegative15AndFinish15() {
        int start = -15;
        int finish = 15;
        int out = Counter.sum(start, finish);
        int expected = 0;
        assertThat(out).isEqualTo(expected);
    }
}