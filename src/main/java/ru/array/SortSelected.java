package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minValue = MinDiapason.findMin(data, i, data.length - 1);
            int indexMinValue = FindLoop.indexInRange(data, minValue, i, data.length - 1);
            data = SwitchArray.swap(data, indexMinValue, i);
        }
        return data;
    }
}
