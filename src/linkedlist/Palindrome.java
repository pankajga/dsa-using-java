package linkedlist;

public class Palindrome {
	
	private Node head;
	
	class Node {
		String data;
		Node next;
		Node(String data) {
			this.data = data;
			this.next = null;
		}
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
	
	public Node findMid() {
		if(head == null) {
			return null;
		}
		Node slow = head;
		Node fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public Boolean checkPalindrome(Node midNode) {
		Node secondHead = midNode.next;
		midNode.next = null;
		
		//Reverse second part
		Node prevNode = secondHead;
		Node currentNode = secondHead.next;
		Node nextNode = currentNode.next;
		prevNode.next = null;
		while(nextNode != null) {
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.next;
		}
		secondHead = currentNode;
		secondHead.next = prevNode;
		
		//check palindrome
		Node firstPart = head;
		Node secondPart = secondHead;
		while(firstPart != null) {
			if(firstPart.data != secondPart.data) {
				return false;
			}
			firstPart = firstPart.next;
			secondPart = secondPart.next;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		Palindrome list = new Palindrome();
		list.addLast("1");
		list.addLast("2");
		list.addLast("2");
		list.addLast("1");
		list.addLast("1");
		Node midNode = list.findMid();
		Boolean isPalindrome = list.checkPalindrome(midNode);
		System.out.println(isPalindrome);
		long endTime = System.currentTimeMillis();
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		long actualMemUsed=afterUsedMem-beforeUsedMem;
		System.out.println(endTime - startTime);
		System.out.println(actualMemUsed);
	}

}
