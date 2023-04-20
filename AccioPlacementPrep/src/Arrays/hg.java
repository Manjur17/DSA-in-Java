package Arrays;

import java.util.HashMap;

public class hg {
    public static void main(String[] args) {
        String[] arr = {"ghi@hotmail.com", "def@yahoo.com", "ghi@gmail.com", "abc@channelier.com",
                "abc@hotmail.com", "def@hotmail.com", "abc@gmail.com", "abc@yahoo.com", "def@channelier.com", "jkl@hotmail.com", "ghi@yahoo.com",
                "def@gmail.com" };
        sendmail(arr);
    }

    public static void sendmail(String[] arr) {
        HashMap<String, String> map = new HashMap<>();

        for (String s : arr) {
            int i1 = s.indexOf("@"), i2 = s.indexOf(".");
            String key = s.substring(i1 + 1, i2);
            String put = s.substring(0, i1);
            put += "@" + key + ".com";

            if (!map.containsKey(key)) {
                map.put(key, put);
            } else {
                String get = map.get(key);
                if (put.compareTo(get) < 0) {
                    get = put;
                }
                map.put(key, get);
            }

        }

        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }

    public static double find(int[] arr) {
        int count = 0, sum = 0;
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }


        for (int num : arr) {
            if (num == max || num == min) {
                sum += num;
                count++;
            }
        }

        double avg = (double) (sum) / count;
        return avg;
    }

    public static int count(int[] arr) {
        int count = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int avg = sum / arr.length;

        for (int num : arr) {
            if (num == avg) count++;
        }

        return count;
    }
}
