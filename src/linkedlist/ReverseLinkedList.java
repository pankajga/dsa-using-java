package linkedlist;


public class ReverseLinkedList {
	
	static Node head;
	
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
	
	public void printList() {
		if(head == null) {
			System.out.println(head.data);
			return;
		}
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data+" -> ");
			currentNode = currentNode.next;
		}
		System.out.print("null");
	}
	
	public void reverseLinkedListIterative() {
		if(head == null || head.next == null) {
			return;
		}
		Node prevNode = head;
		Node currentNode = head.next;
		Node nextNode = currentNode.next;
		prevNode.next = null;
		while(nextNode != null) {
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.next;
		}
		head = currentNode;
		head.next = prevNode;
	}
	
	// College Life Didi code
	// head.next.next = head
	// head.next = null
	public Node reverseLinkedListRecursion(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseLinkedListRecursion(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	// My code- works like a charm
	public void reverseLinkedListRecursion(Node prevNode, Node currentNode) {
		String initData = prevNode.data;
		if(currentNode.next == null) {
			currentNode.next = prevNode;
			head = currentNode;
			return;
		}
		reverseLinkedListRecursion(prevNode.next, currentNode.next);
		currentNode.next = prevNode;
		if(prevNode.data.equals(initData)) {
			prevNode.next = null;
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList list = new ReverseLinkedList();
		list.addFirst("list");
		list.addFirst("Linked");
		list.addFirst("demo");
		list.addLast("of");
		list.addLast("DSA");
		//list.printList(); // demo -> Linked -> list -> of -> DSA -> null
		//list.reverseLinkedList();
		//list.reverseLinkedListRecursion(head,head.next);
		//list.printList();
		head = list.reverseLinkedListRecursion(head); // DSA -> of -> list -> Linked -> demo -> null
		list.printList();
	}

}
