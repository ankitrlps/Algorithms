package trees;

public class BinarySearchTreeImpl {
	Node root;

	private class Node {
		Node left;
		Node right;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	private boolean search(int data) {
		if (root != null) {
			if (root.data == data) {
				return true;
			} else {
				Node curr = root;
				while (curr != null) {
					if (curr.data > data) {
						curr = curr.left;
					} else if (curr.data < data) {
						curr = curr.right;
					} else if (curr.data == data) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private void insert(int data) {
		Node tempNode = new Node(data);
		Node curr = null;
		if (root == null) {
			root = tempNode;
		} else {
			curr = root;
			while (curr != null) {
				if (curr.data > data) {
					if (curr.left == null) {
						curr.left = tempNode;
						break;
					} else {
						curr = curr.left;
					}
				}
				if (curr.data < data) {
					if (curr.right == null) {
						curr.right = tempNode;
						break;
					} else {
						curr = curr.right;
					}
				}
			}
		}
	}

	private void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}
	}

	private void postOrder(Node node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + " ");
		}
	}

	private void deleteInorderSuccessor(Node node, int temp) {
		Node parent = null;
		while (node.left != null) {
			parent = node;
			node = node.left;
		}
		if (parent.left.data == temp) {
			parent.left = null;
		} else if (parent.right.data == temp)  {
			parent.right = null;
		}
	}

	private int getInorderSuccessor(Node node) {
		while (node.left != null) {
			if (node.left != null) {
				node = node.left;
			} else {
				break;
			}
		}
		System.out.println("Deleting node value: " + node.data);
		return node.data;
	}

	private void delete(int data) {
		if (root != null) {
			Node curr = root;
			Node parent = null;
			while (curr != null) {
				// For traversing to the right node consisting "data"
				if (curr.data < data) {
					if (curr.right != null) {
						parent = curr;
						curr = curr.right;
					} else {
						System.out.println("Not Found");
						break;
					}
					// For traversing to the left node consisting "data"
				} else if (curr.data > data) {
					if (curr.left != null) {
						parent = curr;
						curr = curr.left;
					} else {
						System.out.println("Not Found");
						break;
					}
				} else if (curr.data == data) {
					// Deleting a leaf node
					if (curr.left == null && curr.right == null) {
						//System.out.println("Here: " + parent.left.data);
						if (parent.left.data == data) {
							parent.left = null;
							break;
						} else if (parent.right.data == data){
							parent.right = null;
							break;
						}
						// Deleting node with one child
					} else if (curr.left == null) {
						if (parent.right.data == data) {
							parent.right = curr.right;
						} else if (parent.left.data == data) {
							parent.left = curr.right;
						}
					} else if (curr.right == null) {
						if (parent.left.data == data) {
							parent.left = curr.left;
						} else if (parent.right.data == data) {
							parent.right = curr.left;
						}
					} // Deleting a node with two children
					else {
						int temp = getInorderSuccessor(curr.right);
						//deleteInorderSuccessor(curr.right, temp);
						delete(temp);
						curr.data = temp;
					}
				}
			}
		}else{
			System.out.println("Tree is null");
		}
	}

	public static void main(String[] args) {
		BinarySearchTreeImpl bTree = new BinarySearchTreeImpl();
		int[] keys = { 51, 50, 4, 9, 65, 12, 8, 3, 89, 7, 56, 14 };
		for (int i : keys) {
			bTree.insert(i);
			// System.out.println(i);
		}
		boolean res = bTree.search(50);
		System.out.println("res: " + res);
		System.out.println("---------Before Deletion--------");
		bTree.inOrder(bTree.root);
		System.out.println("\n");
		// bTree.postOrder(bTree.root);

		System.out.println("-------Deleting a Node--------");
		bTree.delete(7);
		bTree.inOrder(bTree.root);
	}
}
