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
		// ��� ����
		TreeNode crntNode = root;
		TreeNode newNode = new TreeNode(x);

		// ���� ��� ����
		if (root == null) {
			root = new TreeNode(x);
			System.out.println("insert: " + x);
			return true;
		}

		// crntNode�� null �ƴ� ���� �ݺ�
		while (crntNode != null) {
			if (x == crntNode.data) {
				return false;
				// x�� crntNode�� data���� ������ left �ָ�
			} else if (x < crntNode.data) {
				// left�� null�̸� newNode ����
				if (crntNode.LeftChild == null) {
					crntNode.LeftChild = newNode;
					System.out.println("insert: " + x);
					return true;
					// left�� �����ϸ� left�� ��Ʈ�� ���� �ݺ�
				} else {
					crntNode = crntNode.LeftChild;
				}
				// x�� crntNode�� data���� ũ�� rignt �ָ�
			} else if (x > crntNode.data) {
				// right�� null�̸� newNode ����
				if (crntNode.RightChild == null) {
					crntNode.RightChild = newNode;
					System.out.println("insert: " + x);
					return true;
					// right�� �����ϸ� right�� ��Ʈ�� ���� �ݺ�
				} else {
					crntNode = crntNode.RightChild;
				}
			}
		}
		return true;
	}

	boolean Delete(int x) {// binary search tree���� x�� ������ �����ϴ� ����
		// x�� data�� ���� ��� ����
		TreeNode delNode = root;
		TreeNode delParentNode = null;
		// Ʈ�� �� ���翩�� Ȯ��
		while (delNode != null && delNode.data != x) {
			// del ó�� �� �θ��� Ȯ�� ���� keep
			delParentNode = delNode;
			// x�� ������ ���� Ž��
			if (x < delNode.data) {
				delNode = delNode.LeftChild;
				// x�� ũ�� ������ Ž��
			} else if (x > delNode.data) {
				delNode = delNode.RightChild;
			}
		}
		// ã�� data ������ false ��ȯ
		if(delNode == null) {
			return false;
		}
		// �ܸ������ ���
		if(delNode.LeftChild == null && delNode.RightChild == null) {
			// delNode�� �θ��� ���� ���� ���ʳ�� ����
			if(delParentNode.LeftChild==delNode) {
				delParentNode.LeftChild = null;
			} else {
				delParentNode.RightChild = null;
			}
		}
		// �ڽĳ�� �ϳ��� ���
		else if (delNode.LeftChild == null || delNode.RightChild == null ) {
			// delNode�� �θ��� ������ ��
			if(delParentNode.LeftChild == delNode) {
				if(delNode.LeftChild != null) {
					delParentNode.LeftChild = delNode.LeftChild;
				} else {
					delParentNode.LeftChild = delNode.RightChild;
				}
			}
			// delNode�� �θ��� �������� ��
			else {
				if(delNode.RightChild != null) {
					delParentNode.RightChild = delNode.RightChild;
				} else {
					delParentNode.RightChild = delNode.LeftChild;
				}
			}
		}
		// �ڽĳ�� ���� ���
		else {
			// ��ü�� ��� ����(������ ����� ������ �ڽĳ�� > ���� ���� �� �ʿ�)
			TreeNode replaceNode = delNode.RightChild;
			TreeNode replaceParentNode = delNode;
			// ��ü�� ��� Ʈ�� �� ���� ���� �� ã��
			while(replaceNode.LeftChild != null) {
				replaceParentNode = replaceNode;
				replaceNode = replaceNode.LeftChild;
			}
			// ���� ��� ��ġ�� ��ü�� ��� �־��ֱ�
			delNode.data = replaceNode.data;
			// ��ü�� ��尡 �θ��� ���ʿ� ������
			if(replaceParentNode.LeftChild == replaceNode) {
				// ��ü�� ����� ������ Ʈ���� �θ��� �������� ����
				replaceParentNode.LeftChild = replaceNode.RightChild;
			} 
			// �ƴϸ� ��ü�� ����� ������ Ʈ���� �θ��� ���������� ����
			else {
				replaceParentNode.RightChild = replaceNode.RightChild;
			}
		}
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
				System.out.println("The number of items = ");
				int deln = stdIn.nextInt();
				// �ش� ���� Ʈ���� ������ �������
				if (t.Delete(deln) == false) {
					System.out.println("Non-existent data: " + deln);
				}
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
