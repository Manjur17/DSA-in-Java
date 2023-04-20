package Arrays;

import java.util.Arrays;

public class LinearSearchInString {
    public static boolean linearSearchString2(String str,char target){
            if (str.length() == 0) {
                return false;
            }
//            char [] arr = str.toCharArray();
            for(char ch : str.toCharArray()) {
                if (ch == target) {
                    return true;
                }
            }
            return false;
    }
    public static int linearSearchString1(String str,char target){
        if (str.length() == 0) {
            return -1;
        }
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == target){
               return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        String str = "Harry";
        char target = 'r';
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(linearSearchString1(str,target));
        System.out.println(linearSearchString2(str,target));

    }
}
