package BackTracking;

import java.util.ArrayList;
import java.util.HashSet;

public class PermutationOfString {
    public static void main(String[] args) {
        permutations("abd", "");
        System.out.println();
        ArrayList<String> ans = permutationsList("abd", "");
        System.out.println(ans);
        System.out.println(permutationsCount("abd"));
        permute("abd", 0);
    }

    static void permutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding the ith character
            String rest = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            permutations(rest, ans + ch);
        }
    }

    static ArrayList<String> permutationsList(String str, String ans) {
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }


        // local to this call
        ArrayList<String> ansList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            ansList.addAll(permutationsList(ros, ans + ch));
        }

        return ansList;
    }

    static int permutationsCount(String str) {
        if (str.isEmpty()) {
            return 1;
        }
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            String ros = str.substring(0, i) + str.substring(i + 1);
            count += permutationsCount(ros);
        }

        return count;
    }

    static void permute(String str, int index) {
        if (index == str.length()) {
            System.out.print(str + " ");
            return;
        }

        for (int i = index; i < str.length(); i++) {
            str = swap(str, i, index);
            permute(str, index + 1);
            str = swap(str, i, index);
        }
    }

    static String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
