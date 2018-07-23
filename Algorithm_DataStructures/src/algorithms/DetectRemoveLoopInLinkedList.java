package algorithms;

public class DetectRemoveLoopInLinkedList {
	class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	private static Node detectAndRemove(Node node) {
		if (node == null || node.next == null) {
			return null;
		}
		Node slow = node;
		Node fast = node;
		Node fast_preview = node;

		while (fast != null && fast.next != null) {
			fast_preview = slow;
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}

		if (slow == node && fast == node) {
			fast_preview.next = null;
			 return node;
		}

		if (slow == fast) {
			slow = node;

			while (slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}
			if (slow.next == fast.next) {
				fast.next = null;
				return node;
			}
		}
		return null;
	}

	private static void print(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {

		DetectRemoveLoopInLinkedList link = new DetectRemoveLoopInLinkedList();
		Node head = link.new Node(40);
		head.next = link.new Node(20);
/*		head.next.next = link.new Node(21);
		head.next.next.next = link.new Node(25);
		head.next.next.next.next = link.new Node(7);
		head.next.next.next.next.next = link.new Node(85);
		head.next.next.next.next.next.next = link.new Node(60);*/

		// printing before creating loop
		System.out.println("printing before creating loop");
		print(head);

		// creating a loop
		//head.next.next.next.next.next.next.next = head.next.next;

		head.next.next = head;
		// detecting and removing the loop
		Node node = detectAndRemove(head);
		System.out.println();

		// printing new LL
		System.out.println("printing after creating loop");
		print(node);

	}
}
