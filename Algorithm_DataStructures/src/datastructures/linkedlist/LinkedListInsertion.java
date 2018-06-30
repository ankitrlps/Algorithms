package datastructures.linkedlist;

public class LinkedListInsertion {
	Node head;

	class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}

	private void pushInFront(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	public static void main(String[] args) {
		LinkedListInsertion link = new LinkedListInsertion();
		
		int i = 0;
		while(i <= 50) {
			link.pushInFront(i);
			i = i + 5;
		}
		link.print();
	}

	private void print() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
}