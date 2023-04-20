package BitManipulation;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            int k = 0;
            for (int j = n - 1; j >= 0; j--) {
                ans[i][k++] = arr[i][j] ^ 1; // a ^ 1 = ~a
            }
        }
        return ans;
    }

    public int[][] flipAndInvertImageII(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = arr[i][j] ^ 1;
                arr[i][j] = arr[i][n - j - 1] ^ 1;
                arr[i][n - j - 1] = temp;
            }
        }
        return arr;
    }
}
