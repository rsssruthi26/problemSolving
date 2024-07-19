public class DeleteNodeFromEnd {
    // naive method - with one pass

    public static void main(String[] args) {
        LinkedListB linkedList = new LinkedListB();
        linkedList.insertAtTheEnd(10);
        linkedList.insertAtTheEnd(20);
        linkedList.insertAtTheEnd(30);
        linkedList.insertAtTheEnd(40);
        linkedList.insertAtTheEnd(50);
        linkedList.print();
        System.out.println(" Delete Node from End ");
        deleteNodeFromEndOnePass(linkedList, 4);
        linkedList.print();
        deleteNodeFromEndTwoPointers(linkedList, 2);
        linkedList.print();
       deleteNodeFromEndTwoPointers(linkedList, 3);
        linkedList.print();
    }

    private static void deleteNodeFromEndTwoPointers(LinkedListB linkedList, int n) {
        Node head = linkedList.head;
        Node fast = head;
        Node slow = head;

        for( int i = 0 ; i < n ; i++ ) {
            fast = fast.next;
        }
        if(fast == null) {
            linkedList.head = head.next;
           return;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return;
    }

    private static void deleteNodeFromEndOnePass(LinkedListB linkedList, int n) {
        Node head = linkedList.head;
        Node prev = null;
        Node curr = head;
        int length = 0;
        //length of the list
        Node temp = head;
        while(temp != null ){
            length++;
            temp = temp.next;
        }
        //assign curr  to head again
        int nodeFromBeginning = length - n + 1;
        for(int i = 1 ; i < nodeFromBeginning ; i++ ) {
            prev = curr;
            curr = curr.next;

        }
        if(prev == null ) {
            head = head.next;

        }
        else{
            prev.next = prev.next.next;

        }
    }
}
