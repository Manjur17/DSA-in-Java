package Assignment;

import java.util.Scanner;

public class PlusMinus {
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int size=s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        for (int i=0; i<size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        int cntPos =0,cntNeg=0,cntZero =0;
        for (int j : arr) {
            if (j > 0) {
                cntPos++;
            } else if (j < 0) {
                cntNeg++;
            } else {
                cntZero++;
            }
        }
        System.out.println(cntPos + " " + cntNeg + " " +cntZero);
        System.out.println(((float) cntPos/ arr.length));
        System.out.println(((float) cntNeg/ arr.length));
        System.out.println(((float) cntZero/ arr.length));
    }
}
