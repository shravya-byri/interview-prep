package linkedList;
import linkedList.MyLinkedList.*;

import java.util.HashMap;
import java.util.HashSet;

import static linkedList.MyLinkedList.*;


public class PalindromeLL {
    static boolean palindromeLL(Node head) {
        Node current = head;
        Node middle = runnerTechniqueMidNode(current);
        Node midhead = reversal(middle.next);
        printLL(midhead);
        while (midhead != null) {
            if (current.data == midhead.data) {
                current = current.next;
                midhead = midhead.next;
            } else return false;
        }

        return true;

    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(1, head);
        insert(2,head);
        insert(3,head);
        insert(2,head);
        insert(1,head);
        //insert(3,head);
        System.out.println(palindromeLL(head));

    }
}
