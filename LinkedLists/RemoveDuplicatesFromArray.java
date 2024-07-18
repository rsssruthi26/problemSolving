import java.util.HashSet;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        LinkedListB linkedList = new LinkedListB();
        linkedList.insertAtTheEnd(10);
        linkedList.insertAtTheEnd(10);
        linkedList.insertAtTheEnd(10);
        linkedList.insertAtTheEnd(40);
        linkedList.insertAtTheEnd(50);
        linkedList.print();
        removeDuplicatesFromArray(linkedList);
        linkedList.print();
    }

    private static void removeDuplicatesFromArray(LinkedListB linkedList) {

       Node head = linkedList.head;
       Node curr = head;
       while(curr != null) {
           Node temp = curr;
           while (temp != null && temp.data == curr.data ) {
               temp = temp.next;
           }
           curr.next = temp;
           curr = curr.next;

       }
    }

}
