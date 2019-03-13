package algorithms;

public class ReverseLinkedList<E> {

	Node<E> head;
 	
	class Node<E> {
		Node<E> next;
		E data;

		Node(E data) {
			this.data = data;
		}
	}
	
	public Node<E> reverseList() {
		if(head != null){
			Node<E> curr = null;
			curr = head;
			Node<E> previous = null;
			Node<E> temp = null;
			while(curr != null){
				temp = curr.next;
				curr.next = previous;
				previous = curr;
				curr = temp;
			}
			head = previous;
			return head;
		}else{
			throw new NullPointerException("List is Empty.");
		}
		
	}
	
	public void print(Node<E> node) {
		while(node != null){
			System.out.print(node.data + " ");
			if(node.next == null){
				break;
			}else{
				node = node.next;
			}
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList<Integer> link = new ReverseLinkedList<>();
		link.head = link.new Node<>(5);
		link.head.next = link.new Node<>(20);
		link.head.next.next = link.new Node<>(21);
		link.head.next.next.next = link.new Node<>(25);
		
		link.head = link.reverseList();
		link.print(link.head);
		
		
	}
}
