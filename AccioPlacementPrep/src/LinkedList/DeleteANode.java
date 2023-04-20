package LinkedList;

import java.util.Scanner;

public class DeleteANode {

    public static void main(String[] args) throws java.lang.Exception {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNew list = new LinkedListNew();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.add(val);
        }
        int index = sc.nextInt();
        list.delete(index);
        list.print();
    }

}
