package tech.blueglacier.linkedlist;

// sorting a LL with 0's , 1's and 2's

public class SortLLOf012 {
    public static Node sortLL(Node head){
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;
        Node temp = head;
        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            } else if (temp.data==1) {
                one.next = temp;
                one = temp;
            }else{
                two.next = temp;
                two = temp;
            }
            Node nextNode = temp.next;
            temp.next = null;
            temp = nextNode;
        }
        if(oneHead.next != null){
            zero.next = oneHead.next;
        }else{
            if(twoHead.next != null){
                zero.next = twoHead.next;
            }
        }
        if(twoHead.next != null){
            oneHead.next = twoHead.next;
        }else{
            oneHead.next= null;
        }

        two.next = null;
        Node newHead = zeroHead.next;
        return newHead;
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(2);
        head.next.next.next= new Node(1);
        head.next.next.next.next = new Node(0);
        Node ans = sortLL(head);
        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }
}
