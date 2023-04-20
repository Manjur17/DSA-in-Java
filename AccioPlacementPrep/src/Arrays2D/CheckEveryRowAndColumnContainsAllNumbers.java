package Arrays2D;

import java.util.*;

public class CheckEveryRowAndColumnContainsAllNumbers {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (row.contains(matrix[i][j])) return false;
                else row.add(matrix[i][j]);

                if (col.contains(matrix[j][i])) return false;
                else col.add(matrix[j][i]);
            }
        }

        return true;
    }

    public boolean checkValidII(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (set.contains(matrix[i][j])) return false;
                set.add(matrix[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (set.contains(matrix[j][i])) return false;
                set.add(matrix[j][i]);
            }
        }

        return true;
    }
}
