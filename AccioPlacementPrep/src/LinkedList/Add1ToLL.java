package LinkedList;

import java.util.Scanner;

public class Add1ToLL {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        Node head = null;
        int n = (int) Math.log10(val) + 1;
        LinkedListNew list = new LinkedListNew();
        for (int i = 0; i < n; i++) {
            head = list.insertFirst(val % 10);
            val /= 10;
        }

        Node temp = head;

        int carry = helper(temp, 1);
        if (carry != 0) {
            Node node = new Node(carry);
            node.next = head;
            head = node;
        }
        list.print(head);
    }


    static int helper(Node head, int carry) {
        if (head == null) {
            return 1;
        }
        carry = helper(head.next, carry);
        int temp = head.val + carry;
        carry = temp / 10;
        head.val = temp % 10;
        return carry;
    }

}
