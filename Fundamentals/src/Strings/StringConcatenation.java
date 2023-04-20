package Strings;

public class StringConcatenation {
    public static void main(String[] args) {
        //Approach 1- Using + (string concatenation) operator
        String s1 = "Sachin" + " Tendulkar";
        System.out.println(s1);
        String s2 = 50 + 30 + "Sachin" + 40 + 40;
        System.out.println(s2);

        //Approach 2 - Using concat() method
        String str1 = "Java String";
        str1.concat("is immutable"); //Result of 'String.concat()' is ignored
        System.out.println(str1);
        str1=str1.concat(" is immutable so assign it explicitly");
        System.out.println(str1);

        //Concatenating multiple string
        String str2 = "Hello";
        String str3 = "Javatpoint";
        String str4 = "Reader";
              // Concatenating one string
        String str5 = str2.concat(str3);
        System.out.println(str5);
             // Concatenating multiple strings
        String str6 = str2.concat(str3).concat(str4);
        System.out.println(str5);

        //concatenating spaces and special chars to the string object
        String st1 = "Hello";
        String st2 = "Javatpoint";
        String st3 = "Reader";
            // Concatenating Space among strings
        String st4 = st1.concat(" ").concat(st2).concat(" ").concat(st3);
        System.out.println(st4);
            // Concatenating Special Chars
        String st5 = st1.concat("!!!");
        System.out.println(st5);
        String st6 = st1.concat("@").concat(st2);
        System.out.println(st6);

    }
}
