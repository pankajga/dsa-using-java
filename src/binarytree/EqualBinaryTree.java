package binarytree;

public class EqualBinaryTree {
    static class Node {
        Node left, right;
        int data;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static boolean getTraversal(Node n1, Node n2){
        if(n1 == null || n2 == null){
            return n1 == n2;
        }
        return n1.data == n2.data && getTraversal(n1.left, n2.left) && getTraversal(n1.right, n2.right);
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.right.left = new Node(4);
        node.right.left.left = new Node(5);
        node.right.left.left.left = new Node(6);
        node.right.right = new Node(7);
        node.right.right.right = new Node(8);
        node.right.right.right.right = new Node(9);
        node.right.right.right.right.right = new Node(9);
        Node node1 = new Node(1);
        node1.left = new Node(2);
        node1.right = new Node(3);
        node1.right.left = new Node(4);
        node1.right.left.left = new Node(5);
        node1.right.left.left.left = new Node(6);
        node1.right.right = new Node(7);
        node1.right.right.right = new Node(8);
        node1.right.right.right.right = new Node(9);
        node1.right.right.right.right.right = new Node(9);
        System.out.println(getTraversal(node, node1));
    }
}
