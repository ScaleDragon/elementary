package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 1; i <= number; i++) {
            if (number % 2 != 0 && number > 1) {
                return true;
            }
        }
        return prime;
    }
}
