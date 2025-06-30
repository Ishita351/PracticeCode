package tech.blueglacier.linkedlist;

public class LengthOfLoop {
    public int detectLoopLength(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow= slow.next;
            fast =fast.next.next;
            if(slow == fast){
                return findLengthOfLoop(slow,fast);
            }
        }
        return 0;
    }

    private int findLengthOfLoop(Node slow, Node fast) {
        int cnt = 1;
        fast = fast.next;
        while(slow != fast){
            cnt ++;
            fast = fast.next;
        }
        return cnt;
    }
}
