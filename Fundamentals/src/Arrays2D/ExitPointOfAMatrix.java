package Arrays2D;

import java.util.Scanner;

public class ExitPointOfAMatrix {
    public static int[][] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns");
        int columns = s.nextInt();
        int[][] input = new int[rows][columns];
        //Taking input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }
    public static void exitPoint(int[][] arr){
        int dir =0;
        int rows =0,columns =0;
        while (true){
            dir = (dir + arr[rows][columns])%4;
            if (dir == 0){
                columns++;
            }else if (dir == 1){
                rows++;
            }else if (dir ==2){
                columns--;
            }else if (dir == 3){
                rows--;
            }

            if (rows<0){
                rows++;
                break;
            }else if (columns<0){
                columns++;
                break;
            }else if (rows == arr.length){
                rows--;
                break;
            }else if (columns == arr[0].length){
                columns--;
                break;
            }
        }
        System.out.println("The exit point is: (" + rows + "," + columns + ")");
    }
    public static void main(String[] args) {
        int[][] arr = takeInput();
        exitPoint(arr);
    }
}
