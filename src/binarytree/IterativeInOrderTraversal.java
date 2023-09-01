package binarytree;

import java.util.Stack;

public class IterativeInOrderTraversal {
	
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
		Stack<Node> stack = new Stack<>();
		Node node = root;
		while(true) {
			if(node != null) {
				stack.push(node);
				node = node.left;
			}
			else {
				if(stack.isEmpty()) {
					break;
				}
				node = stack.pop();
				System.out.println(node.data);
				node = node.right;
			}
		}
//		while(stack.size() > 0) {
//			Node data = stack.peek();
//			if(data.left == null) {
//				Node node = stack.pop();
//				System.out.println(node.data);
//			}
//			else {
//				stack.push(data.left);
//				continue;
//			}
//			
//			if(stack.size() > 0 && stack.peek().right != null) {
//				Node data1 = stack.peek();
//				Node node = stack.pop();
//				System.out.println(node.data);
//				stack.push(data1.right);
//			}
//		}
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
