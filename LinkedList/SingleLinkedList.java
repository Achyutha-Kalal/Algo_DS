import java.util.Stack;

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

        //Print kth node from start in a linked list
    private void printKthNodefromStart(SingleLinkedListNode curr_node,int k)
    {     
         
     SingleLinkedListNode tmp_node=curr_node;
             int count=0;
             while(tmp_node!=null)
             {
                 if(count==k)
                 {
                     System.out.println(tmp_node.data);
                     break;
                 }
                 count++;
                 tmp_node=tmp_node.next;
            }

    }

        //Print kth node from end in a linked list
    private void printKthNodefromLast(SingleLinkedListNode curr_node,int k)
    {     
         
        int len=findLengthRecursively(curr_node);
        k=len-k;
     SingleLinkedListNode tmp_node=curr_node;
             int count=0;
             while(tmp_node!=null)
             {
                 if(count==k)
                 {
                     System.out.println(tmp_node.data);
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
    //Print kth node from start in root linked list
    public void printKthNodefromStart(int k)
    {    
        printKthNodefromStart(this.root,k);
    }
    //Print kth node from end in root linked list
    public void printKthNodefromLast(int k)
    {    
        printKthNodefromLast(this.root,k);
    }
   private void removeDuplicates(SingleLinkedListNode head_node)
    {
        SingleLinkedListNode curr_node=head_node,prev_node=head_node;
        int count=0;
        while(curr_node!=null)
        {
            if(curr_node.next!=null&&curr_node.next.data==curr_node.data)
            {
                prev_node=curr_node;
                curr_node=curr_node.next.next;
                count=0;
                continue;
            }
            if(curr_node.next!=null&&curr_node.next.data!=curr_node.data)
            {
                count++;
            }
            if(count>1)
            {
                prev_node=prev_node.next;
                count=0;
            }
            curr_node=curr_node.next;
        }
    }
    public void removeDuplicates()
    {
        removeDuplicates(root);
    }
    private SingleLinkedListNode reverseLinkedList(SingleLinkedListNode curr_node)
    {
        SingleLinkedListNode stack_node=curr_node;
        Stack<Integer> tmp_stack=new Stack<Integer>();
        while(stack_node!=null)
        {
            tmp_stack.push(stack_node.data);
            stack_node=stack_node.next;
        }
        SingleLinkedListNode final_node=new SingleLinkedListNode(tmp_stack.pop());
        while(tmp_stack.empty()!=true)
        {
            insertLast(final_node,tmp_stack.pop());
        }
        return final_node;

    }
    public void reverseLinkedList()
    {
        this.root=reverseLinkedList(this.root);
    }
    private boolean checkPalindrome(SingleLinkedListNode curr_node)
    {
        SingleLinkedListNode stack_node=curr_node;
        Stack<Integer> tmp_stack=new Stack<Integer>();
        while(stack_node!=null)
        {
            tmp_stack.push(stack_node.data);
            stack_node=stack_node.next;
        }
        SingleLinkedListNode final_node=curr_node;
        boolean isPalindrome=true;
        while(tmp_stack.empty()!=true&&final_node!=null)
        {
            if(tmp_stack.pop()!=final_node.data)
            {
                isPalindrome=false;
                break;
            }
            final_node=final_node.next;
        }
        return isPalindrome;
    }
    public boolean checkPalindrome()
    {
        return checkPalindrome(this.root);
    }
          
}
