package Strings;

public class StringIsRotatedByTwoPlaces {
    public static boolean isRotated(String str1, String str2) {
        // using substrings
        String s1 = str2.substring(2) + str2.substring(0, 2);
        String s2 = str2.substring(0, str2.length() - 2) + str2.substring(str2.length() - 2);

        return str1.equals(s1) || str1.equals(s2);
    }
}
