package LinkedList;

import java.util.Scanner;

public class DeleteNode {
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
    public static ListNode<Integer> deleteNode(ListNode<Integer> head, int i){
        ListNode<Integer> prev = head;
        int pos = 0;
        if (head == null){
            return null;
        }
        if (i == 0){
            head = prev.next;
            return head;
        }else{
            while (prev != null && pos < i - 1){
                pos++;
                prev = prev.next;
            }
            if (prev != null &&  prev.next != null){
                prev.next = prev.next.next;
            }
//            if (prev != null && i <= pos+1){
//                prev.next = prev.next.next;
//            }
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
        System.out.println("Enter the position:");
        int i = s.nextInt();
        head = deleteNode(head,i);
        printLinkedList(head);
    }
}
