package algorithms;

public class ReverseLinkedList {
	
	Node head;
	
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	Node reverse(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		
		return node;
	}
	
	static void print(Node node){
		while(node != null){
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkedList rev = new ReverseLinkedList();
		rev.head = rev.new Node(1);
		rev.head.next = rev.new Node(2);
		rev.head.next.next = rev.new Node(3);
		rev.head.next.next.next = rev.new Node(4);
		rev.head.next.next.next.next = rev.new Node(5);
		
		print(rev.head);
		
		rev.head = rev.reverse(rev.head);
	
		System.out.println(" ");
		print(rev.head);
	}
}
