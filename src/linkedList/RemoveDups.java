package linkedList;
import linkedList.MyLinkedList.*;

import java.util.HashMap;
import java.util.HashSet;

import static linkedList.MyLinkedList.insert;
import static linkedList.MyLinkedList.printLL;

public class RemoveDups {

    public static void removeDups(Node head){
        HashSet<Integer> a = new HashSet();
        Node curr = head;
        a.add(curr.data);

        while (curr.next != null) {
            if (a.contains(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                a.add(curr.next.data);
                curr = curr.next;
            }
        }


    }
    public static void main(String[] args) {
        Node head = new Node(2, null);
        insert(2,head);
        insert(3,head);
        insert(4,head);
        insert(2,head);
        insert(6,head);
        insert(2,head);
        printLL(head);
        removeDups(head);
        printLL(head);

    }



}


