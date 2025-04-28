package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        if (array.length >= 2) {
            int j = array.length - 1;
            int i = 0;
            while (i < j) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
                i++;
                int count = array[i] + array[j];
                if (count > target) {
                    j--;
                }
            }
        }
        return new int[0];
    }
}
