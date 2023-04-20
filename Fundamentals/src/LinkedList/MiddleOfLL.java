package LinkedList;

import java.util.Scanner;

public class MiddleOfLL {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static class Solution {
        public static ListNode takeInput() {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the elements:");
            int data = s.nextInt();
            ListNode head = null, tail = null;
            while (data != -1) {
                ListNode currentNode = new ListNode(data);
                if (head == null) {
                    head = currentNode;
                    tail = currentNode;
                } else {
                    tail.next = currentNode;
                    tail = currentNode;
                }
                data = s.nextInt();
            }
            return head;
        }

        public static ListNode middleNode(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        public static ListNode middleNode2(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode fast = head;
            ListNode slow = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        public static void printLinkedList(ListNode head) {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            ListNode head = takeInput();
//            head = middleNode(head);
            head = middleNode2(head);
            printLinkedList(head);
        }
    }
}
