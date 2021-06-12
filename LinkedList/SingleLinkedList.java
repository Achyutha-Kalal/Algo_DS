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

   // Find Length of the Single Linked List by using recursion approach
   private int findLengthRecursively(SingleLinkedListNode curr_node)
   {
        if(curr_node==null)
            return 0;
        if(curr_node.next==null)
            return 1;
        else
        {
            return 1+findLengthRecursively(curr_node.next);
        } 

   }

      // Find Length of the Single Linked List by using iterative approach
   private int findLengthIteratively(SingleLinkedListNode curr_node)
   {

        if(curr_node==null)
            return 0;
        SingleLinkedListNode tmp=curr_node;
        int count=1;
        while(tmp.next!=null)
        {    
            tmp=tmp.next;
            count++;
        }
        return count;  
   }

     // Search element in the Single Linked List by using recursion approach
     private boolean searchRecursively(SingleLinkedListNode curr_node,int element)
     {
          if(curr_node.data==element)
              return true;
          else
          {
              return searchRecursively(curr_node.next,element);
          }   
     }
  
        // Search element in the Single Linked List by using iterative approach
     private boolean searchIteratively(SingleLinkedListNode curr_node,int element)
     {
          SingleLinkedListNode tmp_node=curr_node;
          boolean flag=false;
          while(tmp_node!=null)
          {    
              if(tmp_node.data==element)
            {
                flag=true;
                break;
            }
            tmp_node=tmp_node.next;
              
          }
          return flag;  
     }
  
    //Delete entire single linked list
   private void deleteList(SingleLinkedListNode curr_node)
    {
        curr_node=null;
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

         //Delete entire root linked list
   public void deleteList()
   {
       deleteList(this.root);
   }

   // Find Length of the rootSingle Linked List by using recursion approach
   public int findLengthRecursively()
   {
       return findLengthRecursively(this.root);
   }

      // Find Length of the root Linked List by using iterative approach
   public int findLengthIteratively()
   {
       return findLengthIteratively(this.root);
   }

   // Search element in the root Linked List by using recursion approach
   public boolean searchRecursively(int element)
   {
        return searchRecursively(this.root,element);
   }

      // Search element in the root Linked List by using iterative approach
   public boolean searchIteratively(int element)
   {
    return searchIteratively(this.root,element);        
   }
          
}
