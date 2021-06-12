
import java.util.LinkedList;
import java.util.Queue;

//Structure of BinarySearch Tree
public class BinarySearchTree {
    private BinaryNode root;

    // insertion method
    private BinaryNode insertRecursively(BinaryNode curr, int val) {
        if (curr == null) {
            return (new BinaryNode(val));
        }
        if (curr.data > val) {
            curr.left = insertRecursively(curr.left, val);
        }
        if (curr.data < val) {
            curr.right = insertRecursively(curr.right, val);
        }
        if (curr.data == val) {
            System.out.println("Duplicate values are not allowed");
            return curr;
        }
        return curr;
    }

    // In order traversal method
    private void inOrderTraversal(BinaryNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    // Pre Order traversal method
    private void preOrderTraversal(BinaryNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // Post Order traversal method
    private void postOrderTraversal(BinaryNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Level Order traversal method
    private void levelOrderTraversal(BinaryNode node) {
        Queue<BinaryNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(node);
        while (!nodeQueue.isEmpty()) {
            BinaryNode temp = nodeQueue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                nodeQueue.add(temp.left);
            if (temp.right != null)
                nodeQueue.add(temp.right);

        }
    }

    // Root Node insertion method
    public void insertNode(int val) {
        this.root = insertRecursively(this.root, val);
    }

    // Root Node InOrder traversal print method
    public void printInOrder() {
        System.out.println("In Order Traversal");
        inOrderTraversal(this.root);
        System.out.println();
    }

    // Root Node PreOrder traversal print method
    public void printPreOrder() {
        System.out.println("Pre Order Traversal");
        preOrderTraversal(this.root);
        System.out.println();
    }

    // Root Node PostOrder traversal print method
    public void printPostOrder() {
        System.out.println("Post Order Traversal");
        postOrderTraversal(this.root);
        System.out.println();
    }

    // Root Node LevelOrder traversal print method
    public void printLevelOrder() {
        System.out.println("Level Order Traversal");
        levelOrderTraversal(this.root);
        System.out.println();
    }

    // constructing rootNode from if preOrder is given
    public void constructFromPreOrder(int arr[]) {
        BinaryNode curr = new BinaryNode(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            curr = insertRecursively(curr, arr[i]);
        }
        this.root = curr;
    }
    
}
