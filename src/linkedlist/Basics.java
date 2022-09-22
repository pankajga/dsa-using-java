package linkedlist;

/* A linked list is basically number of lists linked to each other. The values are know as Node. Each Node
 * contains a value and a next- which holds the reference of the next Node (basically holds the reference type
 * which is of type Node itself.
 * 
 * The first element is called HEAD, last is called TAIL. the next value of TAIL is always null.
 * 
 * https://www.youtube.com/watch?v=oAja8-Ulz6o&list=PLfqMhTWNBTe0sPLFF91REaJQEteFZtLzA&index=6
 */

// Basic implementation of a linked list
public class Basics {
	
	Node head;
	private int size;
	
	public Basics() {
		// TODO Auto-generated constructor stub
		this.size = 0;
	}
	
	class Node {
		String data;
		Node next;
		
		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
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
	
	public void deleteFirst() {
		if(head == null) {
			return;
		}
		head = head.next;
		size--;
	}
	
	public void deleteLast() {
		if(head == null) {
			return;
		}
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node last = head.next;
		while(last.next != null) {
			secondLast = secondLast.next;
			last = last.next;
		}
		secondLast.next = null;
	}
	
	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basics list = new Basics();
		list.addFirst("list");
		list.addFirst("Linked");
		list.addFirst("demo");
		list.addLast("of");
		list.addLast("DSA");
		list.printList(); // demo -> Linked -> list -> of -> DSA -> null
		list.deleteFirst();
		list.printList(); // Linked -> list -> of -> DSA -> null
		list.deleteLast();
		list.printList(); // Linked -> list -> of -> null
	}

}
