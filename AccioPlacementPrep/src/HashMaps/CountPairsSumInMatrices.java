package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class CountPairsSumInMatrices {
    int countPairsConstantSpace(int[][] mat1, int[][] mat2, int n, int x) {
        int leftStart = 0, leftEnd = 0, rightStart = n - 1, rightEnd = n - 1;
        int count = 0;
        while (leftStart < n && leftEnd < n && rightStart >= 0 && rightEnd >= 0) {
            int sum = mat1[leftStart][leftEnd] + mat2[rightStart][rightEnd];
            if (sum == x) {
                count++;
                if (rightEnd > 0)
                    rightEnd--;
                else {
                    rightEnd = n - 1;
                    rightStart--;
                }
                if (leftEnd < n - 1)
                    leftEnd++;
                else {
                    leftEnd = 0;
                    leftStart++;
                }
            } else if (sum < x) {
                if (leftEnd < n - 1)
                    leftEnd++;
                else {
                    leftEnd = 0;
                    leftStart++;
                }

            } else {
                if (rightEnd > 0)
                    rightEnd--;
                else {
                    rightEnd = n - 1;
                    rightStart--;
                }
            }

        }

        return count;
    }

    int countPairs(int[][] mat1, int[][] mat2, int n, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map.put(mat2[i][j], map.getOrDefault(mat2[i][j], 0) + 1);
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map.containsKey(x - mat1[i][j]))
                    count += map.get(x - mat1[i][j]);
            }
        }

        return count;
    }

    int countPairsBrute(int[][] mat1, int[][] mat2, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isPresent(x - mat1[i][j], mat2, n))
                    count++;
            }
        }
        return count;
    }

    private boolean isPresent(int target, int[][] matrix, int n) {
        int row = 0, cols = n - 1;
        while (row < n && cols >= 0) {
            if (matrix[row][cols] == target) {
                return true;
            }
            if (matrix[row][cols] < target) {
                row++;
            } else {
                cols--;
            }
        }
        return false;
    }
}
