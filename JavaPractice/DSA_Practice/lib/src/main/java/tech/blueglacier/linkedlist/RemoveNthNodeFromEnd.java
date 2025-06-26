package tech.blueglacier.linkedlist;

// using fast and slow pointers

public class RemoveNthNodeFromEnd {
    public static Node removeNode(Node head , int N){
        Node fast = head;
        for( int i = 0 ; i < N; i++){
            fast = fast.next;
        }
        Node slow = head;
        while(fast.next != null){
            fast= fast.next;
            slow = slow.next;
        }
        if(fast == null){
            return  head.next;
        }
        //ListNode delNode= slow.next;
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next= new Node(6);
        head.next.next.next.next = new Node(7);
        Node ans = removeNode(head,2);
        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }
}
