package datastructures.linkedlist;

import java.util.NoSuchElementException;

public class LinkedListCompImpl<E> {

	private Node<E> head;
	int size = 0;

	public LinkedListCompImpl() {
		head = null;
	}

	public void add(E data) {
		if (data != null) {
			Node<E> newNode = new Node<E>(data);
			if (head == null) {
				head = newNode;
				size++;
				return;
			} else {
				Node<E> curr = head;
				while (curr != null) {
					if (curr.getNext() != null) {
						curr = curr.getNext();
					} else {
						curr.setNext(newNode);
						size++;
						break;
					}
				}
			}
		} else {
			return;
		}
	}

	public void addFirst(E data) {
		if (data != null) {
			Node<E> newNode = new Node<E>(data);
			Node<E> temp = null;
			temp = head;
			head = newNode;
			head.setNext(temp);
			size++;
		}
	}

	public void addLast(E data) {
		if (data != null) {
			Node<E> newNode = new Node<E>(data);

			Node<E> curr = null;
			curr = head;
			while (curr != null) {
				if (curr.getNext() == null) {
					curr.setNext(newNode);
					size++;
					break;
				} else {
					curr = curr.getNext();
				}
			}
		}
	}

	public void add(int index, E data) {
		if(index <= size){
			Node<E> newNode = new Node<E>(data);
			Node<E> previous = null;
			Node<E> curr = null;
			curr = head;
			int traverser = 0;
			while(traverser <= index){
				if(traverser == (index - 1)){
					previous = curr;
					curr = curr.getNext();
					previous.setNext(newNode);
					newNode.setNext(curr);
					size++;
					break;
				}else{
					traverser++;
					if(curr.getNext() != null)
						curr = curr.getNext();
				}
			}
		}else{
			throw new NoSuchElementException();
		}
	}

	public void removeFirst() {
		if (head != null) {
			head = head.getNext();
			size--;
		}
	}

	public void removeLast() {
		if (head != null) {
			Node<E> curr = head;
			Node<E> previous = null;
			while (curr != null) {
				if (curr.getNext() == null) {
					previous.setNext(null);
					size--;
					break;
				} else {
					previous = curr;
					curr = curr.getNext();
				}
			}
		} else {
			return;
		}
	}
	
	
	public void remove(int index) {
		if(index == 1){
			this.removeFirst();
			return;
		}
		if(index <= size){
			Node<E> curr = null;
			Node<E> previous = null;
			curr = head;			
			int traverser = 1;
			while(traverser < index){
				if(traverser == (index - 1)){
					previous = curr;
					curr = curr.getNext();
					if(curr.getNext() == null){
						previous.setNext(null);
						size--;
						break;
					}else{
						previous.setNext(curr.getNext());
						size--;
						break;
					}
				}else{
					traverser++;
					if(curr.getNext() != null)
						curr = curr.getNext();
				}
			}
		}else{
			throw new NoSuchElementException("Please check the index entered.");
		}
	}
		
	public E getFirst() {
		if(head == null){
			return null;
		}else{
			return head.getData();
		} 
	}
	
	public E getLast() {
		if(head == null){
			return null;
		}else{
			Node<E> curr = null;
			curr = head;
			while(curr != null){
				if(curr.getNext() == null){
					return curr.getData();
				}else{
					curr = curr.getNext();
				}
			}
		}
		return null;
	}
	
	public E get(int index) {
		if(index <= size){
			Node<E> curr = null;
			curr = head;
			int traverse = 1;
			while(traverse <= index){
				if(traverse == index){
					return curr.getData();
				}else{
					traverse++;
					if(curr.getNext() != null){
						curr = curr.getNext();
					}
				}
			}
			return null;
		}else{
			throw new NoSuchElementException();
		}
	}

	public void print(Node<E> node) {
		Node<E> curr = null;
		curr = node;
		while (curr != null) {
			if (curr.getNext() != null) {
				System.out.print(curr.getData() + " ");
				curr = curr.getNext();
			} else {
				System.out.print(curr.getData());
				break;
			}
		}
	}

	public static void main(String[] args) {
		LinkedListCompImpl<Integer> link = new LinkedListCompImpl<>();
		link.add(5);
		link.add(6);
		link.add(7);
		System.out.println("Initially added Elements:");
		link.print(link.head);
		System.out.println();

		// adding First
		System.out.println("Adding At First Node:");
		link.addFirst(1);
		link.print(link.head);
		System.out.println();

		//adding at last node
		System.out.println("Adding At Last Node:");
		link.addLast(10);
		link.print(link.head);
		System.out.println();
		
		//Remove First Element
		System.out.println("Remove First Element:");
		link.removeFirst();
		link.print(link.head);
		System.out.println();
		
		//Remove Last Element
		System.out.println("Removed Last");
		link.removeLast();		
		link.print(link.head);
		System.out.println();
		
		//adding element with index
		System.out.println("======== START: Adding element with index!! =========");
		link.add(1, 8);
		System.out.println();
		link.print(link.head);
		
		link.add(2, 65);
		System.out.println();
		link.print(link.head);
		
		link.add(4, 20);
		System.out.println();
		link.print(link.head);
		System.out.println();
		System.out.println("======== END: Adding element with index!! ========");
		System.out.println();
		
		System.out.println("========= START: Removing element from given index =========");
		link.remove(6);
		link.print(link.head);
		System.out.println();
		System.out.println("========== END: Removing element from given index =========");
		
		// Getting the Element
		System.out.println("Getting the Element:");
		System.out.println("First Element: " + link.getFirst());
		System.out.println("Last Element: " + link.getLast());
		System.out.println("Get element with index: " + link.get(2));
		
	}
}
