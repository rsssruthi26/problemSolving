public class DeleteTheMiddleNode {
    public static void main(String[] args) {
        LinkedListB linkedList  = new LinkedListB();
        linkedList.insertAtTheEnd(10);
        linkedList.insertAtTheEnd(20);
        linkedList.insertAtTheEnd(30);
        linkedList.insertAtTheEnd(40);
        linkedList.insertAtTheEnd(50);
        linkedList.print();
        deleteTheMiddleNode(linkedList);
        linkedList.print();
    }

    private static void deleteTheMiddleNode(LinkedListB linkedList) {
        Node head = linkedList.head;
        int length = 0 ;
        Node curr = head;
        Node temp = head;
        Node prev = null;

        while(curr != null) {
            length++;
            curr = curr.next;
        }
        int middle = (length/2);
        for(int i = 0 ; i < middle ; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;


    }
}
