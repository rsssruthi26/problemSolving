import java.util.HashSet;

public class IntersectionPointOfLL {

    public static Node getIntersectionNodeNaive(Node head1, Node head2) {

        while(head2 != null) {
            Node temp = head1;
            while(temp != null) {
                if(temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    private static Node getIntersectionNodeNaiveHashing(Node head1, Node head2) {

        HashSet<Node> hashSet = new HashSet<>();
        while(head1 != null) {
            hashSet.add(head1);
            head1 = head1.next;
        }

        while(head2 != null) {
            if(hashSet.contains(head2))
                return head2;
            head2 = head2.next;
        }

        return null;
    }
    public static void main(String[] args) {

        Node head1, head2;

        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node intersectionPoint = getIntersectionNodeNaive(head1, head2);
        Node intersectionPoint2 = getIntersectionNodeNaiveHashing(head1,head2);
        if (intersectionPoint2 == null) {
            System.out.println(" No Intersection Point \n");
        }
        else {
            System.out.println("Intersection Point: "
                    + intersectionPoint2.data);
        }
    }


}
