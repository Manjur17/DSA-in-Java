package OOPS.FileHandling;

import java.io.*;
import java.util.HashMap;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\projects\\OOP-Java-Exercise\\Polymorphism\\sample.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        HashMap<String, Integer> hm = new HashMap<>();

        String st;
        while ((st = br.readLine()) != null) {
            String[] arr = st.split(" ");
            for (String s : arr) {
                if (hm.containsKey(s)) {
                    hm.put(s, hm.get(s) + 1);
                } else {
                    hm.put(s, 1);
                }
            }
        }

        for (String s : hm.keySet()) {
            System.out.println(s + " : " + hm.get(s));
        }
    }
}
