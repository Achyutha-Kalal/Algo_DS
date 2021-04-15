public class TreesImplementor {
    public static void main(String args[])
    {
        BinarySearchTree BST=new BinarySearchTree();
        BST.insertNode(5);
        BST.insertNode(3);
        BST.insertNode(4);
        BST.insertNode(2);
        BST.insertNode(7);
        BST.insertNode(8);
        BST.insertNode(6);
        BST.printInOrder();
        BST.printPreOrder();
        BST.printPostOrder();
        BST.printLevelOrder();
    }
    
}
