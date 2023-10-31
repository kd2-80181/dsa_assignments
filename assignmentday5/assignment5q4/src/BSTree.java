import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BSTree {
	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			this.data = value;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BSTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(Node trav, Node node) {
		if (node.data < trav.data) {
			if (trav.left == null) {
				trav.left = node;
			} else
				addNode(trav.left, node);
		} else {
			if (trav.right == null) {
				trav.right = node;
			} else
				addNode(trav.right, node);
		}
	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (isEmpty())
			root = newNode;
		else
			addNode(root, newNode);
	}

	private void preOrder(Node trav) {
		if (trav == null)
			return;
		else {
			System.out.print(" " + trav.data);

			preOrder(trav.left);

			preOrder(trav.right);
		}
	}

	public void preOrder() {
		System.out.print("Pre-Order Traversal :");
		preOrder(root);
		System.out.println();
	}

	private void inOrder(Node trav) {
		if (trav == null)
			return;
		else {
			inOrder(trav.left);

			System.out.print(" " + trav.data);

			inOrder(trav.right);
		}
	}

	public void inOrder() {
		System.out.print("In-Order Traversal :");
		inOrder(root);
		System.out.println();
	}

	private void postOrder(Node trav) {
		if (trav == null)
			return;
		else {
			postOrder(trav.left);

			postOrder(trav.right);

			System.out.print(" " + trav.data);
		}
	}

	public void postOrder() {
		System.out.print("Post-Order Traversal :");
		postOrder(root);
		System.out.println();
	}

	public void dsfTraversal() {
		Stack<Node> stk = new Stack<>();
		stk.push(root);
		System.out.print("DSF Traversal :");
		while (!stk.isEmpty()) {
			Node temp = stk.pop();

			System.out.print(" " + temp.data);

			if (temp.right != null)
				stk.push(temp.right);
			if (temp.left != null)
				stk.push(temp.left);
		}
		System.out.println(" ");
	}

	public void bsfTraversal() {
		Queue<Node> que = new LinkedList<>();
		que.offer(root);
		System.out.print("BSF traversal :");
		while (!que.isEmpty()) {
			Node temp = que.poll();

			System.out.print(" " + temp.data);

			if (temp.left != null)
				que.offer(temp.left);
			if (temp.right != null)
				que.offer(temp.right);
		}
		System.out.println(" ");
	}

}
