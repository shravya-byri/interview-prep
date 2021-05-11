package linkedList;

import static linkedList.MyLinkedList.*;

public class IntersectionofLL {
    static Node intersectionNode(Node head1, Node head2) {
       Node current1 = head1;
       Node current2 = head2;
       int diff = findLLLength(head1) - findLLLength(head2);
         if (diff > 0) {
             while (diff != 0) {
                 diff = diff - 1;
                 current1 = current1.next;
             }
         }
         if (diff < 0) {
             while ( diff != 0  ) {
                 current2 = current2.next;
                 diff = diff +1;
             }
         }
        while (current1 != null && current2 != null) {
            if (current1 != current2) {
                current1 = current1.next;
                current2 = current2.next;
            } else return current1;
        }
        return null;
     }
    static int findLLLength(Node head) {
        int count1 = 0;
        Node current1 = head;
        while (current1 != null) {
            count1 = count1 + 1;
            current1 = current1.next;

        }
        return count1;
    }

    public static void main(String[] args) {
        Node head1 = null;
        head1 =insert(1,head1);
        //insert(2,head1);
        //insert(7,head1);
        insert(6,head1);
        insert(3,head1);
        insert(4,head1);
        insert(5,head1);
        Node head2 = null;
        head2 = insert(9,head2);
        insert(8,head2);
        head2.next.next = head1.next.next;
        printLL(head1);
        printLL(head2);
        Node res = intersectionNode(head2, head1);
        if (res == null) {
            System.out.println("Intersection does not exist");
        } else {
            System.out.println(res.data);
        }

    }
}
