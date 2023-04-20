package Strings;

public class StringSubstringAndContains {
    public static void main(String[] args) {
        //Substrings
        String s1 = "Coding";
        String subString = s1.substring(6);
        System.out.println(subString + " " + subString.length());
        System.out.println(s1.substring(1,6));
        System.out.println(s1.substring(0,5));
        //string contains()
        String str = "Welcome to JavaTpoint";
        boolean isContains = str.contains("JavaTpoint");
        System.out.println(isContains); //true
           //case sensitive
        System.out.println(str.contains("javaTpoint")); //false
    }
}
