import java.util.HashSet;

public class DetectALoop {


    static void printList(Node head) {
        while(head != null) {
            System.out.println(head.data + " " );
            head = head.next;
        }
        System.out.println();
    }

    static boolean detectALoop(Node head) {
        /* Time Complexity : O(n), but alters the structure of the linkedList*/
        Node curr = head;
        Node temp = new Node(0);
        while(curr != null ) {
            if(curr.next == null) {
                return false;
            }
            if(curr.next == temp) {
                return true;
            }
            Node next  = curr.next;
            curr.next = temp;
            curr = next;
        }
        return false;
    }
    public static boolean detectALoopHashing(Node head) {
        /*Follow the steps below to solve the problem:

        Traverse the list individually and keep putting the node addresses in a Hash Table.
        At any point, if NULL is reached then return false
        If the next of the current nodes points to any of the previously stored nodes in  Hash then return true.
        Time complexity: O(N)
        Auxiliary Space: O(N)
        */
        HashSet<Node> hashSet = new HashSet<>();
        Node curr = head;
        while(curr != null){
            if(hashSet.contains(curr))
                return true;
            hashSet.add(curr);
            curr = curr.next;
        }
        return false;
    }
    public static boolean detectALoopFloyds(Node head) {
        Node slowPointer = head;
        Node fastPointer = head;

        while(slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer)
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // I have created a loop by pointing 50 to 30
        head.next.next.next.next = head.next;

        boolean isAloop = detectALoop(head);
        boolean isAloop2 = detectALoopHashing(head);
        if(isAloop2) {
            System.out.println("Yes, loop detected");
        }
        else System.out.println("No, there is no loop detected.");

        /* Detect a loop using Floyd's Cycle Detection*/
        /*This algorithm is used to find a loop in a linked list.
         It uses two pointers one moving twice as fast as the other one.
         The faster one is called the faster pointer and the other one is called the slow pointer.*/
        System.out.println("Detecting loop using Floyd's Cycle Detection: ");
        boolean isAloop3 = detectALoopFloyds(head);
        if(isAloop3) {
            System.out.println("Loop Detected!!!");
        }
        else
            System.out.println("No Loop Detected!");


    }
}
