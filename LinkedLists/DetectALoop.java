public class DetectALoop {

    static void printList(Node head) {
        while(head != null) {
            System.out.println(head.data + " " );
            head = head.next;
        }
        System.out.println();
    }

    static boolean detectALoop(Node head) {
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

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // I have created a loop by pointing 50 to 30
        head.next.next.next.next = head.next;

        boolean isAloop = detectALoop(head);
        if(isAloop) {
            System.out.println("Yes, loop detected");
        }
        else System.out.println("No, there is no loop detected.");

    }
}
