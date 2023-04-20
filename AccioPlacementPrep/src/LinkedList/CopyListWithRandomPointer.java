package LinkedList;

import java.util.HashMap;

class NodeC {
    int val;
    NodeC next;
    NodeC random;

    public NodeC(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
    public NodeC copyRandomList(NodeC head) {
        NodeC dummy = new NodeC(0);
        NodeC newTemp = dummy;
        NodeC temp = head;
        HashMap<NodeC, NodeC> hm = new HashMap<>(); // original ,newList
        //first iteration for inserting deep nodes of every node in the hashmap.
        while (temp != null) {
            // copy val and next ptr
            newTemp.next = new NodeC(temp.val);
            newTemp = newTemp.next;

            hm.put(temp, newTemp);

            temp = temp.next;
        }

        //second iteration for linking next and random pointer as given question.
        temp = head;
        while (temp != null) { // copy random ptr
            NodeC x = hm.get(temp);
            x.random = hm.get(temp.random);
            temp = temp.next;
        }

        return dummy.next;
    }
}
