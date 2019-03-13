package algorithms;

public class RemoveDuplicatesFromSortedLinkedList {
	Node<Integer> head;
	
	public static Node<Integer> RemoveDuplicates(Node<Integer> head) {
		if(head == null) return null;
		
        Node<Integer> temp = new Node<>(0);
        Node<Integer> prev = head;
        temp.setNext(prev);
        Node<Integer> curr = head.getNext();
        
        while(prev.getNext() != null){
            if(prev.getData() == curr.getData()){
                prev.setNext(curr.getNext());
                curr = curr.getNext();
            }else{
                prev = prev.getNext();
                curr = curr.getNext();
            }
        }
        return temp.getNext();
	}

	
	public static void print(Node<Integer> head) {
		Node<Integer> curr = head;
		while(curr != null){
			System.out.print(curr.getData() + " ");
			curr = curr.getNext();
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(1);
		head.next = new Node<Integer>(1);
		head.next.next = new Node<Integer>(2);
		head.next.next.next = new Node<Integer>(2);
		head.next.next.next.next = new Node<Integer>(4);
		head.next.next.next.next.next = new Node<Integer>(5);
		head.next.next.next.next.next.next = new Node<Integer>(6);
		
		Node<Integer> result = RemoveDuplicates(head);
		
		print(result);
		
	}

}
