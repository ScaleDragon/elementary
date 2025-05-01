package ru.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int maximum = max(first, second);
        return maximum > third ? maximum : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int maximum = max(first, second, third);
        return maximum > fourth ? maximum : fourth;
    }
}
