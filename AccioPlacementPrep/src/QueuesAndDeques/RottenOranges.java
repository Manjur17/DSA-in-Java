package QueuesAndDeques;

import java.util.*;

class Oranges {
    int row;
    int col;

    Oranges(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class RottenOranges {

    public int orangesRotting(int[][] arr) {
        int n = arr.length; //rows
        int m = arr[0].length; //columns
        Queue<Oranges> queue = new LinkedList<>();
        int countFresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 2)
                    queue.add(new Oranges(i, j)); //Put the position of all rotten oranges in queue
                if (arr[i][j] == 1)
                    countFresh++; //count the number of fresh oranges
            }
        }
        if (countFresh == 0) return 0;
        int countRotten = 0, ans = 0;

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Oranges point = queue.poll();

                for (int j = 0; j < 4; j++) {
                    //Trying to rotten the orange in all 4 direction
                    int x = point.row + dx[j];
                    int y = point.col + dy[j];
                    if (x >= 0 && x < n && y >= 0 && y < m && arr[x][y] == 1) {
                        arr[x][y] = 2;
                        countRotten++; // we have rotten 1 orange
                        queue.add(new Oranges(x, y)); //add the newly rotten oranges
                    }
                }
            }


            ans++; // if any oranges were rotten the add it in our answer

        }

        return (countRotten == countFresh) ? ans  - 1: -1;
    }


    public static void main(String[] args) {
        int[][] v = {{2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};

        System.out.println("Max time incurred: " + rotOranges(v));
    }

    // Check if i, j is under the array limits of row and column
    static boolean isSafe(int i, int j, int R, int C) {
        return i >= 0 && i < R && j >= 0 && j < C;
    }

    static int rotOranges(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;
        boolean changed = false;
        int count = 2;

        while (true) {
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    // Rot all other oranges present at (i+1, j), (i, j-1), (i, j+1), (i-1, j)
                    if (arr[i][j] == count) {
                        if (isSafe(i + 1, j, R, C) && arr[i + 1][j] == 1) {
                            arr[i + 1][j] = count + 1;
                            changed = true;
                        }
                        if (isSafe(i, j + 1, R, C) && arr[i][j + 1] == 1) {
                            arr[i][j + 1] = count + 1;
                            changed = true;
                        }
                        if (isSafe(i - 1, j, R, C) && arr[i - 1][j] == 1) {
                            arr[i - 1][j] = count + 1;
                            changed = true;
                        }
                        if (isSafe(i, j - 1, R, C) && arr[i][j - 1] == 1) {
                            arr[i][j - 1] = count + 1;
                            changed = true;
                        }
                    }
                }
            }

            // If no rotten orange found it means all oranges have rotten
            if (!changed)
                break;

            changed = false;
            count++;
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                // If any orange is found to be not rotten then ans is not possible,return -1
                if (arr[i][j] == 1)
                    return -1;
            }
        }

        // Because initial value for a rotten orange was 2
        return count - 2;
    }

}
