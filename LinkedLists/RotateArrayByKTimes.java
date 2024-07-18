public class RotateArrayByKTimes {

    public static void main(String[] args) {
        LinkedListB linkedList = new LinkedListB();
        linkedList.insertAtTheEnd(10);
        linkedList.insertAtTheEnd(20);
        linkedList.insertAtTheEnd(30);
        linkedList.insertAtTheEnd(40);
        linkedList.insertAtTheEnd(50);
        linkedList.print();
        rotateArrayByKtimes(linkedList, 2);
        linkedList.print();
    }

    private static void rotateArrayByKtimes(LinkedListB linkedList, int k) {

        Node head = linkedList.head;
        if(head == null || head.next == null || k == 0 ){
            return;
        }
        // calculate length of the linkedList
        Node temp = head;
        int length = 1;
        while(temp.next != null ) {
            temp = temp.next;
            length++;
        }
        // make the list circular
        temp.next = head;

        // calculate effective rotations
        k = k % length;
        k = length - k;

        // find new head
        while(k-- > 0) {
            temp = temp.next;
        }

        //break the circular list
        head = temp.next;
        temp.next = null;

        linkedList.head = head;


    }
}
