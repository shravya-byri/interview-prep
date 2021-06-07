package stack;

public class MyStack {
    static public int numberOfElements = 0;
    static private int[] a;

    public MyStack(int size) {
        a = new int[size];
    }

    public static void push(int i) {

        if (numberOfElements < a.length) {
            a[numberOfElements] = i;
            numberOfElements++;
            printStack();
        } else {
            System.out.println("The stack if full cannot push further");
        }

        System.out.println(" The size is" + " " + size());
    }
    public static void pop() {
        System.out.println(" The size is" + " " + size());

        if (numberOfElements == 0) {
            System.out.println("The stack is empty. Cannot pop");

        } else {
            numberOfElements--;
            printStack();
        }

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
        s.push(5);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.push(6);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //printStack();


    }
}
