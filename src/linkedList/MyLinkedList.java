package linkedList;

public class MyLinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int d, Node n) {
            data = d;
            next = n;
        }
    }


    public static Node insert(int n, Node head) {
        if ( head == null) {
            return new Node(n, null);
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node (n, null);
        return head;
    }
    public static void printLL(Node head) {
        Node curr = head;
        while( curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();

    }

    public static Node delete(Node head, int n) {
        if ( n == 0){
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < n - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;

        }
        return head;
    }
    public static Node runnerTechniqueMidNode(Node head){
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node getNthNodeFromLast(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for ( int i = 0; i < n; i ++){
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node getMiddleNode(Node head){
        int count = 0;
        Node current1 = head;
        Node current2 = head;
        Node result;
        while (current1 != null){
            count = count + 1;
            current1 = current1.next;
        }
        for (int i = 0; i < (count)/2; i++){
            current2 = current2.next;
        }
        result = current2;
        return result;
    }

    public static void main(String[] args) {
       Node head = insert(5,null);
        insert(6, head);
        insert(7,head);
        insert (8, head);
        insert(9, head);
        insert(10, head);
        printLL(head);
//        Node p = delete(head,2);
//        printLL(p);
        System.out.print(getNthNodeFromLast(head,3).data);

    }
}
