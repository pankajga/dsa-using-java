package stack;

public class StackImplementation {
	
	static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static class Stack {
		public Node head;
		public Boolean isEmpty() {
			return head == null;
		}
		public void push(int data) {
			Node newData = new Node(data);
			if(isEmpty()) {
				head = newData;
				return;
			}
			newData.next = head;
			head = newData;
		}
		public int pop() {
			if(isEmpty()) {
				return -1;
			}
			int data = head.data;
			head = head.next;
			return data;
		}
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
