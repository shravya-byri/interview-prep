package linkedList;
import linkedList.MyLinkedList.*;

import java.util.HashMap;
import java.util.HashSet;

import static linkedList.MyLinkedList.*;

public class ReverseLinkedList {
    static Node reversal(Node head) {
        Node current = head;
        Node p = null;
        Node n = null;
        while (current != null) {
            n = current.next;
            current.next = p;
            p = current;
            current = n;
        }
     return p;
    }



    public static void main(String[] args) {
        Node head = null;
       head = insert(1,head);
        insert(2,head);
        insert(3,head);
        insert(4,head);
        insert(5,head);
        printLL(head);
        printLL(reversal(head));

    }
}
