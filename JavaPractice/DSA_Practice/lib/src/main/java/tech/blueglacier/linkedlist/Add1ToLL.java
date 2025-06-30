package tech.blueglacier.linkedlist;

// 1 -> 5 -> 9 -> null  changes to  1 -> 6 -> 0 -> null
public class Add1ToLL {
    public static Node addOne(Node head) {
        int carry = returnCarry(head);
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    public static int returnCarry(Node head) {
        if (head == null) {
            return 1;
        }
        int carry = returnCarry(head.next);
        head.data = head.data + carry;
        if (head.data < 10) {
            return 0;
        }
        head.data = 0;
        return 1;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(9);
        Node ans = addOne(head);
        System.out.println(ans);
    }
}
