package Graphs;

public class NumberOfIslands {
    public void markLandsAsVisited(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        markLandsAsVisited(grid, i + 1, j); // down
        markLandsAsVisited(grid, i - 1, j); // up
        markLandsAsVisited(grid, i, j + 1); // right
        markLandsAsVisited(grid, i, j - 1); // left
    }

    public int numIslands(char[][] grid) {
        int islands = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    markLandsAsVisited(grid, i, j);
                }
            }
        }

        return islands;
    }

}
