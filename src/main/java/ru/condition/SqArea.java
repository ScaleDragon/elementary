package ru.condition;

public class SqArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        double rsl = length * height;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);

        result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
