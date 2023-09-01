package binarytree;

import java.util.Stack;

public class IterativePreOrder {
	
	static class Node {
		Node left, right;
		int data;
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static void traversal(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while(stack.size() > 0) {
			Node data = stack.pop();
			System.out.println(data.data);
			if(data.right != null) {
				stack.push(data.right);
			}
			if(data.left != null) {
				stack.push(data.left);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.left = new Node(6);
		root.left.left.right = new Node(7);
		traversal(root);
	}

}
