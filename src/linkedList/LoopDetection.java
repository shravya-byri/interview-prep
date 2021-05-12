package linkedList;
import static linkedList.MyLinkedList.*;


public class LoopDetection {
    static Node loopDetection (Node head) {
        Node slow = head;
        Node fast = head;
        while ((slow != null) && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return slow;
            }
        }

     return null;
    }
    static Node FindNode(Node head) {
        Node connect = loopDetection(head);
        Node meet = head;
        while (connect != null) {
            connect = connect.next;
            meet = meet.next;
            if (connect == meet) {
                return connect;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        Node head = null;
        head = insert(1,head);
        insert(2,head);
        insert(3,head);
        insert(4,head);
        insert(5,head);
        insert(6,head);
        insert(7,head);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head.next.next.next;
        Node res = FindNode(head);

        if (res != null){
            System.out.println(res.data);
        } else
            System.out.println("No loop exist");

    }
}
