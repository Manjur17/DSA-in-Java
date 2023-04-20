package Recursion;

import java.util.Scanner;

public class PatternProblem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row = s.nextInt();
        pattern1(row,0);
        System.out.println();
        pattern2(row,0);
    }
    public static void pattern1(int row,int cols){
        if (row == 0){
            return;
        }
        if (cols < row){
            System.out.print("*" + " ");
            pattern1(row,cols+1);
        }else {
            System.out.println();
            pattern1(row-1,0);
        }
    }
    public static void pattern2(int row,int cols){
        if (row == 0){
            return;
        }
        if (cols < row){
            pattern2(row,cols+1);
            System.out.print("*" + " ");
        }else {
            pattern2(row-1,0);
            System.out.println();
        }
    }
}
