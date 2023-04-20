package BinarySearchQuestions;

public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int rows = 0, cols = grid[0].length - 1;

        while (rows < m && cols >= 0) {
            if (grid[rows][cols] < 0) {
                count += (m - rows);
                cols--;
            } else {
                rows++;
            }
        }

        return count;
    }

    public int countNegativesII(int[][] grid) {
        int count = 0;
        for (int[] ints : grid) {
            count += negativeCount(ints);
        }
        return count;
    }


    int negativeCount(int[] arr) {
        int count = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= 0)
                start = mid + 1;
            else {
                if (mid != end) {
                    count += (end - mid) + 1;
                } else {
                    count++; //mid == end
                }
                end = mid - 1;
            }
        }
        return count;
    }

    public int countNegativesBrute(int[][] matrix) {
        int row = 0, cols = matrix[0].length - 1;
        int count = 0;
        while (row < matrix.length && cols >= 0) {
            if (matrix[row][cols] < 0) {
                count++;
                cols--;
                if (cols < 0) {
                    row++;
                    cols = matrix[0].length - 1;
                }
            } else {
                row++;
                cols = matrix[0].length - 1;
            }
        }
        return count;
    }
}
