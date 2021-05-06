package linkedList;
import linkedList.MyLinkedList.*;

import java.util.HashMap;
import java.util.HashSet;

import static linkedList.MyLinkedList.*;

public class SumList {
    static Node sumofLL(Node head1, Node head2){
        padding(head1, head2);
        Node curr1 = head1;
        Node curr2 = head2;
        int carry = 0;
        int num = 0;
        int sum;
        Node head3 = null;
        while (curr1 != null && curr2 != null) {
            sum = curr1.data + curr2.data + carry;
            carry = sum/10;
            num = sum % 10;
           head3 = insert(num, head3);
            curr1 = curr1.next;
            curr2 = curr2.next;
        }


        return head3;
    }

    static void padding(Node head1, Node head2) {
        Node current1 = head1;
        Node current2 = head2;
        int length1 = 0;
        int length2 = 0;
        while (current1 != null) {
            current1 = current1.next;
            length1 = length1 + 1;
        }
        while (current2 != null) {
            current2 = current2.next;
            length2 = length2 + 1;
        }
        insert(0, head1);
        insert(0,head2);
        if ((length1) - (length2) != 0) {
            if (length1 > length2) {
                int t = length1 - length2;
                for (int i = 0; i < t; i++) {
                    insert(0, head2);
                }
            } else {
                int t = length2 - length1;
                for (int i = 0; i < t; i++) {
                    insert(0, head1);
                }
            }

        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(7, null);
        insert(1,head1);
        insert(7,head1);
        insert(4,head1);
        Node head2 = new Node(2, null);
        insert(9,head2);
        insert(5,head2);
        printLL(head1);
        System.out.println("+");
        printLL(head2);
        printLL(sumofLL(head1, head2));

    }
}
