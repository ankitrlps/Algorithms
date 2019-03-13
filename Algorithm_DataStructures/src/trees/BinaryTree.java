package trees;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTree {

	Node root;
	
	private void print(Node node) {
		while(node != null){
			System.out.println(node.data + " ");
			node = node.left; // for right sided elements - change it to node.right;
		}
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);
		
		tree.print(tree.root);
	}
}