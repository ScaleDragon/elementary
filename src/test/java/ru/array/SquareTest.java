package ru.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}