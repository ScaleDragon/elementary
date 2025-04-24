package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = row; i <= row; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 'X') {
                    return false;
                }
            }
        }
        return true;
    }
}
