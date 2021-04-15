import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private BinaryNode root;
    private BinaryNode insertRecursively(BinaryNode curr,int val)
{
    if(curr==null){
        return (new BinaryNode(val));
    }
    if(curr.data>val)
    {
        curr.left=insertRecursively(curr.left, val);
    }
    if(curr.data<val)
    {
        curr.right=insertRecursively(curr.right, val);
    }
    if(curr.data==val)
    {
        System.out.println("Duplicate values are not allowed");
        return curr;
    }
    return curr;
}    
private void inOrderTraversal(BinaryNode node)
{
    if(node!=null)
    {
        inOrderTraversal(node.left);
        System.out.print(node.data+" ");
        inOrderTraversal(node.right);
    }
}
private void preOrderTraversal(BinaryNode node)
{
    if(node!=null)
    {
        System.out.print(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}
private void postOrderTraversal(BinaryNode node)
{
    if(node!=null)
    {
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+" ");
    }
}
private void levelOrderTraversal(BinaryNode node)
{
    Queue<BinaryNode> nodeQueue=new LinkedList<>();
    nodeQueue.add(node);
    while(!nodeQueue.isEmpty())
    {
        BinaryNode temp=nodeQueue.poll();
        System.out.print(temp.data+" ");
        if(temp.left!=null)
        nodeQueue.add(temp.left);
        if(temp.right!=null)
        nodeQueue.add(temp.right);

    }
}
public void insertNode(int val)
{
    this.root=insertRecursively(this.root, val);
}
public void printInOrder()
{
    System.out.println("In Order Traversal");
    inOrderTraversal(this.root);
    System.out.println();
}
public void printPreOrder()
{
    System.out.println("Pre Order Traversal");
    preOrderTraversal(this.root);
    System.out.println();
}
public void printPostOrder()
{
    System.out.println("Post Order Traversal");
    postOrderTraversal(this.root);
    System.out.println();
}
public void printLevelOrder()
{
    System.out.println("Level Order Traversal");
    levelOrderTraversal(this.root);
    System.out.println();
}
}
