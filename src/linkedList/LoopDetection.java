package linkedList;
import static linkedList.MyLinkedList.*;


public class LoopDetection {

    static Node detectLoop(Node head) {
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
    static Node findNode(Node head) {
        Node connect = detectLoop(head);
        if (connect == null){
            return null;
        }
        Node meet = head;
        while (connect != meet) {
            connect = connect.next;
            meet = meet.next;
        }
        return connect;

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
        Node res = findNode(head);

        if (res != null){
            System.out.println(res.data);
        } else
            System.out.println("No loop exist");

    }
}
