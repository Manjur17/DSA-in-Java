package LinkedList;

public class DeleteNodeInALinkedList {
    //Here node is the node bo be deleted and head
    public void deleteNode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
