package ru.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                return i;
            }
        }
        return -1;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        if (finish < data.length) {
            for (int i = start; i <= finish; i++) {
                if (el == data[i]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
