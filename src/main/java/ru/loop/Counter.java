package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int result = 0;
        if (finish >= start) {
            for (int i = start; i <= finish; i++) {
                result += i;
            }
        } else {
            try {
                throw new IllegalArgumentException("The second number should be equal to or more than the first");
            } catch (IllegalArgumentException e) {
                System.out.print(e.getMessage() + ": ");
            }
        }
        return result;
    }

    public static int sumByEven(int start, int finish) {
        int result = 0;
        if (finish >= start) {
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    result += i;
                }
            }
        } else {
            try {
                throw new IllegalArgumentException("The second number should be equal to or more than the first");
            } catch (IllegalArgumentException e) {
                System.out.print(e.getMessage() + ": ");
            }
        }
        return result;
    }
}
