package Graphs;

public class FloodFillAlgo {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Avoid infinite loop if the new and old colors are the same...
        if (image[sr][sc] == color) return image;

        // Run the fill function starting at the position given...
        fill(image, sr, sc, image[sr][sc], color);
        return image;
    }


    public void fill(int[][] image, int sr, int sc, int initColor, int newColor) {

        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;

        if (image[sr][sc] != initColor) return;

        image[sr][sc] = newColor;

        fill(image, sr - 1, sc, initColor, newColor);
        fill(image, sr + 1, sc, initColor, newColor);
        fill(image, sr, sc - 1, initColor, newColor);
        fill(image, sr, sc + 1, initColor, newColor);
    }
}
