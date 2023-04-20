package BackTracking;

import Arrays.TwoSum;

import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        char[][] arr = new char[m][n];
        //Taking input from user
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.next().charAt(0);
            }
        }
        String word = s.next();
        System.out.println(exist(arr, word));
    }

    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (findWord(board, i, j, 0, "", word)) return true;
                }
            }
        }

        return false;
    }

    private static boolean findWord(char[][] board, int i, int j, int idx, String curr, String word) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '0') {
            return false;
        }

        if (board[i][j] != word.charAt(idx)) return false;
        else {
            curr += word.charAt(idx);
        }

        if (curr.equals(word)) return true;

        board[i][j] = '0';

        if (findWord(board, i + 1, j, idx + 1, curr, word) ||
                findWord(board, i - 1, j, idx + 1, curr, word) ||
                findWord(board, i, j + 1, idx + 1, curr, word) ||
                findWord(board, i, j - 1, idx + 1, curr, word)) {
            return true;
        }

        board[i][j] = word.charAt(idx);

        return false;
    }
}
