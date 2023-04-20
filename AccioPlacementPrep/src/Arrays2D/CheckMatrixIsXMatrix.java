package Arrays2D;

//https://leetcode.com/problems/check-if-matrix-is-x-matrix/description/
public class CheckMatrixIsXMatrix {
    public boolean checkXMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    if (matrix[i][j] == 0) return false;
                } else {
                    if (matrix[i][j] != 0) return false;
                }
            }
        }

        return true;
    }
}
