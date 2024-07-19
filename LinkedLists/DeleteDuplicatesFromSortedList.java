public class DeleteDuplicatesFromSortedList {
    public static void main(String[] args) {
        LinkedListB linkedList  = new LinkedListB();
        linkedList.insertAtTheEnd(10);
        linkedList.insertAtTheEnd(20);
        linkedList.insertAtTheEnd(20);
        linkedList.insertAtTheEnd(40);
        linkedList.insertAtTheEnd(50);
        linkedList.print();
        deleteDuplicatesFromSortedList(linkedList);
        System.out.println("After deletion :");
        linkedList.print();
    }

    private static void deleteDuplicatesFromSortedList(LinkedListB linkedList) {
        Node head = linkedList.head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy;

        while(curr.next != null && curr.next.next != null) {
            if(curr.next.data == curr.next.next.data ) {
                int duplicate = curr.next.data;
                while(curr.next != null && curr.next.data == duplicate) {
                    curr.next = curr.next.next;
                }
            }
            else
                curr = curr.next;
        }
        linkedList.head = dummy.next;
    }
}
