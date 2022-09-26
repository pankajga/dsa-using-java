package linkedlist;

public class DeleteNthNodeFromEnd {
	
	private Node head;
	
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
			System.out.println(head);
			return;
		}
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data+" -> ");
			currentNode = currentNode.next;
		}
		System.out.print("null");
	}
	
	public void deleteNode(int n) {
		int size = 0;
		if(head == null) {
			return;
		}
		Node currentNode = head;
		while(currentNode != null) {
			size++;
			currentNode = currentNode.next;
		}
		int nodeIndexToDelete = size-n+1;
		int count = 2;
		if(nodeIndexToDelete == 1 && size == 1) {
			head = null;
			return;
		}
		Node prevNode = head;
		Node presentNode = head.next;
		while(presentNode != null) {
			if(count == nodeIndexToDelete) {
				prevNode.next = presentNode.next;
				presentNode.next = null;
				break;
			}
			prevNode = prevNode.next;
			presentNode = presentNode.next;
			count++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		DeleteNthNodeFromEnd list = new DeleteNthNodeFromEnd();
		list.addFirst("list");
		list.addFirst("Linked");
		list.addFirst("demo");
		list.addLast("of");
		list.addLast("DSA");
		//list.printList(); // demo -> Linked -> list -> of -> DSA -> null
		//long startTime = System.currentTimeMillis();
		list.deleteNode(1); // demo -> Linked -> list -> DSA -> null
		list.printList();
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		System.out.println(timeTaken);  // 1ms
	}

}
