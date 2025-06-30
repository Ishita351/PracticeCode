package tech.blueglacier.linkedlist;

// always use slow and fast pointers ( tortoise and hare algorithm )

public class FindMiddleOfLL {
    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!= null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(9);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        Node ans = findMid(head);
        System.out.println(ans.data);
    }
}
