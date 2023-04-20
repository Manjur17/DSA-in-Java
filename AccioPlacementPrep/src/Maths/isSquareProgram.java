package Maths;

import java.util.Scanner;

public class isSquareProgram {
     static class Point{
        int x, y;
        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    static int distSq(Point p, Point q){
        return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y);
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();
        int x3= sc.nextInt();
        int y3= sc.nextInt();
        int x4= sc.nextInt();
        int y4= sc.nextInt();
        Point p1 = new Point(x1, y1), p2 = new Point(x2, y2), p3 = new Point(x3, 3), p4 = new Point(x4, y4);
        System.out.println(isSquare(p1, p2, p3, p4) ? "Yes" : "No");
    }

    static boolean isSquare(Point p1, Point p2, Point p3, Point p4){
        int d2 = distSq(p1, p2); // from p1 to p2
        int d3 = distSq(p1, p3); // from p1 to p3
        int d4 = distSq(p1, p4); // from p1 to p4

        if (d2 == 0 || d3 == 0 || d4 == 0)
            return false;

        // If lengths if (p1, p2) and (p1, p3) are same, then following conditions must meet to form a square.
        // 1) Square of length of (p1, p4) is same as twice the square of (p1, p2)
        // 2) Square of length of (p2, p3) is same as twice the square of (p2, p4)

        if (d2 == d3 && 2 * d2 == d4 && 2 * distSq(p2, p4) == distSq(p2, p3)){
            return true;
        }

        // The below two cases are similar to above case
        if (d3 == d4 && 2 * d3 == d2 && 2 * distSq(p3, p2) == distSq(p3, p4))
        {
            return true;
        }
        return d2 == d4 && 2 * d2 == d3 && 2 * distSq(p2, p3) == distSq(p2, p4);
    }
}
