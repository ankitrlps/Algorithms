package algorithms;

public class PairSwapInLinkedList<E> {

	Node<E> head;

	class Node<E> {
		Node<E> next;
		E data;

		Node(E data) {
			this.data = data;
		}
	}

	public void print(Node<E> node) {
		while (node != null) {
			System.out.print(node.data + " ");
			if (node.next == null) {
				break;
			} else {
				node = node.next;
			}
		}
	}

	public void swap() {
		Node<E> previous = null;
		Node<E> current = null;
		Node<E> temp = null;

		current = head;
		temp = head.next;
		
		while(current != null && temp != null){
			current.next = temp.next;
			temp.next = current;
			if(previous == null){
				previous = temp;
				head = previous;
				previous = previous.next;
			}else{
				previous.next = temp;
				previous = previous.next.next;
			}
			current = current.next;
			if(current == null) break;
			temp = temp.next.next.next;
		}

	}

	public static void main(String[] args) {
		PairSwapInLinkedList<Integer> link = new PairSwapInLinkedList<>();
		link.head = link.new Node<>(5);
		link.head.next = link.new Node<>(20);
		link.head.next.next = link.new Node<>(21);
		link.head.next.next.next = link.new Node<>(25);
		link.head.next.next.next.next = link.new Node<>(30);
		link.head.next.next.next.next.next = link.new Node<>(35);


		// link.print(link.head);
		System.out.println();

		link.swap();

		link.print(link.head);

	}
}
