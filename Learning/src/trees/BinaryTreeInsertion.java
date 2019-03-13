package trees;

import java.util.LinkedList;
import java.util.Queue;

// Using BFS
public class BinaryTreeInsertion<T> {

	Node<T> root;

	class Node<T> {
		T data;
		Node<T> left;
		Node<T> right;

		Node(T data) {
			this.data = data;
			left = right = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getLeft() {
			return left;
		}

		public void setLeft(Node<T> left) {
			this.left = left;
		}

		public Node<T> getRight() {
			return right;
		}

		public void setRight(Node<T> right) {
			this.right = right;
		}
	}

	private void createTree(T data) throws Exception {
		if (data != null) {
			Queue<Node<T>> createQue = new LinkedList<Node<T>>();
			Node<T> tempNode = new Node<T>(data);
			if (root == null) {
				root = tempNode; // create a new root
				System.out.println("root: " + root.getData());
			} else {
				createQue.add(root); // add root to queue

				// doing level order traversal (BFS) using while loop - retrieving and
				// removing the head - checking the removed head, if there is
				// any
				// left or right under it. If yes, then add to the queue for
				// later
				// traversal and if not, then insert the key by creating new
				// node.
				// After every level order traversal, we remove the head using
				// poll method.
				while (!createQue.isEmpty()) { // while queue is not empty
					tempNode = createQue.poll();
					if (tempNode.getLeft() == null) {
						tempNode.setLeft(new Node<T>(data));
						System.out.println("nodeLeft: " + tempNode.getLeft().getData());
						break;
					} else {
						createQue.add(tempNode.getLeft());
					}
					if (tempNode.getRight() == null) {
						tempNode.setRight(new Node<T>(data));

						System.out.println("nodeRight: " + tempNode.getRight().getData());
						break;
					} else {
						createQue.add(tempNode.getRight());
					}
				}
			}
		} else {
			throw new NullPointerException("No Value Entered.");
		}
		// System.out.println("created" + tempNode.getData());
	}

	private void insert(T data) {
		if (data != null) {
			if (root != null) {
				Node<T> tempNode;
				Queue<Node<T>> que = new LinkedList<Node<T>>();
				que.add(root);
				// do level-order traversal to find an empty node.
				while(!que.isEmpty()){
					tempNode = que.poll();
					if(tempNode.getLeft() == null){
						tempNode.setLeft(new Node<T>(data));
						System.out.println("");
						System.out.println("Inserted at Left Node: " + tempNode.getLeft().getData());
						break;
					}else{
						que.add(tempNode.getLeft());
					}
					if(tempNode.getRight() == null){
						tempNode.setRight(new Node<T>(data));
						System.out.println("");
						System.out.println("Inserted at Right Node: " + tempNode.getRight().getData());
						break;
					}else{
						que.add(tempNode.getRight());
					}
				}
			} else {
				throw new NullPointerException("No tree created.");
			}
		} else {
			throw new NullPointerException("Null value entered.");
		}
	}

	// InOrder: Left -> Parent -> Right 
	private void inOrderTraversal(Node<T> node) {
		if (node != null) {
			inOrderTraversal(node.getLeft());
			System.out.print(node.getData() + " ");
			inOrderTraversal(node.getRight());
		}
	}
	
	//PreOrder: Parent -> Left -> Right
	private void preOrderTraversal(Node<T> node) {
		
		if(node != null){
			System.out.print(node.getData() + " ");
			preOrderTraversal(node.getLeft());
			preOrderTraversal(node.getRight());
		}
	}
	
	private void postOrderTraversal(Node<T> node) {
		
		if(node != null){
			preOrderTraversal(node.getLeft());
			preOrderTraversal(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}

	public static void main(String[] args) {
		BinaryTreeInsertion<Integer> bTree = new BinaryTreeInsertion<>();

		for (int i = 0; i < 20; i++) {
			try {
				bTree.createTree(i); // creating a new tree.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//========Inserting a single node in an existing node. ==========
		bTree.insert(100);
		bTree.insert(101);
		//====================================================
		
		//======================In Order Traversal =============
		System.out.println("In Order Traversal:");
		bTree.inOrderTraversal(bTree.root);
		//=====================================
		
		//======================Pre Order Traversal ============
		System.out.println("\nPre Order Traversal:");
		bTree.preOrderTraversal(bTree.root);
		//=====================================
		
		//======================Post Order Traversal=============
		System.out.println("\nPost Order Traversal:");
		bTree.postOrderTraversal(bTree.root);
		//=====================================
	}
}