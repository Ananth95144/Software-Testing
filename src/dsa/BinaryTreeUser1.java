package dsa;
import java.util.Scanner;
class BinaryTreepro {
	int data;
	BinaryTreepro left;
	BinaryTreepro right;

	BinaryTreepro(int data) {
		left = right = null;
		this.data = data;
	}
}
class BinProcess {
	BinaryTreepro root = null;
	Scanner sc = new Scanner(System.in);

	void preorder(BinaryTreepro node) {
		if (node != null) {
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		} else {
			System.out.println("Empty node");
			return;
		}
	}

	void inorder(BinaryTreepro node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		} else {
			System.out.println("Empty node");
			return;
		}
	}

	boolean search(BinaryTreepro node, int value) {
		if (node == null)
			return false;
		if (node.data == value)
			return true;
		return (search(node.left, value) || search(node.right, value));
	}

	BinaryTreepro buildTree() {
		System.out.print("Enter node value : ");
		int value = sc.nextInt();
		if (value == -1) {
			return null;
		}
		BinaryTreepro node = new BinaryTreepro(value);
		System.out.println("Enter left child " + value);
		node.left = buildTree();
		System.out.println("Enter right child " + value);
		node.right = buildTree();
		return node;
	}
}
public class BinaryTreeUser1 {
	public static void main(String[] args) {
		BinProcess ob = new BinProcess();
		ob.root = ob.buildTree();
		ob.inorder(ob.root);
	}
}
