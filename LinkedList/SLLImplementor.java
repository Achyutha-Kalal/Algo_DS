public class SLLImplementor {
    public static void main(String args[])
{
    SingleLinkedList head=new SingleLinkedList();
    head.insertLast(5);
    head.insertLast(6);
    head.insertLast(7);
    head.insertLast(8);
    head.insertLast(11);
    head.insertLast(9);
    head.insertStart(4);
    head.insertStart(3);
    head.insertStart(2);
    head.insertStart(1);
    head.insertStart(0);
    head.printList();
    head.deleteNodeAtPos(1);
    head.printList();
}
    
}
