package Arrays2D;

import java.util.Scanner;

public class RichestCustomerWealth {
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
                System.out.println("Enter the element at " + i + " th row and" + j +" th columns:");
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static int wealthCustomer(int[][] accounts){
        int maxWealth = Integer.MIN_VALUE;
       for (int rows =0;rows< accounts.length;rows++){
           int totalWealth =0;
           for (int columns =0;columns<accounts[rows].length;columns++){
               totalWealth += accounts[rows][columns];
           }
           if (maxWealth < totalWealth){
               maxWealth = totalWealth;
           }
       }
       return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = takeInput();
        System.out.println(wealthCustomer(accounts));
    }
}
