package LinkedList;

import java.util.Scanner;

public class CompareLL {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        LinkedListNew list1 = new LinkedListNew();
        LinkedListNew list2 = new LinkedListNew();
        Node head1 = null, head2 = null;
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            head1 = list1.insert(val);
        }
        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            head2 = list2.insert(val);
        }
        list1.print(head1);
        list2.print(head2);
        if (list1.size() != list2.size()) {
            System.out.println("0");
            return;
        }
        Node temp1 = head1, temp2 = head2;
        System.out.println(compare(temp1, temp2));
    }

    public static int compare(Node head1, Node head2) {

        while(head1 != null && head2 != null){
            if(head1.val != head2.val) return 0;

            head1 = head1.next;
            head2 = head2.next;
        }

        if(head1 != null || head2 != null){
            return 0;
        }
        return 1;
    }
}
