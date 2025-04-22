package ru.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = word[0] == pref[0];
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
