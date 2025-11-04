package dsa;
import java.util.LinkedList;
import java.util.Queue;

class Node6 {
    int data;
    Node6 left, right;

    Node6(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node6 root;

    // Preorder Traversal (Root -> Left -> Right)
    void preorder(Node6 node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal (Left -> Root -> Right)
    void inorder(Node6 node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    void postorder(Node6 node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Breadth-First Search (Level-order Traversal using Queue)
    void bfs(Node6 root) {
        if (root == null) return;

        Queue<Node6> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node6 current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    // Delete a node by finding the deepest rightmost node
    Node6 deleteNode(Node6 root, int val) {
        if (root == null) return null;

        Queue<Node6> queue = new LinkedList<>();
        queue.add(root);

        Node6 target = null, lastNode = null, lastParent = null;

        // Perform BFS to find the target node and the last node
        while (!queue.isEmpty()) {
            Node6 current = queue.poll();
            if (current.data == val) target = current;

            if (current.left != null) {
                lastParent = current;
                queue.add(current.left);
            }
            if (current.right != null) {
                lastParent = current;
                queue.add(current.right);
            }

            lastNode = current;
        }

        if (target == null) return root; // Node not found

        target.data = lastNode.data; // Replace target with last node data

        // Remove the last node
        if (lastParent != null) {
            if (lastParent.left == lastNode) lastParent.left = null;
            else lastParent.right = null;
        } else {
            root = null; // Tree becomes empty
        }

        return root;
    }

    // Update a node's value
    void updateNode(Node6 node, int oldValue, int newValue) {
        if (node == null) return;

        if (node.data == oldValue) {
            node.data = newValue;
            System.out.println("\nUpdated node with value " + oldValue + " to " + newValue);
            return;
        }

        updateNode(node.left, oldValue, newValue);
        updateNode(node.right, oldValue, newValue);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create the tree structure
        tree.root = new Node6(2);
        tree.root.left = new Node6(3);
        tree.root.right = new Node6(4);
        tree.root.left.left = new Node6(5);
        tree.root.left.right = new Node6(6);

        // Perform DFS Traversals
        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
        System.out.println();

        // Perform BFS Traversal
        System.out.print("BFS (Level-order) Traversal: ");
        tree.bfs(tree.root);
        System.out.println();

        // Update a node
        tree.updateNode(tree.root, 2, 200);
        System.out.print("\nBFS after updating node: ");
        tree.bfs(tree.root);
        System.out.println();

        // Delete a node
        tree.root = tree.deleteNode(tree.root, 200);
        System.out.print("BFS after deleting node 200: ");
        tree.bfs(tree.root);
        System.out.println();
    }
}