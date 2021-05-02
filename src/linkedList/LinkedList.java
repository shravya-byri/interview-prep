package linkedList;

public class LinkedList {
    static class Node {
        int data;
        Node next;
        public Node(int d, Node n) {
            data = d;
            next = n;
        }
    }

    public static Node newLL(int d) {
        Node r = new Node(d, null);
        return r;
    }

    public static void insert(int n, Node head) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node (n, null);

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


    public static void main(String[] args) {
       Node head = newLL(5);
        insert(6, head);
        insert(7,head);
        insert (8, head);
        insert(9, head);
        insert(10, head);
        printLL(head);
        Node p = delete(head,2);
        printLL(p);

    }
}
