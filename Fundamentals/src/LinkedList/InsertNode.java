package LinkedList;

import java.util.Scanner;

public class InsertNode {
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
    public static ListNode<Integer> insertNode(ListNode<Integer> head, int n, int i){
        ListNode<Integer> listNodeToBeInserted = new ListNode<>(n);
        ListNode<Integer> prev = head;
        int pos = 0;
        if (i == 0){
            listNodeToBeInserted.next = head;
            head = listNodeToBeInserted;
            return head;
        }else{
            while (prev != null && pos < i - 1){
                pos++;
                prev = prev.next;
            }
            if (prev != null){
                listNodeToBeInserted.next = prev.next;
                prev.next = listNodeToBeInserted;
            }
        }
        return head;
    }
    public static void printLinkedList(ListNode<Integer> newHead){
        ListNode<Integer> temp = newHead;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ListNode<Integer> head = takeInput();
        System.out.println("Enter the position and the current node:");
        int i = s.nextInt();
        int n = s.nextInt();
        head = insertNode(head,n,i);
        printLinkedList(head);
    }
}
