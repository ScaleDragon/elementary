package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 2; i <= number; i++) {
            if (number % 2 != 0 && number % 3 != 0) {
                return true;
            }
        }
        return prime;
    }
}
