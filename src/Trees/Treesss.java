package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Treesss {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int n, Node l, Node r) {
            data = n;
            left = l;
            right = r;
        }

    }

    static void inOrder(Node n) {
        Node current = n;
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.data + " ");
            inOrder((current.right));
        }


    }

    public static Node newLeaf(int n) {
        return new Node(n, null, null);
    }

    public static Node insertBST(Node current, int data) {
        if (current == null) {
            return new Node(data, null, null);
        } else if (current.data > data) {
            current.left = insertBST(current.left, data);
        } else
            current.right = insertBST(current.right, data);
        return current;

    }

    public static void levelOrder(Node root) {
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node current = q.poll();
            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }
            System.out.print(current.data + " ");
        }


    }

    public static Node search(int e, Node current) {
        if (current == null) {
            System.out.print("tree doesn't exist");
            return null;
        } else if (e == current.data) {
            //  System.out.print(current.data);
            return current;
        } else if (e > current.data) {
            return search(e, current.right);
        } else {
            return search(e, current.left);
        }
    }

    public static Node delete(int k, Node current) {
        if (current == null) {
            return null;
        }
        if (k < current.data) {
            current.left = delete(k, current.left);
        } else if (k > current.data) {
            current.right = delete(k, current.right);
        } else {
            if (isLeaf(current)) {
                return null;
            } else if (hasOneChild(current)) {
                if (current.left == null) {
                    return current.right;
                } else return current.left;
            } else {
                Node pred = inorderPredecessor(current);
                current.data = pred.data;
                current.left = delete(pred.data, current.left);
            }
        }
        return current;
    }

    public static boolean isLeaf(Node n) {
        return (n.left == null && n.right == null);
    }

    public static boolean hasOneChild(Node n) {
        return ((n.left == null || n.right == null) && !isLeaf(n));

    }

    public static Node inorderPredecessor(Node n) {
        Node current = n.left;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 2, 5, 4, 1));
        Node root = newLeaf(a.get(0));
        for (int i = 1; i < a.size(); i++) {
            insertBST(root, a.get(i));
        }
        // Node newRoot = delete(4, root);
//        delete(4, root);
//        levelOrder(root);
        // System.out.println();
        inOrder(root);
        //Node result = delete(3,root);
        //System.out.println(result.data);
        //System.out.println(inorderPredecessor(root).data);

    }
}