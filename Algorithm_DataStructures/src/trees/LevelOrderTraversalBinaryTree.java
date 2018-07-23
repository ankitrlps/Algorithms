package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalBinaryTree {

	static Node root;

	class Node {
		Node left;
		Node right;
		int data;

		Node(int data) {
			this.data = data;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
	}

	private void insert(int data) {

		if (root == null) {
			root = new Node(data);
			// System.out.print(root.getData() + " ");
		} else {
			Node curr = null;
			Queue<Node> que = new LinkedList<>();
			que.add(root);

			while (!que.isEmpty()) {
				curr = que.poll();
				if (curr.getLeft() == null) {
					curr.setLeft(new Node(data));
					// System.out.print(curr.getLeft().getData() + " ");
					break;
				} else {
					que.add(curr.getLeft());
				}
				if (curr.getRight() == null) {
					curr.setRight(new Node(data));
					// System.out.print(curr.getRight().getData() + " ");
					break;
				} else {
					que.add(curr.getRight());
				}
			}

		}
	}

	public void traversalAllInOneLine() {
		if (root != null) {
			Node curr = null;
			Queue<Node> que = new LinkedList<>();
			que.add(root);
			while (!que.isEmpty()) {
				curr = que.poll();
				System.out.print(curr.getData() + " ");
				if (curr.getLeft() != null) {
					que.add(curr.getLeft());
				}
				if (curr.getRight() != null) {
					que.add(curr.getRight());
				}
			}
		} else {
			System.out.println("Empty Tree!!!!!!!!!!!!!");
		}
	}

	public void traversalLineByLine() {
		if (root != null) {
			Node curr = null;
			Queue<Node> que = new LinkedList<>();
			que.add(root);
			que.add(null);
			while (!que.isEmpty()) {
				curr = que.poll();

				if (curr == null) {
					System.out.println();
					que.add(null);
					if (que.peek() == null) {
						break;
					}
				} else {
					System.out.print(curr.getData() + " ");
					if (curr.getLeft() != null) {
						que.add(curr.getLeft());
					}
					if (curr.getRight() != null) {
						que.add(curr.getRight());
					}
				}
			}
		} else {
			System.out.println("Empty Tree!!!!!!!!!!!!!");
		}
	}

	public static void main(String[] args) {
		LevelOrderTraversalBinaryTree tree = new LevelOrderTraversalBinaryTree();
		for (int i = 0; i < 9; i++) {
			tree.insert(i);
		}

		tree.traversalAllInOneLine();

		System.out.println();
		System.out.println();

		tree.traversalLineByLine();
	}
}
