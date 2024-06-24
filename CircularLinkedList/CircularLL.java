package CircularLinkedList;

public class CircularLL {
    Node head;
    Node tail;
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

    }
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null) {
            newNode.next = newNode;
        }
        else {
            Node curr = head;
            while(curr.next != head) {
                curr = curr.next ;
            }
            curr.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    public void deleteHead() {
        if(head == null) {
            return;
        }
        if(head.next == head)
            return;
        Node curr = head;
        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = head.next;
        head = curr.next;

    }
    public void deleteKthNode(int k) {
       if( head.next == head) {
           return;
       }
       if(k == 1) {
           Node curr = head;
           while(curr.next != head) {
               curr = curr.next;
           }
           curr.next = head.next;
           head = curr.next;
       }
       else {
           Node curr = head;
          for(int i = 0 ; i < k-2 ; i++ ) {
              curr = curr.next;
          }
          curr.next = curr.next.next;
       }
    }
    public void print() {
        Node curr = head;
        if(head == null)
            return;
        do{
            System.out.println(curr.data + " ");
            curr = curr.next;
        }while(curr != head);

    }
    public static void main(String[] args) {
        CircularLL circularLL = new CircularLL();
        circularLL.insertAtEnd(10);
        circularLL.insertAtEnd(20);
        circularLL.insertAtEnd(30);
        circularLL.insertAtEnd(40);
        circularLL.insertAtBeginning(11);
        circularLL.insertAtBeginning(125);
        circularLL.deleteHead();
        circularLL.deleteKthNode(3);
        circularLL.print();

    }
}
