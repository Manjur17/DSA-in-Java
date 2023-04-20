package LinkedList;

import java.util.Scanner;

public class TakeInput {
    public static ListNode<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements:");
        int data = s.nextInt();
        ListNode<Integer> head = null,tail = null;
        System.out.println("The elements are:");
        while (data != -1){
            ListNode<Integer> currentListNode = new ListNode<>(data);
            if (head == null){
                head = currentListNode;
                tail = currentListNode;
            }else{
                tail.next = currentListNode;
                tail = currentListNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void printLinkedList(ListNode<Integer> head){
        ListNode<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode<Integer> head = takeInput();
        printLinkedList(head);
    }
}
