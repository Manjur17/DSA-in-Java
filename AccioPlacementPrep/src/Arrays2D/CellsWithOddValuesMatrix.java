package Arrays2D;

public class CellsWithOddValuesMatrix {
    public int oddCellsEfficient(int m, int n, int[][] indices) {
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        //FALSE FOR EVEN & TRUE FOR ODD
        for (int[] index : indices) {
            row[index[0]] ^= true;
            col[index[1]] ^= true;
        }

        //COUNTING NO. OF ODD ELEMENTS IN EACH ROW & COLUMN BY ITERATING THROUGH BOOLEAN ARRAY AS (TRUE == ODD)
        int r = 0;
        int c = 0;
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                r++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (col[i]) {
                c++;
            }
        }

        //RETURNING NO. OF ODD ELEMENTS
        //NO. OF ODD ROWS * TOTAL NO. OF ELEMENTS IN THAT ROW (COLUMNS)  +
        //NO. OF ODD COLUMNS * TOTAL NO. OF ELEMENTS IN THAT COLUMN (ROWS)  -
        //TOTAL NO. OF ELEMENTS WHICH ARE COMMON IN THESE ROWS & COLUMNS
        return r * n + c * m - 2 * r * c;
    }


    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];

        for (int[] index : indices) {

            int row = index[0];
            int col = index[1];

            for (int j = 0; j < n; j++) {

                arr[row][j]++;
            }


            for (int j = 0; j < m; j++) {
                arr[j][col]++;
            }
        }

        int count = 0;
        for (int[] row : arr) {
            for (int j : row) {
                if (j % 2 == 1)
                    count++;
            }
        }

        return count;
    }

}
