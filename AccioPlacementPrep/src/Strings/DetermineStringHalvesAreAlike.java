package Strings;

public class DetermineStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        int n = s.length();

        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2);

        int count1 = 0, count2 = 0;

        for (int i = 0; i < n / 2; i++) {
            if (isValid(a.charAt(i))) count1++;
            if (isValid(b.charAt(i))) count2++;
        }

        return count1 == count2;
    }

    private boolean isValid(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
}
