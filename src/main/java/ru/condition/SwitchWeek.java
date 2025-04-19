package ru.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name = switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресение";
            default -> "Ошибка";
        };
        return name;
    }
}
