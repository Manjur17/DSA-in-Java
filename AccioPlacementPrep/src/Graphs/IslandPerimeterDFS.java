package Graphs;

public class IslandPerimeterDFS {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    return findPerimeter(grid, i, j);
                }
            }
        }

        return 0;
    }

    public int findPerimeter(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }

        if (grid[i][j] == -1) return 0;

        int count = 0;
        grid[i][j] = -1;

        count += findPerimeter(grid, i - 1, j); // up
        count += findPerimeter(grid, i + 1, j); // down
        count += findPerimeter(grid, i, j + 1); // right
        count += findPerimeter(grid, i, j - 1); // left

        return count;
    }
}
