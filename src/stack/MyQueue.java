package stack;

public class MyQueue {
    static public int rear = -1;
    static public int front = -1;
    static private int[] a;

    public MyQueue(int size) {
        a = new int[size];
    }

    public static void push(int i) {
        if (rear == -1 && front == -1) {
            rear = 0;
            front = 0;
            a[rear] = i;
        } else if (rear < a.length-1) {
            rear++;
            a[rear] = i;
        } else {
            System.out.println("the Queue is full");
        }
        printQueue();
 }

    public static void pop() {
        if (rear == -1 && front == -1) {
            System.out.println("The Queue is empty");
        } else if (front == rear) {
            front = rear = -1;
        } else{
            front++;
        }
        printQueue();

    }
    public static void printQueue() {
        if (front == -1) {
            System.out.println("The Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue m = new MyQueue(5);
        m.push(5);
        m.push(6);
        m.push(7);
        m.push(9);
        m.push(10);
        m.pop();
        m.push(8);
        m.pop();
        m.pop();




    }
}
