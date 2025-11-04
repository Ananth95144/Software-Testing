package dsa;
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class Processcls {
    TreeNode root;

    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(TreeNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    boolean search(TreeNode node, int key) {
        if (node == null) return false;
        if (node.data == key) return true;
        return search(node.left, key) || search(node.right, key);
    }
    int height(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

public class BinaryTreeUser {

	public static void main(String[] args) {
		        Processcls bt = new Processcls();
		        bt.root = new TreeNode(1);
		        bt.root.left = new TreeNode(2);
		        bt.root.right = new TreeNode(3);
		        bt.root.left.left = new TreeNode(4);
		        bt.root.left.right = new TreeNode(5);

		        System.out.print("Inorder: ");
		        bt.inorder(bt.root);
		        System.out.println();

		        System.out.print("Preorder: ");
		        bt.preorder(bt.root);
		        System.out.println();

		        System.out.print("Postorder: ");
		        bt.postorder(bt.root);
		        System.out.println();

		        System.out.println("Search 5: " + bt.search(bt.root, 5)); // true
		        System.out.println("Search 10: " + bt.search(bt.root, 10)); // false
		        System.out.println("Height: " + bt.height(bt.root)); // 3
		 

	}
}
