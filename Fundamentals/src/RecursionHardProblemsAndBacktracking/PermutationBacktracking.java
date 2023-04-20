package RecursionHardProblemsAndBacktracking;

class PermutationBacktracking {

    public static void permute(String str, int idx, int n) {
        if (idx == n) {
            System.out.print(str + " ");
            return;
        }

        for (int i = idx; i <= n; i++) {
            if (isSafe(str, idx, i, n)) {
                str = swap(str, i, idx);
                permute(str, idx + 1, n);
                str = swap(str, i, idx);
            }
        }
    }

    public static boolean isSafe(String str, int idx, int i, int n) {
        if (idx != 0 && str.charAt(idx - 1) == 'A' && str.charAt(i) == 'B')
            return false;
        else if (n == (idx + 1) && str.charAt(i) == 'A' && str.charAt(idx) == 'B')
            return false;
        return true;
    }

    public static String swap(String a, int i, int j)
    {
        char[] charArray = a.toCharArray();
        char temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "ABC";

        permute(str, 0, str.length() - 1);
    }
}
