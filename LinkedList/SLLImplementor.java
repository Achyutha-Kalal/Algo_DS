public class SLLImplementor {
    public static void main(String args[])
{
    SingleLinkedList head=new SingleLinkedList();
    head.insertLast(2);
    head.insertLast(3);
    head.insertLast(3);
    head.insertLast(4);
    head.insertLast(4);
    head.insertLast(5);
    head.insertLast(4);
    head.insertLast(4);
    head.insertLast(3);
    head.insertLast(3);
    head.insertLast(2);
    head.insertLast(1);
    head.printList();
    head.reverseLinkedList();
    System.out.println(head.checkPalindrome());
    
}
    
}
