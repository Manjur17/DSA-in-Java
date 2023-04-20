package RecursionHardProblemsAndBacktracking;

import java.util.ArrayList;

public class PermutationsStrings {
    public static void main(String[] args) {
        permutations("", "abc");

        ArrayList<String> ans = permutationsList("", "abc");
        System.out.println("\n" + ans);
        System.out.println(permutationsCount("", "abc"));
    }

    static void permutations(String ans, String str) {
        if (str.isEmpty()) {
            System.out.print(ans + "\t");
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            permutations(f + ch + s, str.substring(1));
        }
    }
    static ArrayList<String> permutationsList(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);

        // local to this call
        ArrayList<String> ansList = new ArrayList<>();

        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            ansList.addAll(permutationsList(f + ch + s, str.substring(1)));
        }
        return ansList;
    }
    static int permutationsCount(String ans, String str) {
        if (str.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            count = count + permutationsCount(f + ch + s, str.substring(1));
        }
        return count;
    }
}
