package binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class PreorderInorderPostorderTraversal {
	
	static class Node {
		Node left,right;
		int data;
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class Ref {
		Node refData;
		int pointer;
		Ref(Node data, int pointer) {
			this.refData = data;
			this.pointer = pointer;
		}
	}
	
	static void getTraversal(Node root, ArrayList<Integer> preorder, ArrayList<Integer> inorder, ArrayList<Integer> postorder) {
		Stack<Ref> stack = new Stack<>();
		stack.push(new Ref(root, 1));
		while(!stack.isEmpty()) {
			Ref data = stack.pop();
			if(data.pointer == 1) {
				preorder.add(data.refData.data);
				data.pointer+=1;
				stack.push(data);
				if(data.refData.left != null) {
					stack.push(new Ref(data.refData.left,1));
				}			
			}
			else if(data.pointer == 2) {
				inorder.add(data.refData.data);
				data.pointer+=1;
				stack.push(data);
				if(data.refData.right != null) {
					stack.push(new Ref(data.refData.right,1));
				}	
			}
			else {
				postorder.add(data.refData.data);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> preorder = new ArrayList<>();
		ArrayList<Integer> inorder = new ArrayList<>();
		ArrayList<Integer> postorder = new ArrayList<>();
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		getTraversal(root, preorder, inorder, postorder);
		System.out.println(preorder);
		System.out.println(inorder);
		System.out.println(postorder);
	}

}
