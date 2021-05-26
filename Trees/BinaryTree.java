import java.util.LinkedList;
import java.util.Queue;

class BinaryTree{
    public BinaryNode root;
    public void intializeNode(BinaryNode node,int val)
    {
        node=new BinaryNode(val);
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
    // Root Node LevelOrder traversal print method
    public void printLevelOrder() {
        System.out.println("Level Order Traversal");
        levelOrderTraversal(this.root);
        System.out.println();
    }
}