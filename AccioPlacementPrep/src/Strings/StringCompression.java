package Strings;

import java.util.Scanner;

public class StringCompression {
    public int compress(char[] chars) {
        int i = 0, ansIndex = 0;
        int n = chars.length;
        while (i < n){
            int j = i+1;    // next unique character
            while (j<n && chars[i] == chars[j]){
                j++;
            }
            //now we will either have traverse the chars array or encounter the next unique character

            chars[ansIndex++] = chars[i]; //first unique character

            int count = j-i;
            if (count > 1){
                String s = String.valueOf(count);
                for (int k = 0; k < s.length(); k++) {
                    chars[ansIndex++] = s.charAt(k);
                }
            }
            i = j; //unique character =  next unique character
        }
        return ansIndex;
    }
}
