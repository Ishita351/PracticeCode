package tech.blueglacier.linkedlist;

import static tech.blueglacier.linkedlist.ReverseLL.reverseLLiterative;

// reverse the linked list from mid and check if values match from the staring
public class CheckForPalindrome {
    public static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverseLLiterative(slow.next);
        Node first = head;
        Node second = newHead;
        while(second != null){
            if (first.data != second.data){
                reverseLLiterative(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLLiterative(newHead);
        return true;
    }
    /*
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        // 1 -> 3 -> 2 -> 6 -> 7 -> null
        boolean ans = isPalindrome(head);
        System.out.print(ans);
    } */

}
