package Recursion;

public class SkipFunctionsInStrings {
    public static void main(String[] args) {
        String str = "baccdah";
        String str1="baccappdah";
        skipCharacter("",str);
        System.out.println(skipCharacter(str));
        System.out.println(skipString(str1));
        System.out.println(skipString1(str1));
    }
    //passing ans as argument
    public static void skipCharacter(String ans,String str){
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char c = str.charAt(0);
        if (c == 'a'){
            skipCharacter(ans, str.substring(1));
        }else {
            skipCharacter(ans + c, str.substring(1));
        }
    }
    //passing ans in function body
    public static String skipCharacter(String str){
        if (str.isEmpty()){
            return "";
        }
        char c = str.charAt(0);
        if (c == 'a'){
            return skipCharacter(str.substring(1));
        }else {
            return c + skipCharacter(str.substring(1));
        }
    }
    //skipping a string
    public static String skipString(String str){
        if (str.isEmpty()){
            return "";
        }
        if (str.startsWith("apple")){
            return skipString(str.substring(5));
        }else {
            return str.charAt(0) + skipString(str.substring(1));
        }
    }
    //Skip a string if it's not the required string
    public static String skipString1(String str){
        if (str.isEmpty()){
            return "";
        }
        if (str.startsWith("app") && !str.startsWith("apple")){
            return skipString1(str.substring(3));
        }else {
            return str.charAt(0) + skipString1(str.substring(1));
        }
    }
}
