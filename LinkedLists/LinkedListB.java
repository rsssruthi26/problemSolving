public class LinkedListB {
    Node head;
    public void insertAtTheEnd(int data) {
        Node newNode = new Node(data);
        if(head == null ) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }
}
