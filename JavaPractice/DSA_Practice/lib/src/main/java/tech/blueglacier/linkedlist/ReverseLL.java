package tech.blueglacier.linkedlist;

public class ReverseLL {
    public static Node reverseLLiterative(Node head) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static Node reverseLLRecursive(Node head){
        if(head == null || head.next ==null){
            return head;
        }
        Node newHead = reverseLLRecursive(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        // 1 -> 3 -> 2 -> 6 -> 7 -> null
        Node ans = reverseLLiterative(head);
        System.out.print(ans.data + " ");

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(2);
        head2.next.next.next = new Node(6);
        head2.next.next.next.next = new Node(7);
        Node ans2 = reverseLLRecursive(head2);
        System.out.print(ans2.data + " ");

    }

}
