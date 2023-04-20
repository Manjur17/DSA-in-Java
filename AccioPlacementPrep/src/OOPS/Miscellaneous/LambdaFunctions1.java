package OOPS.Miscellaneous;

import java.util.Arrays;
import java.util.Comparator;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;

    }
}

class GFG {
    public static void main(String[] args) {

        Point[] arr = {new Point(10, 20), new Point(5, 30), new Point(30, 40)};

        Arrays.sort(arr, (p1, p2) -> p1.x - p2.x);
//        Arrays.sort(arr, (p1, p2) -> p1.y - p2.y);
//        Arrays.sort(arr, Comparator.comparingInt(p -> p.x));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}

