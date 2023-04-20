package Strings;

public class SubstringOfAnotherString {
    public static void main(String[] args) {
        // checking if a string is a substring of another string
        String mainstring = "Hello";
        String sub = "el";
        if (mainstring.indexOf(sub) == -1) {
            System.out.println("Not a substring");
        } else {
            System.out.println("Substring");
        }
    }
}
