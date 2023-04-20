package Strings;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";
        String s = "Hello my name";
        System.out.println(s);
        System.out.println(s.length()); // gives the length of the string
        System.out.println(s.charAt(4)); // charAt gives the character at the particular index
        System.out.println(s.indexOf('e')); // gives the index of first occurrence of the character
        System.out.println(s.indexOf('e', s.length())); // gives you the occurrence of the character starting from 5
        System.out.println(s.indexOf("my", 7)); // similar behaviour with strings
        System.out.println(s.toUpperCase()); // self-explanatory
        System.out.println(s.toLowerCase()); // self explain
        System.out.println(Character.toUpperCase('a'));
        System.out.println(s.substring(3)); // gives substring from index 3 till end
        System.out.println(s.substring(1, 3)); // gives substring starting from index 1 going until index 2
        System.out.println(s.replace('e', 'f')); // replaces all instances of the character
        System.out.println(s.replace("my", "oop"));
        String[] srr = s.split(" ");// returns an array of strings split at " "
        for (String x : srr) {
            System.out.println(x);
        }
        int[] arr = {1, 4, 5, 3, 3, 6, 7, 7};
        System.out.println(Arrays.toString(arr));  // convert array to string and print it
    }
}
