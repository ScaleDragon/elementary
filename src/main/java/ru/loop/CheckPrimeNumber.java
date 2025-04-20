package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        if (number > 1) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                    if (count > 2) {
                        prime = false;
                        break;
                    }
                    prime = true;
                }
            }
        }
        return prime;
    }
}
