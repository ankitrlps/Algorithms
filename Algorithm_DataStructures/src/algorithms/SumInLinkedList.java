package algorithms;

public class SumInLinkedList {

	Node head;

	class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	public Node addTwoNumbers(Node l1, Node l2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		l1 = reverse(l1);
		l2 = reverse(l2);

		sb1 = traverse(l1);
		sb2 = traverse(l2);
		System.out.println(sb1 + " || " + sb2);
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		System.out.println(s2);
		long num1 = Long.parseLong(s1);
		long num2 = Long.parseLong(s2);

		long sum = num1 + num2;
		System.out.println("Sum: " + sum);

		Node last = numToList(sum);
		return last;
	}

	public Node numToList(long num) {
		Node node = null;
		int quot = (int) (num / 10);
		int remainder = (int) (num % 10);

		head = new Node(remainder);
		node = head;

		while (node != null) {
			if (quot != 0) {
				remainder = quot % 10;
				node.next = new Node(remainder);
				quot = quot / 10;
				node = node.next;
			} else {
				break;
			}
		}
		return head;
	}

	public StringBuilder traverse(Node node) {
		StringBuilder temp = new StringBuilder();
		while (node != null) {
			temp.append(node.data);
			if (node.next == null) {
				break;
			} else {
				node = node.next;
			}
		}
		return temp;
	}

	public Node reverse(Node node) {
		Node curr = node;
		Node prev = null;
		Node temp = null;
		while (curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		node = prev;
		return node;
	}

	public void print(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			if (node.next == null) {
				break;
			} else {
				node = node.next;
			}
		}
	}

	public static void main(String[] args) {
		SumInLinkedList link = new SumInLinkedList();

		Node l1 = link.new Node(9);
/*		l1.next = link.new Node(4);
		l1.next.next = link.new Node(3);*/

		Node l2 = link.new Node(1);
		l2.next = link.new Node(9);
		l2.next.next = link.new Node(9);
		l2.next.next.next = link.new Node(9);
		l2.next.next.next.next = link.new Node(9);
		l2.next.next.next.next.next = link.new Node(9);
		l2.next.next.next.next.next.next = link.new Node(9);
		l2.next.next.next.next.next.next.next = link.new Node(9);
		l2.next.next.next.next.next.next.next.next = link.new Node(9);
		l2.next.next.next.next.next.next.next.next.next = link.new Node(9);

		Node root = link.addTwoNumbers(l1, l2);

		link.print(root);

	}
}
