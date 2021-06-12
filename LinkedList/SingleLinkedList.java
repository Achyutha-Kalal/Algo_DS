//Structure of Single Linked List and its operations
public class SingleLinkedList {
   private SingleLinkedListNode root;

   //Appending new node at the last for given singlelinked list
   private SingleLinkedListNode insertLast(SingleLinkedListNode curr_node,int k)
   {
       if(curr_node==null)
        return (new SingleLinkedListNode(k));
        else
            curr_node.next=insertLast(curr_node.next, k);
        return curr_node;
   }

   //Appending singlelinked list to new singlelinkedNode
   private SingleLinkedListNode insertStart(SingleLinkedListNode curr_node,int k)
   {
    SingleLinkedListNode start_node=new SingleLinkedListNode(k);
    start_node.next=curr_node;
    curr_node=start_node;
    return curr_node;
   }

   //print the data of the single linked list
   private void printList(SingleLinkedListNode curr_node)
   {
    SingleLinkedListNode new_node=curr_node;
    System.out.println("printing begins");
    while(new_node!=null)
    {
        System.out.print(new_node.data+"->");
        new_node=new_node.next;
    }
    System.out.println("null");
    System.out.println("printing ends");
   }

   //Delete Node from the linked list whose value is k
   private SingleLinkedListNode deleteNode(SingleLinkedListNode curr_node,int k)
   {
       if(curr_node.data==k)
         curr_node=curr_node.next;
        else
        {
            SingleLinkedListNode tmp_node=curr_node;
            while(tmp_node.next.data!=k)
                tmp_node=tmp_node.next;
            tmp_node.next=tmp_node.next.next;

        }
        return curr_node;
   }

      //Delete Node from the linked list at a given position value
   private void deleteNodeAtPos(SingleLinkedListNode curr_node,int pos)
   {     
        
    SingleLinkedListNode tmp_node=curr_node;
            int count=0;
            while(tmp_node.next!=null)
            {
                if(count==pos-1)
                {
                    tmp_node.next=tmp_node.next.next;
                    break;
  
                }
                count++;
                tmp_node=tmp_node.next;
            }
        

   }

      //Delete Node from the root single linked list at a given position value
   public void deleteNodeAtPos(int pos)
   {
        deleteNodeAtPos(this.root, pos);
   }

   //Appending root node at the last for given singlelinked list
   public void insertLast(int k)
   {
       this.root=insertLast(this.root,k);
   } 

      //Appending root singlelinked list to new singlelinkedNode
   public void insertStart(int k)
   {
       this.root=insertStart(this.root, k);
   }

      //print the data of the root single linked list
   public void printList()
   {
       printList(this.root);
   }

      //Delete Node from the root linked list whose value is k
   public void deleteNode(int k)
   {
        this.root=deleteNode(this.root, k);
   }
}
