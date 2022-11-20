package ch08_list.date221115;

import java.util.Scanner;

class TreeNode {
	public int data;
	public TreeNode LeftChild;
	public TreeNode RightChild;

	public TreeNode(int data) {
		this.data = data;
		LeftChild = RightChild = null;
	}
}

class Tree {
	private TreeNode root;

	Tree() {
		root = null;
	};

	TreeNode InorderSucc(TreeNode current) {
		TreeNode temp = current.RightChild;
		if (current.RightChild != null)
			while (temp.LeftChild != null)
				temp = temp.LeftChild;
		return temp;
	}

	void inorder() {
		inorder(root);
	}

	void preorder() {
		preorder(root);
	}

	void postorder() {
		postorder(root);
	}

	// LVR
	void inorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			inorder(CurrentNode.LeftChild);
			System.out.print(" " + CurrentNode.data);
			inorder(CurrentNode.RightChild);
		}
	}

	// VLR
	void preorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			System.out.print(CurrentNode.data + " ");
			preorder(CurrentNode.LeftChild);
			preorder(CurrentNode.RightChild);
		}
	}

	// LRV
	void postorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			postorder(CurrentNode.LeftChild);
			postorder(CurrentNode.RightChild);
			System.out.print(CurrentNode.data + " ");
		}
	}

	boolean Insert(int x) {// binary search tree�� ����� �Է�
		// ���� ��� ����
		if (root == null) {
			root = new TreeNode(x);
			System.out.println("insert: " + x);
			return true;
		}

		TreeNode p = root;
		TreeNode q = new TreeNode(x);

		// p�� null �ƴ� ���� �ݺ�
		while (p != null) {
			if (x == p.data) {
				return false;
				// x�� p�� data���� ������ left �ָ�
			} else if (x < p.data) {
				// left�� null�̸� q ����
				if (p.LeftChild == null) {
					p.LeftChild = q;
					System.out.println("insert: " + x);
					return true;
					// left�� �����ϸ� left�� ��Ʈ�� ���� �ݺ�
				} else {
					p = p.LeftChild;
				}
				// x�� p�� data���� ũ�� rignt �ָ�
			} else if (x > p.data) {
				// right�� null�̸� q ����
				if (p.RightChild == null) {
					p.RightChild = q;
					System.out.println("insert: " + x);
					return true;
					// right�� �����ϸ� right�� ��Ʈ�� ���� �ݺ�
				} else {
					p = p.RightChild;
				}
			}
		}
		return true;
	}

	boolean Delete(int x) {// binary search tree���� x�� ������ �����ϴ� ����

		return true;
	}
}

public class BinaryTree {
	public static void main(String[] args) {
		Tree t = new Tree();
		Scanner stdIn = new Scanner(System.in);
		int select = 0;
		while (select != 6) {
			System.out.println(
					"BinarySearchTree. Select 1:Insert, 2. Delete, 3:preorder, 4:postorder, 5. inorder, 6. Quit =>");

			select = stdIn.nextInt();
			switch (select) {
			case 1:
				System.out.println("The number of items = ");

				int nx = stdIn.nextInt();
				int[] input = new int[10];
				for (int ix = 0; ix < 10; ix++) {
					double d = Math.random();
					input[ix] = (int) (d * 20);
				}
				for (int i = 0; i < nx; i++) {
					if (t.Insert(input[i]) == false)
						System.out.println("Insert Duplicated data: " + input[i]);
				}
				break;
			case 2:
				// Delete
				break;
			case 3:
				t.preorder();
				System.out.println();
				break;
			case 4:
				t.postorder();
				System.out.println();
				break;
			case 5:
				t.inorder();
				System.out.println();
				break;
			case 6:
				System.out.println("Quit");
				break;

			default:
				System.out.println("WRONG INPUT  ");
				System.out.println("Re-Enter");
				break;
			}
		}
		stdIn.close();
	}
}
