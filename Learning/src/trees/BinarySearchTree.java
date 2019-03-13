package trees;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	private void insert(int data) {
		this.root = this.insertCore(this.root, data);
	}

	private Node insertCore(Node node, int data) {
		if (node == null) {
			this.root = new Node(data);
			return this.root;
		}
		if (data < node.data) {
			node.left = insertCore(node.left, data);
		} else if (data > node.data) {
			node.right = insertCore(node.right, data);
		}
		return node;
	}

	private boolean search(int data) {
		return searchCore(this.root, data);
	}

	private boolean searchCore(Node node, int data) {
		if (node == null) {
			System.out.println("Null");
			return false;
		}
		if (node.data == data) {
			return true;
		}
		return data > node.data ? searchCore(node.right, data) : searchCore(node.left, data);
	}

	private void delete(int data) {
		this.root = deleteCore(this.root, data);
	}
	
	private Node deleteCore(Node node, int data) {
		if(node == null){
			return node;
		}
		if(node.data<data){
			
		}
		return node;

	}

	private class Node {
		Node left;
		Node right;
		int data;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(45);
		bst.insert(40);
		bst.insert(55);
		bst.insert(60);

		System.out.println(bst.search(40));

	}
}