package algorithms;

public class MergeTwoSortedLinkedListWithoutNewNode {

	static class Node<E>{
		Node<E> next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
	} 
	
	private static Node<Integer> merger(Node<Integer> list1, Node<Integer> list2) {
		
		Node<Integer> temp;
		Node<Integer> head;
		
		if(list1.getData() < list2.getData()){
			head = list1;
		}else{
			head = list2;
			list2 = list1;
			list1 = head;
		}
		
		while(list1.getNext() != null){
			if(list1.getNext().getData() > list2.getData()){
				temp = list1.getNext();
				list1.setNext(list2);
				list2 = temp;
			}else{
				list1 = list1.getNext();
			}
		}
		
		list1.setNext(list2);
		
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> li1 = new Node<>(10);
		li1.next = new Node<>(20);
		li1.next.next = new Node<>(30);
		li1.next.next.next = new Node<>(40);
		li1.next.next.next.next = new Node<>(50);
		
		Node<Integer> li2 = new Node<>(15);
		li2.next = new Node<>(25);
		li2.next.next = new Node<>(35);
		li2.next.next.next = new Node<>(45);
		li2.next.next.next.next = new Node<>(55);
		li2.next.next.next.next.next = new Node<>(65);
		li2.next.next.next.next.next.next = new Node<>(75);
		
		Node<Integer> node = merger(li1, li2);
		
		while(node != null){
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
		
	}
}
