package BitManipulation;

import java.util.Scanner;

public class FindUnique {
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        for (int i=0; i<size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }
    public static int uniqueElement(int[] arr){
        int uniqueElement = 0;
        for (int j:arr) {
            uniqueElement ^= j;
        }
        return uniqueElement;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(uniqueElement(arr));
    }
}
