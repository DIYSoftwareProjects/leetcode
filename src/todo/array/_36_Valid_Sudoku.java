package todo.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _36_Valid_Sudoku {
    public static void main(String[] args) {
        char[][] board1 = new char[][] {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        char[][] board2 = {
            {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("TRUE : " + isValidSudoku(board1));
        System.out.println("FALSE : " + isValidSudoku(board2));
    }

    private static boolean isValidSudoku(char[][] board) {
        Set<String> diary = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    String row = ch + " in row " + i;
                    String column = ch + " in column " + j;
                    String block = ch + " in block " + i / 3 + j / 3;

                    if (!diary.add(row) || !diary.add(column) || !diary.add(block)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
