package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class PrintIntersectionUnique {
    public static int[] arrayFunction() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        int[] input = new int[size]; //creating the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] arr1 = arrayFunction();
        int[] arr2 = arrayFunction();
        printIntersection(arr1, arr2);
    }

    public static void printIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr1) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (int i : arr2) {
            if (map.containsKey(i)) {
                int freq = map.get(i);
                if (freq > 0) {
                    System.out.print(i + " ");
                    map.put(i, 0);
                }
            }
        }
    }
}
