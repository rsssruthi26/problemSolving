public class PairWiseSwap {

    public static Node pariWiseSwapEff(Node head) {

        if(head == null || head.next == null) {
            return head;
        }

        Node curr = head.next.next;
        Node prev = head;
        head = head.next;
        head.next = prev;
        while(curr != null && curr.next != null) {
            prev.next = curr.next;
            prev = curr;
            Node next = curr.next.next;
            curr.next.next = curr;
            curr = next;
        }
        prev.next = curr;
        return head;

    }
    public static  void print(Node head) {
        Node curr = head;
        while(curr != null ) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next=new Node(8);
        head.next.next.next=new Node(12);
        head.next.next.next.next=new Node(10);
        head.next.next.next.next.next=new Node(5);
        head.next.next.next.next.next.next=new Node(4);
        System.out.println("Original LinkedList : " );
        print(head);
        System.out.println("Swapped LinkedList: ");

        Node resultHead = pariWiseSwapEff(head);
        print(resultHead);
        int i = 010;
        int j = 07;
        System.out.println(i);
        System.out.println(j);
    }
}
