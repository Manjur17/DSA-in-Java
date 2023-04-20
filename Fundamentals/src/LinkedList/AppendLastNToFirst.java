package LinkedList;

import java.util.Scanner;

public class AppendLastNToFirst {
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
    public static int lenOfLL(ListNode<Integer> head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static ListNode<Integer> appendLastNToFirst(ListNode<Integer> head, int n){
       if (n == 0 || head == null){
           return head;
       }
       int cnt = lenOfLL(head);
       if (n < cnt) {
           int skip = cnt - n;
           ListNode<Integer> newHead = head;
           ListNode<Integer> newTail = null;
           while (skip > 0) {
               newTail = newHead;
               newHead = newHead.next;
               skip--;
           }
           ListNode<Integer> tempHead = head;

           if(newTail != null) {
              newTail.next = null;
              head = newHead;
          }
           while (newHead.next != null) {
               newHead = newHead.next;
               newHead.next = tempHead;
           }
       }
//        Node<Integer> fast = head;
//        Node<Integer> slow = head;
//        Node<Integer> tempHead = head;
//        for (int i = 0; i < n;i++){
//            fast = fast.next;
//        }
//        while (fast.next != null){
//            slow = slow.next;
//            fast =fast.next;
//        }
//        Node<Integer> temp = slow.next;
//        slow.next = null;
//        fast.next = tempHead;
//        head = temp;
        return head;
    }
    public static void printLinkedList(ListNode<Integer> head){
        ListNode<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ListNode<Integer> head = takeInput();
        System.out.println("Enter the number of nodes to be moved from last to the front:");
        int n = s.nextInt();
        head = appendLastNToFirst(head,n);
        printLinkedList(head);
    }
}
