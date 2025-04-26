package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        if (array.length >= 2) {
            int i = 0, j = i + 1;
            while (j < array.length) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
                if (j == array.length - 1) {
                    i++;
                    j = i + 1;
                }
                j++;
            }
        }
        return new int[0];
    }
}
