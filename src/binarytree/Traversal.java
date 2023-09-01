package binarytree;

public class Traversal {
	
	static class Node {
		Node left, right;
		String data;
		Node(String data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static void preOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	static void inOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}
	
	static void postOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node("1");
		root.left = new Node("2");
		root.right = new Node("3");
		root.left.left = new Node("4");
		root.left.right = new Node("5");
		root.right.left = new Node("6");
		root.right.right = new Node("7");
		System.out.println("***********pre order traversal************");
		preOrderTraversal(root);
		System.out.println("***********in order traversal************");
		inOrderTraversal(root);
		System.out.println("***********post order traversal************");
		postOrderTraversal(root);
	}

}
