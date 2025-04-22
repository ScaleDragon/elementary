package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean reference = data[0];
        for (boolean values : data) {
            if (values != reference) {
                return false;
            }
        }
        return true;
    }
}
