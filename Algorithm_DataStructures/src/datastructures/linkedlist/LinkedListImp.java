package datastructures.linkedlist;

public class LinkedListImp {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}
	public static void main(String[] args) {
		LinkedListImp link = new LinkedListImp();
		
		link.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		link.head.next = second;
		second.next = third;
		third.next = fourth;
		
		link.print();
	}
	
	void print(){
		Node n = head;
		while(n != null){
		System.out.print(n.data + " ");
		n = n.next; 		
	}}
}
