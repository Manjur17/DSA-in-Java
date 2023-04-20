package Hashing;

public class Main {
    public static void main(String[] args) {
        CustomHashMaps<String, Integer> map = new CustomHashMaps<>();
        for (int i = 0; i < 20; i++) {
            map.insert("abc" + i, i + 1);
            System.out.print(map.loadFactor() + " ");
        }
        map.remove("abc3");
        map.remove("abc6");
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print("abc" + i + ":" + map.get("abc" + i) + "  ");
        }
    }
}
