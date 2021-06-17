package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class BST {
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
    public static Node insertBST(Node root, int num) {
        if (root == null) {
            return new Node(num,null,null);
        } else {
            Node current = root;
            if (current.data > num){
                current.left = insertBST(current.left, num);
            } else current.right = insertBST(current.right,num);
        }
        return root;
    }

    public static void levelOrderPrinting(Node root){
        Deque<Node> q = new ArrayDeque<>();
        if (root == null) {
            return;
        }
        q.add(root);

        while (!q.isEmpty()) {
            Node t = q.poll();
            if (t.left != null) {
                q.add(t.left);
            }
            if (t.right != null) {
                q.add(t.right);
            }
            System.out.print(t.data + " ");
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(3,2,5,4,6));
        Node root = null;
        for(int i = 0; i < a.size(); i++) {
            root = insertBST(root,a.get(i));
        }
        levelOrderPrinting(root);
    }

}
