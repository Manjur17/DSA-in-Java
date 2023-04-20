package LinkedList;

import java.util.Scanner;

public class Node {
    int val;
    Node next;

    public Node(int data) {
        this.val = data;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node() {
    }
}
