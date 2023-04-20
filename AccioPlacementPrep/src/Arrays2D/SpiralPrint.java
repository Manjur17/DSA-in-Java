package Arrays2D;

import java.util.*;

public class SpiralPrint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();
        int[][] arr = new int[rows][columns];
        //Taking input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        List<Integer> list = spiralOrder(arr);
        System.out.println(list);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int startRow = 0, startColumn = 0, endRow = matrix.length, endColumn = matrix[0].length;

        while (startRow < endRow && startColumn < endColumn) {
            //top wall -> starting row -> row is fixed
            for (int i = startColumn; i < endColumn; i++) {
                list.add(matrix[startRow][i]);
            }
            startRow++;

            //right-wall -> end column -> column is fixed
            for (int i = startRow; i < endRow; i++) {
                list.add(matrix[i][endColumn - 1]);
            }
            endColumn--;


            //the inner box need not always have complete box
            //bottom wall -> end Row -> row is fixed
            if (startRow < endRow) {
                for (int i = endColumn - 1; i >= startColumn; i--) {
                    list.add(matrix[endRow - 1][i]);
                }
            }
            endRow--;

            //the inner box need not always have complete box
            //left-wall -> start column -> column is fixed
            if (startColumn < endColumn) {
                for (int i = endRow - 1; i >= startRow; i--) {
                    list.add(matrix[i][startColumn]);
                }
            }
            startColumn++;
        }

        return list;
    }

    public static List<Integer> spiralOrderII(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;


        int total = rows * cols, count = 0;

        int startRow = 0, startColumn = 0, endRow = rows - 1, endColumn = cols - 1;

        while (count < total) {
            //top wall -> starting row -> row is fixed
            for (int i = startColumn; i <= endColumn && count < total; i++) {
                list.add(matrix[startRow][i]);
                count++;
            }
            startRow++;
            //right-wall -> end column -> column is fixed
            for (int i = startRow; i <= endRow && count < total; i++) {
                list.add(matrix[i][endColumn]);
                count++;
            }
            endColumn--;
            //bottom wall -> end Row -> row is fixed
            for (int i = endColumn; i >= startColumn && count < total; i--) {
                list.add(matrix[endRow][i]);
                count++;
            }
            endRow--;
            //left-wall -> start column -> column is fixed
            for (int i = endRow; i >= startRow && count < total; i--) {
                list.add(matrix[i][startColumn]);
                count++;
            }
            startColumn++;
        }
        return list;
    }
}
