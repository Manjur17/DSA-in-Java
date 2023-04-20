package LinkedList;

import java.util.Scanner;

public class PrintIthNode {
    public static ListNode<Integer> createLinkedList(){
        //Creating and storing the nodes
        ListNode<Integer> n1 = new ListNode<>(10);
        ListNode<Integer> n2 = new ListNode<>(20);
        ListNode<Integer> n3 = new ListNode<>(30);
        ListNode<Integer> n4 = new ListNode<>(40);
        //Linking the Node
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    public static void printIthNode(ListNode<Integer> head, int n){
        ListNode<Integer> temp = head;
        int position = 0;
        while (temp != null && temp.data != -1 && position < n){
            position++;
            temp = temp.next;
        }
        if (temp != null){
            System.out.println(temp.data);
        }
    }
    public static void resultList(int t){
        for (int i=1; i <= t; i++) {
            Scanner s = new Scanner(System.in);
            ListNode<Integer> head = createLinkedList();
            System.out.println("Enter the node which data you want");
            int n = s.nextInt();
            printIthNode(head,n);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the number of test cases or queries to be run:");
        int t=s.nextInt();
        resultList(t);
    }
}
