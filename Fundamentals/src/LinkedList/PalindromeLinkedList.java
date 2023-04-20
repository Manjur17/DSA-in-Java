package LinkedList;

import java.util.Scanner;

public class PalindromeLinkedList {
    public static ListNode takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements:");
        int data = s.nextInt();
        ListNode head = null,tail = null;
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

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode secondNode = reverseList(mid);
        ListNode tempNode = secondNode;
        while (head != null && secondNode != null) {
            if (head.val != secondNode.val) {
                break;
            }
            head = head.next;
            secondNode = secondNode.next;
        }
        reverseList(tempNode);
        if (head == null || secondNode == null) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = takeInput();
        boolean ans = isPalindrome(head);
        System.out.println(ans);
    }
    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
