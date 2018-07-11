package algorithms;

public class MergeTwoLinkedListsByCreatingNewNode<E> {
	
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
	
	public Node<E> merger(Node<E> li1, Node<E> li2) {
		Node<E> runner = null;
		Node<E> head = null;
		
		if(li1.data < li2.data){
			runner = li1;
			li1 = runner.next;
		}else{
			runner = li2;
			li2 = runner.next;
		}
		
		head = runner;
		
		while(li1 != null && li2 != null){
			if(li1.data <= li2.data){
				runner.next = li1;
				runner = runner.next;
				li1 = li1.next;
			}else{
				runner.next = li2;
				runner = runner.next;
				li2 = li2.next;
			}
		}
		
		if(li1 == null) runner.next = li2;
		
		if(li2 == null) runner.next = li1;
		
		return head;
	}
	
	public static void main(String[] args) {
		MergeTwoLinkedListsByCreatingNewNode<Integer> merge = new MergeTwoLinkedListsByCreatingNewNode<>();
		
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
		
		Node<Integer> temp = merge.merger(li1, li2);
		
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
