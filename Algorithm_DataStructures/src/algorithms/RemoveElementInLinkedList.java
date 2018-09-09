package algorithms;

/*
 * 	Input:  1->2->6->3->4->5->6, val = 6
	Output: 1->2->3->4->5
*/
public class RemoveElementInLinkedList {
	Node<Integer> head;
	
	public static Node<Integer> removeElements(Node<Integer> head, int val) {
		
		Node<Integer> temp = new Node<Integer>(0);
		temp.setNext(head);
		Node<Integer> res = temp;
		
		while(res.getNext() != null){
			if(res.getNext().getData() == val){
				Node<Integer> kiki = res.getNext();
				res.setNext(kiki.getNext());
			}else{
				res = res.getNext();
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
		head.next = new Node<Integer>(2);
		head.next.next = new Node<Integer>(6);
		head.next.next.next = new Node<Integer>(3);
		head.next.next.next.next = new Node<Integer>(4);
		head.next.next.next.next.next = new Node<Integer>(5);
		head.next.next.next.next.next.next = new Node<Integer>(6);
		
		Node<Integer> result = removeElements(head, 6);
		print(result);
	}
}
