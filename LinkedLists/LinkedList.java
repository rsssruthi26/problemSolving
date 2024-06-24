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

        linkedList.print();
    }

}
