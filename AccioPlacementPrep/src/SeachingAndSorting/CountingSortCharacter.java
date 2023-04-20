package SeachingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSortCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countSort(char[] arr) {
        int n = arr.length;
        int[] frequency = new int[26];
        char[] output = new char[n];
        for (int i = 0; i < n; i++) {
            frequency[arr[i] - 'a']++;
        }
        //find the prefix sum -> no of element <= (min,max)
        for (int i = 1; i < frequency.length; i++) {
            frequency[i] += frequency[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            //start from end and place it in output auxiliary array
            int index = frequency[arr[i] - 'a'] - 1;
            output[index] = arr[i];
            frequency[arr[i] - 'a']--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
