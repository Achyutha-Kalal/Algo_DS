

public class TreesImplementor {
    public static void main(String args[])
    {
        BinarySearchTree BST=new BinarySearchTree();
        BST.insertNode(4);
        BST.insertNode(2);
        BST.insertNode(6);
        BST.insertNode(1);
        BST.insertNode(3);
        BST.insertNode(5);
        BST.insertNode(7);
        BST.printLevelOrder();
        System.out.println(BST.heightOfTree());
    }
    
}
