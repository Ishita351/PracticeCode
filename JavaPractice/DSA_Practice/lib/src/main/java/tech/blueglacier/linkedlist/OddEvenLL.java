package tech.blueglacier.linkedlist;

// Example: 1 -> 2 -> 3 -> 4 -> 5 becomes 1 -> 3 -> 5 -> 2 -> 4 (chanegd on basis of index)

public class OddEvenLL {
    public Node testOddEvenLL(Node head) {
        if (head == null || head.next == null){
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        OddEvenLL obj = new OddEvenLL();
        Node result = obj.testOddEvenLL(head);

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
