package DoubleLinkedList;

public class DoubleLL {
    Node head;
    Node tail;
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;

    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node curr = head;
        while(curr.next != null) {
            curr= curr.next;
        }
        newNode.prev = curr;
        curr.next = newNode;

    }
    public Node reverseLinkedList() {
        if(head == null || head.next == null)
            return head;
        Node prev = null;
        Node curr = head;
        while( curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        head = prev.prev;
        return head;
    }
    public void deleteHeadNode() {
        Node curr = head;
        if(curr.next == null)
            return;
        head = curr.next;
        curr.next.prev = null;
    }
    public void deleteLastNode() {
        Node curr = head;
        if(curr.next == null)
            return;
        while(curr.next.next !=null) {
            curr = curr.next;
        }
        curr.next = null;
    }
    public void print(){
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " " );
            curr = curr.next;
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        DoubleLL doubleLL = new DoubleLL();
        doubleLL.insertAtBegin(10);
        doubleLL.insertAtBegin(20);
        doubleLL.insertAtBegin(30);
        doubleLL.insertAtBegin(40);
        doubleLL.insertAtEnd(9);
        doubleLL.insertAtEnd(35);
        System.out.println("Printing the DLL:");
        doubleLL.print();
        System.out.println("Reversing the DLL:");
        Node result = doubleLL.reverseLinkedList();
        doubleLL.print();
        System.out.println("Deleting the head node: ");
        doubleLL.deleteHeadNode();
        doubleLL.print();
        System.out.println("Deleting the last node: ");
        doubleLL.deleteLastNode();
        doubleLL.deleteLastNode();
        doubleLL.print();






    }


}
