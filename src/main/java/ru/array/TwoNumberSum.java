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
                if (array[i] + array[j] > target) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return new int[0];
    }
}
