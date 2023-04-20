package Strings;

public class StringsBasics {
    public static void main(String[] args) {
        char[] arr = {'C','o','d','i','n','g'};
        String s =new String(arr); //converting char array to string
        System.out.println(arr);
        String s3 = new String("example");//creating java string by new keyword
        System.out.println(s3);
        String str1 = ""; //Empty String
        String str2 = " "; //Not an empty string
        String str3 = "Coding"; //creating string by java string literal
        String str4 = " is fun."; //Declaration And Initialisation
        str3 += str4; //String Concatenation(str1 = str1 + str2)
        System.out.println(str3);
        str4 = str4.concat(str2); //String Concatenation
        System.out.println(str4);
        System.out.println(str3.charAt(2)); //Accessing Character at index 2 of string 3
        System.out.println(str3.length()); //Gives Length of string
        boolean b = str4.equals(str3); //If two strings are Equal
        System.out.println(b);
        System.out.println(str3.contains("ing")); //Gives boolean as return type
        System.out.println(str3.compareTo(str4)); //Gives Difference of ASCII value

    }
}
