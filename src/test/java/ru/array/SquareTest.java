package ru.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {

    @Test
    void whereValues0And1And4And9() {
        int size = 4;
        int[] out = Square.calculate(size);
        int[] expected = {0, 1, 4, 9};
        Assertions.assertArrayEquals(expected, out);
    }

    @Test
    void whereValues0() {
        int size = 0;
        int[] out = Square.calculate(size);
        int[] expected = {};
        Assertions.assertArrayEquals(expected, out);
    }

    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }
}