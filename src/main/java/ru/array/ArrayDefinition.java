package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива ages: " + ages.length);
        System.out.println("Размер массива surnames: " + surnames.length);
        System.out.println("Размер массива prices: " + prices.length);
        System.out.println("-----------------------");

        String[] names = new String[4];
        names[0] = "Александр Васечкин";
        names[1] = "Дмитрий Кукушкин";
        names[2] = "Василий Висильев";
        names[3] = "Петр Петров";
        for (String s : names) {
            System.out.println(s);
        }
    }
}
