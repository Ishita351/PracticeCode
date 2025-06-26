package tech.blueglacier.linkedlist;

public class DeleteMiddleNode {
    public static void deleteMid(Node head){
        Node slow = head;
        Node fast =head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(7);
        // 1 -> 3 -> 3 -> 3 -> 7 -> null
        deleteMid(head);
        printList(head);
    }
}
