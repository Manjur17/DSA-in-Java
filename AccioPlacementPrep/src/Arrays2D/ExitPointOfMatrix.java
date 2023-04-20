package Arrays2D;

import java.util.Scanner;

public class ExitPointOfMatrix {
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
        exitPoint(arr);
    }

    public static void exitPoint(int[][] arr) {
        int i = 0;
        int j = 0;
        int dir = 0;   //East->0 South->1 West->2 North->3
        while (true) {
            dir = (dir + arr[i][j]) % 4; //To Keep the values between 0 and 3

            if (arr[i][j] == 1) {
                arr[i][j] = 0;
            }

            if (dir == 0) {
                j++;  //Move in the same row (east direction)
            } else if (dir == 1) {
                i++;  //Move down the column (south direction)
            } else if (dir == 2) {
                j--;  //Move backwards in the row (west direction)
            } else if (dir == 3) {
                i--;  //Move up the column (north direction)
            }

            if (i < 0) {
                i++;  //exit point is one row head (in 0th row)
                break;
            } else if (j < 0) {
                j++;   //exit point is one col ahead (in 0th col)
                break;
            } else if (i == arr.length) {
                i--;  //exit point is one row back (in last row)
                break;
            } else if (j == arr[0].length) {
                j--;  //exit point is one col back (in last col)
                break;
            }
        }

        System.out.println(i);
        System.out.println(j);
    }
}
