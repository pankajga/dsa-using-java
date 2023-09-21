package BalancedBinaryTree;

public class BalancedBinaryTree {
    
    static class Node {
        Node left,right;
        int data;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int checkBalance(Node root){
        if(root == null){
            return 0;
        }
        int lh = checkBalance(root.left);
        if(lh == -1) return -1;
        int rh = checkBalance(root.right);
        if(rh == -1) return -1;
        if(Math.abs(lh-rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(6);
        node.left.left = new Node(3);
        node.left.right = new Node(4);
        node.left.right.left = new Node(5);
        node.right.right = new Node(7);
        node.right.right.right = new Node(7);
        int value = checkBalance(node);
        if(value == -1){
            System.out.println("Not a balanced Binary Tree");
        }
        else{
            System.out.println("Balanced Binary Tree");
        }
    }
}
