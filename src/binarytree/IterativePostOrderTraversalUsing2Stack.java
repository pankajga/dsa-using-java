package binarytree;

import java.util.Stack;

import binarytree.IterativePreOrder.Node;

public class IterativePostOrderTraversalUsing2Stack {
	
	static class Node {
		Node left,right;
		int data;
		Node(int data){
			this.data = data;
		}
	}
	
	static void traversal(Node root) {
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		if(root == null) {
			return;
		}
		stack1.push(root);
		while(!stack1.isEmpty()) {
			root = stack1.pop();
			stack2.add(root);
			if(root.left != null) {
				stack1.add(root.left);
			}
			if(root.right != null) {
				stack1.add(root.right);
			}
			
		}
		while(!stack2.isEmpty()) {
			System.out.println(stack2.pop().data);
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
