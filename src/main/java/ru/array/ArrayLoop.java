package ru.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 3;
        }
        for (int count : array) {
            System.out.println(" значение: " + count);
        }
    }
}
