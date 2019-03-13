package algorithms;

//This is using MergeSort technique.

public class SortAnUnsortedLinkedList {

	Node head;

	class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	private static Node merger(Node list1, Node list2) {
		Node temp;
		Node head;

		if (list1.data < list2.data) {
			head = list1;
		} else {
			head = list2;
			list2 = list1;
			list1 = head;
		}

		while (list1.next != null) {
			if (list1.next.data > list2.data) {
				temp = list1.next;
				list1.next = list2;
				list2 = temp;
			} else {
				list1 = list1.next;
			}
		}

		list1.next = list2;

		return head;
	}

	private Node mergeSort(Node node) {
		if (node == null || node.next == null) {
			return node;
		}
		Node middle = findMiddle(node);
		Node nextToMiddle = middle.next;
		middle.next = null;
		Node left = mergeSort(node);
		Node right = mergeSort(nextToMiddle);

		Node sorted = merger(left, right);
		return sorted;
	}

	private Node findMiddle(Node node) {
		if (node == null) {
			return node; 
		}

		Node slow = node;
		Node fast = node;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
		return slow;
	}

	void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		} else {
			Node curr = head;
			while (curr != null) {
				if (curr.next == null) {
					curr.next = newNode;
					break;
				} else {
					curr = curr.next;
				}
			}
		}
	}

	private static void print(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		SortAnUnsortedLinkedList list = new SortAnUnsortedLinkedList();

		Node li2 = list.new Node(4);
		li2.next = list.new Node(2);
		li2.next.next = list.new Node(-42);
		li2.next.next.next = list.new Node(22);
		li2.next.next.next.next = list.new Node(54);
		li2.next.next.next.next.next = list.new Node(13);
		li2.next.next.next.next.next.next = list.new Node(1);

		print(li2);

		Node sortedNode = list.mergeSort(li2);

		print(sortedNode);

	}
}
