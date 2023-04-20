package LinkedList;

import java.util.Scanner;

public class PrintReverseLL {
    public static ListNode<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements:");
        int data = s.nextInt();
        ListNode<Integer> head = null,tail = null;
        while (data != -1){
            ListNode<Integer> currentListNode = new ListNode<>(data);
            if (head == null){
                head = currentListNode;
                tail = currentListNode;
            }else{
                tail.next = currentListNode;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void printLinkedList(ListNode<Integer> head) {
        if(head == null){
           return;
       }
       printLinkedList(head.next);
        System.out.print(head.data + " ");
    }

        public static void main (String[]args){
            ListNode<Integer> head = takeInput();
            printLinkedList(head);
        }
}
