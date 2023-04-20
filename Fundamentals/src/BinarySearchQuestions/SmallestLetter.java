package BinarySearchQuestions;

import java.util.Scanner;

public class SmallestLetter {
    public static char[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = s.nextInt(); // asking the size of array to be created
        char[] input = new char[size]; //creating the array
        for (int i = 0; i < size; i++) {
            input[i] = s.next().trim().charAt(0);
        }
        return input;
    }

    public static char smallestLetter(char[] letters, char target) {
        int startIndex = 0, endIndex = letters.length - 1;
        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (target < letters[mid]) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return letters[startIndex % letters.length];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] letters = takeInput();
        char target = s.next().trim().charAt(0);
        char ans = smallestLetter(letters, target);
        System.out.println(ans);
    }
}
