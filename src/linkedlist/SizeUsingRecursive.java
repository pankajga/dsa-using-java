package linkedlist;

import linkedlist.Basics.Node;

public class SizeUsingRecursive {
	
	private static Node head;
	
	class Node {
		String data;
		Node next;
		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void addFirst(String data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(String data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new Node(data);
	}
	
	public int getLengthRecursive(Node currNode) {
		int length;
		if(currNode == null) {
			return 0;
		}
		length = getLengthRecursive(currNode.next);
		return length+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SizeUsingRecursive list = new SizeUsingRecursive();
		list.addFirst("list");
		list.addFirst("Linked");
		list.addFirst("demo");
		list.addLast("of");
		list.addLast("DSA");
		System.out.println(list.getLengthRecursive(head));
	}

}
