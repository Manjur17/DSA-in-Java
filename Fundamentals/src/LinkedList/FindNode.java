package LinkedList;

import java.util.Scanner;

public class FindNode {
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
    public static int returnIndex(ListNode<Integer> head , int n){
        if (head == null){
            return -1;
        }
        ListNode<Integer> temp = head;
        int count = 0;
        while (temp != null){
            if (temp.data == n){
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ListNode<Integer> head = takeInput();
        System.out.println("Enter the node:");
        int n = s.nextInt();
        System.out.println(returnIndex(head,n));
    }
}
