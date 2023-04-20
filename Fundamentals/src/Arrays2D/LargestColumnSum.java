package Arrays2D;

import java.util.Scanner;

public class LargestColumnSum {
    public static int[][] takeInput(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns");
        int columns = s.nextInt();
        int [][] input = new int[rows][columns];
        //Taking input from user
        for (int i = 0; i < rows; i++){
            for (int j = 0;j < columns;j++){
                System.out.println("Enter the element at " + i + " th row and " + j +" th columns:");
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }
    public static int printMaxColumnSum(int[][] input){
//        int rows = input.length;
//        int columns = input[0].length;
        int maxSum = Integer.MIN_VALUE;
        for (int j = 0; j < input[0].length; j++){
            int sum = 0;
            for (int i = 0;i < input.length;i++ ) {
                sum += input[i][j];
            }
           maxSum = Math.max(maxSum,sum);
        }
       return maxSum;
    }

    public static void main(String[] args) {
        int [][] arr = takeInput();
        int ans = printMaxColumnSum(arr);
        System.out.println("The largest column Sum is: " + "\n" + ans);
    }
}
