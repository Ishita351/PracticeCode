package tech.blueglacier.linkedlist;

// fast and slow

public class DetectALoop {
    public static boolean findLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow= slow.next;
            fast =fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
