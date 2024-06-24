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
    public void print(){
        Node curr = head;
        while(curr != null) {
            System.out.println(curr.data + " " );
            curr = curr.next;
        }


    }
    public static void main(String[] args) {
        DoubleLL doubleLL = new DoubleLL();
        doubleLL.insertAtBegin(10);
        doubleLL.insertAtBegin(20);
        doubleLL.insertAtBegin(30);
        doubleLL.insertAtBegin(40);
        doubleLL.insertAtEnd(9);
        doubleLL.insertAtEnd(35);
        doubleLL.print();



    }
}
