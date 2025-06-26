package tech.blueglacier.linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void deleteDups(Node head) {
        HashSet<Integer> set = new HashSet<Integer>();
        Node previous = null;
        while (head != null) {
            if (set.contains(head.data)) {
                previous.next = head.next;
            } else {
                set.add(head.data);
                previous = head;
            }
            head = head.next;
        }
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
        deleteDups(head);
        printList(head);
    }

}

