package tech.blueglacier.linkedlist;

// step 1 - detect a loop
// step 2 - when fast and slow collide , move slow to head and increase both until they collide again

public class FindStartNodeOfLoop {
    public Node findStartNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!= null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                slow = head;
                while(slow != fast){
                    slow= slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
