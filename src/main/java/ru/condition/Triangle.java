package ru.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab > 0 && ac > 0 && bc > 0
                && (ab + ac > bc)
                && (ab + bc) > ac
                && (ac + bc) > ab;
    }
}
