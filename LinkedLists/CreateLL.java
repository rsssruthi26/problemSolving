
import java.lang.*;

class CreateLL {

    static void printNodeRecursively(Node head){
        if(head == null)
            return;
        System.out.println(head.data + " ");
        printNodeRecursively(head.next);

    }

    public static void main(String args[])
    {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        //System.out.print(head.data+"-->"+temp1.data+"-->"+temp2.data);

        //print a Node
        System.out.println("Printing nodes iteratively");
        Node curr = head;
        while(curr != null) {
            System.out.println(curr.data + " ");
            curr=curr.next;
        }

        //recursive display of the linkedList(not using iteration)
        System.out.println("Printing nodes recursively");
        printNodeRecursively(head);


    }


}