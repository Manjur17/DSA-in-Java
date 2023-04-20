package SeachingAndSorting;

import java.util.Arrays;

public class SmallestValueOfTheRearrangedNumber {
    public static void main(String[] args) {
        String s = 203645871 + "";
        String[] arr = s.split("");
        Arrays.sort(arr);

        for (String value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println(minimum_NumberGFG(s));
    }

    public long smallestNumber(long num) {
        boolean isNegative = false;
        if (num < 0) {
            num *= -1;
            isNegative = true;
        }

        char[] arr = String.valueOf(num).toCharArray();
        int n = arr.length;
        StringBuilder ans;
        Arrays.sort(arr);


        if (isNegative) {
            ans = new StringBuilder(String.valueOf(arr));
            ans.reverse();
            ans.insert(0, '-'); //for converting, it back to negative
        } else {
            int i = 0;
            while (i < n) {
                if (arr[i] != '0')
                    break;

                i++;
            }

            //swap arr[i],arr[0] if i > 0 -> we have at-least 1 zero
            if (i > 0 && i < n) {
                arr[0] = arr[i];
                arr[i] = '0';
            }

            ans = new StringBuilder(String.valueOf(arr));
        }

        return Long.parseLong(ans.toString());
    }

    //smallest permutation of given number
    public static String minimum_NumberGFG(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        Arrays.sort(arr);

        int i = 0;
        while (i < n) {
            if (arr[i] != '0')
                break;

            i++;
        }

        //swap arr[i],arr[0] if i > 0 -> we have at-least 1 zero
        if (i > 0 && i < n) {
            arr[0] = arr[i];
            arr[i] = '0';
        }

        return new String(arr);
    }

}
