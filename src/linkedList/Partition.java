package linkedList;
import linkedList.MyLinkedList.*;

import java.util.HashMap;
import java.util.HashSet;

import static linkedList.MyLinkedList.*;

public class Partition {

    static Node partitionAround(Node head, int x) {

        Node current2 = head;
        Node current1 = head;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        while (current2.data >= x && current2 != last) {
            insert(current2.data,head);
            current2 = current2.next;
        }
        current1 = current2;

        while (current1 != last) {
            if (current1.next.data >= x) {
                insert(current1.next.data, head);
                current1.next = current1.next.next;
            } else current1 = current1.next;

        }
      return current2;
    }
    public static void main(String[] args) {
        Node head = new Node(6, null);
        insert(5,head);
        insert(8,head);
        insert(5,head);
        insert(10,head);
        insert(2,head);
        insert(2,head);
        printLL(head);
        head = partitionAround(head,5);
        printLL(head);

    }
}
