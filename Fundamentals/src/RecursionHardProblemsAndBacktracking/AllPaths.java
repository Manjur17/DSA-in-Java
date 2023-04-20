package RecursionHardProblemsAndBacktracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPaths("",board,0,0);
        int[][] path = new int[board.length][board[0].length];
        System.out.println();
        allPathsPrint("", board, 0, 0, path, 1);

    }
    public static void allPaths(String ans, boolean[][] maze, int rows, int cols) {
        if (rows == maze.length - 1 && cols == maze[0].length - 1) {
            System.out.print(ans + " ");
            return;
        }
        if (!maze[rows][cols]) {
            return;
        }
        maze[rows][cols] = false;
        if (rows < maze.length - 1) {
            allPaths(ans + "D", maze, rows + 1, cols);
        }
        if (cols < maze[0].length - 1) {
            allPaths(ans + "R", maze, rows, cols + 1);
        }
        if (rows > 0) {
            allPaths(ans + "U", maze, rows-1, cols);
        }
        if (cols > 0) {
            allPaths(ans + "U", maze, rows, cols-1);
        }
        maze[rows][cols] = true;
    }
    public static void allPathsPrint(String ans, boolean[][] maze, int rows, int cols,int[][] path,int step) {
        if (rows == maze.length - 1 && cols == maze[0].length - 1) {
            path[rows][cols] = step;
            for (int[] arr: path){;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println("..........................................");
            return;
        }
        if (!maze[rows][cols]) {
            return;
        }
        maze[rows][cols] = false;
        path[rows][cols] = step;
        if (rows < maze.length - 1) {
            allPathsPrint(ans + "D", maze, rows + 1, cols,path,step+1);
        }
        if (cols < maze[0].length - 1) {
            allPathsPrint(ans + "R", maze, rows, cols + 1,path,step+1);
        }
        if (rows > 0) {
            allPathsPrint(ans + "U", maze, rows-1, cols,path,step+1);
        }
        if (cols > 0) {
            allPathsPrint(ans + "U", maze, rows, cols-1,path,step+1);
        }
        maze[rows][cols] = true;
        path[rows][cols] = 0;
    }
}
