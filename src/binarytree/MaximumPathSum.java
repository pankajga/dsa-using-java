package binarytree;

import java.util.Stack;

public class MaximumPathSum {
    static class Node {
        Node left, right;
        int data;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int getTraversalStriver(Node node, int maxValue[]){
        if(node == null) return 0;
        int left = Math.max(0, getTraversalStriver(node.left, maxValue));
        int right = Math.max(0, getTraversalStriver(node.right, maxValue));
        maxValue[0] = Math.max(maxValue[0], left+right+node.data);
        return Math.max(left, right) + node.data;
    }

    static int getTraversal(Node root, Stack<Integer> stack){
        if(root == null){
            return 0;
        }
        int lh = getTraversal(root.left, stack);
        int rh = getTraversal(root.right, stack);
        int sum = lh + rh + root.data;
        if(sum > stack.peek()){
            stack.add(sum);
        }
        return root.data+Math.max(lh, rh);
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
        // Node node = new Node(-10);
        // node.left = new Node(9);
        // node.right = new Node(20);
        // node.right.left = new Node(15);
        // node.right.right = new Node(7);
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(getTraversal(node, stack));
        System.out.println(stack);

        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        getTraversalStriver(node, maxValue);
        System.out.println(maxValue[0]);
    }
}
