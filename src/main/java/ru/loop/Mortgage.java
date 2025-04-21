package ru.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;

        while (amount > 0) {
            amount += amount * percent / 100;
            if (amount < salary) {
                amount -= salary = amount;
            } else {
                amount -= salary;
            }
            year++;
        }
        return year;
    }
}
