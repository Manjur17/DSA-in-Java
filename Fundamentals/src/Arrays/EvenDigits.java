package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenDigits {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        int[] input = new int[size];//creating the array
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static int noOfEvenDigitsNumber(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (evenDigits(j) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int evenDigits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        int countDigits = 0;
        while (num > 0) {
            countDigits++;
            num /= 10;
        }
        return countDigits;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = takeInput();
        int ans = noOfEvenDigitsNumber(arr);
        System.out.println("The number of even digits number are: " + ans);
    }
}
