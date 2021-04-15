public class TreesImplementor {
    public static void main(String args[])
    {
        BinarySearchTree BST=new BinarySearchTree();
        int arr[]={10, 5, 1, 7, 40, 50};
        BST.constructFromPreOrder(arr);
        BST.printLevelOrder();
    }
    
}
