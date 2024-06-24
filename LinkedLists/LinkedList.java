import javax.swing.*;

public class LinkedList {

    //head reference
    Node head;

    //inserting node at the front
    public void insertFront(int data) {

        //1. Allocating and inserting the data in new node
        Node newNode = new Node(data);

        //2. Make the next of newNode as head(pointing)
        newNode.next = head;

        //3. now make the head to be the newNode
        head = newNode;


    }

    public Node insertAtAnyGivenPosition(int position, int data) {
        Node newNode = new Node(data);

        //Condition 1 : if no nodes are present
        if(head == null) {
            if(position == 1)
                return newNode;
            else return head;
        }

        // if position == 1
        if(position == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node curr = head;
        for(int i = 1 ; i < position-1 ; i++ ) {
            curr = curr.next;
            if (curr == null) {
                System.out.println("Position out of range");
            }
        }
            newNode.next = curr.next;
            curr.next = newNode;
            return head;

    }

    public void insertAtTheEnd(int data) {
        Node newNode = new Node(data);
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void deleteFirstNode() {
        Node curr = head;
        head = curr.next;
    }
    public void deleteLastNode() {
        
        Node curr = head;
        while(curr.next.next!= null) {
            curr = curr.next;
        }
        curr.next = null;


    }

    //print the list
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();


        //insert elements at the front
        linkedList.insertFront(10);
        linkedList.insertFront(20);
        linkedList.insertFront(30);
        linkedList.insertFront(40);


        //insert at any position of the list
       linkedList.insertAtAnyGivenPosition(3,9);
       linkedList.insertAtAnyGivenPosition(1,8);
       linkedList.insertAtTheEnd(200);
       linkedList.insertAtTheEnd(210);
       linkedList.deleteFirstNode();
       linkedList.deleteLastNode();

       linkedList.print();
    }

}
