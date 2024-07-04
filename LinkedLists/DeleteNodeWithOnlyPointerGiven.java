public class DeleteNodeWithOnlyPointerGiven {

    public static void  print(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println();
    }
    public static void deleteNode(Node somePointer) {
        somePointer.data = somePointer.next.data;
        somePointer.next = somePointer.next.next;

    }
    public static void main(String[] args) {
        /*The fast solution is to copy the data from the next node to the node to be deleted and delete the next node.*/
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        //deleting the node itself
        System.out.println("Before deleting: " );
        print(head);

        System.out.println("After deleting: " );
        deleteNode(head.next.next); //here I am not sending head, I am sending the reference of some node,to be deleted.
        print(head);

    }
}
