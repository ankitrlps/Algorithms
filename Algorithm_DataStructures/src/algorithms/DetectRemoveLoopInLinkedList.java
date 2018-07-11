package algorithms;

public class DetectRemoveLoopInLinkedList {
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
		}
	}
	
	private void detectAndRemove(Node node) {
		if(node == null || node.next == null){
			return;
		}
		
	}
	
	public static void main(String[] args) {
		
		DetectRemoveLoopInLinkedList link = new DetectRemoveLoopInLinkedList();
		Node head = link.new Node(40);
		head.next = link.new Node(20);
		head.next.next = link.new Node(21);
		head.next.next.next = link.new Node(25);
		head.next.next.next.next = link.new Node(7);
		head.next.next.next.next.next = link.new Node(85);
		head.next.next.next.next.next.next = link.new Node(60);
		
		//creating a loop
		head.next.next.next.next.next.next.next = head.next.next;
		
	}
}
