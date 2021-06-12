public class SingleLinkedList {
   private SingleLinkedListNode root;

   private SingleLinkedListNode insertLast(SingleLinkedListNode curr_node,int k)
   {
       if(curr_node==null)
        return (new SingleLinkedListNode(k));
        else
            curr_node.next=insertLast(curr_node.next, k);
        return curr_node;
   }
   private SingleLinkedListNode insertStart(SingleLinkedListNode curr_node,int k)
   {
    SingleLinkedListNode start_node=new SingleLinkedListNode(k);
    start_node.next=curr_node;
    curr_node=start_node;
    return curr_node;
   }
   private void printList(SingleLinkedListNode curr_node)
   {
    SingleLinkedListNode new_node=curr_node;
    System.out.println("printing begins");
    System.out.println();
    while(new_node!=null)
    {
        System.out.print(new_node.data+" ");
        new_node=new_node.next;
    }
    System.out.println();
    System.out.println("printing ends");
   }
   public void insertLast(int k)
   {
       this.root=insertLast(this.root,k);
   } 
   public void insertStart(int k)
   {
       this.root=insertStart(this.root, k);
   }
   public void printList()
   {
       printList(this.root);
   }
}
