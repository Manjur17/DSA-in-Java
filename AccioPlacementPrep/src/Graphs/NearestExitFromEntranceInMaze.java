package Graphs;

import java.util.*;

class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class NearestExitFromEntranceInMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        int n = maze.length; //rows
        int m = maze[0].length; //columns

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(entrance[0], entrance[1]));

        maze[entrance[0]][entrance[1]] = '+'; //mark it visited
        int countSteps = 0;

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        while (!queue.isEmpty()) {
            int size = queue.size();
            countSteps++;

            for (int i = 0; i < size; i++) {
                Pair point = queue.poll();

                for (int j = 0; j < 4; j++) {
                    //Trying to rotten the orange in all 4 direction
                    int x = point.row + dx[j];
                    int y = point.col + dy[j];

                    if (x < 0 || x >= n || y < 0 || y >= m || maze[x][y] == '+') continue;

                    // check if we have reached boundary
                    if (x == 0 || x == n - 1 || y == 0 || y == m - 1) {
                        return countSteps;
                    }

                    maze[x][y] = '+'; //mark it visited
                    queue.add(new Pair(x, y));
                }
            }
        }

        return -1;
    }
}
