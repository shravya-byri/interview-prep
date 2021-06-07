package stack;

public class MyStack {
    static private int numberOfElements;
    static private int[] a;
    static int m;
    public MyStack(int size) {
        a = new int[size];
        numberOfElements = 0;
        m = size;
    }

    public static void push(int i) {

        if (numberOfElements < m) {
            a[numberOfElements] = i;
            numberOfElements++;
        }
        else
            System.out.println("The stack if full");

    }
    public static void pop() {
        if (numberOfElements == 0) {
            System.out.println("The stack is empty. Cannot pop");
        }
        else numberOfElements--;
    }
    public static int size() {
        return numberOfElements;
    }
    public static void printStack() {
        for ( int i = 0; i < numberOfElements; i ++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MyStack s = new MyStack(4);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.push(6);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        printStack();
        System.out.println(size());

    }
}
