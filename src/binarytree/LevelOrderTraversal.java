package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	static class Node {
		Node left, right;
		int data;
		Node(int data) {
			this.data = data;
		}
	}
	
	static void traversal(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(root.data);
		while(queue.size() > 0) {
			Node n = queue.poll();
			//list.add(n.left.data);
			if(n.left != null) {
				list.add(n.left.data);
				queue.offer(n.left);
			}
			//list.add(n.right.data);
			if(n.right != null) {
				list.add(n.right.data);
				queue.offer(n.right);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);
		root.right.right.left = new Node(14);
		root.right.right.right = new Node(15);
		traversal(root);
	}

}
