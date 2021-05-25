import java.util.List;

public class TreesImplementor {
    public static void main(String args[])
    {
        BinarySearchTree BST=new BinarySearchTree();
        int arr[]={10, 5, 1, 7, 40, 50};
        BST.constructFromPreOrder(arr);
        BST.printLevelOrder();
        List<Integer> arr1=BST.find_ancestor(50);
        List<Integer> arr2=BST.find_ancestor(1);
        int n=arr2.size();
        for(int i=n-1;i>=0;i--)
        {
            arr1.get(index)
        }
    }
    
}
