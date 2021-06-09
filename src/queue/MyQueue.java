package queue;

public class MyQueue {
    static int[] a;
    static int head;
    static int tail;
    public MyQueue(int size) {
        a = new int[size];
        tail = 0;
    }

    public static void add(int n) {
        if (tail == a.length) {
            System.out.println("Full");
        }
        a[tail] = n;
        tail++;
    }

    public static int remove() {
        if (tail == 0) {
            System.out.println("Nothing Left");
            return -1;
        }
        int res = a[0];
        moveFront();
        return res;
    }

    private static void moveFront() {
        for (int i=1; i <= tail; i++) {
            a[i-1] = a[i];
        }
        tail--;
    }

    public static boolean isEmpty() {
        return tail == 0;
    }

    public static void printQ() {
        for (int i=0; i < tail; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        q.add(1);
        q.add(4);
        q.add(3);
        q.add(5);
        q.remove();
        q.remove();
        q.remove();
        q.printQ();
    }
}
