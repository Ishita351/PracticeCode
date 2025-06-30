package tech.blueglacier.linkedlist;

public class FindIntersection {
    public static Node intersectLL(Node head1 , Node head2){
        if(head1 == null || head2 == null){
            return null;
        }
        Node t1 = head1;
        Node t2 = head2;
        while( t1 != t2 ){
            t1 = t1.next;
            t2 = t2.next;
            if( t1 == t2 ){
                return t1;
            }
            if(t1 == null){
                t1 = head2;
            }
            if(t2 == null){
                t2 = head1;
            }
        }
        return t1 ;
    }
    public static void main(String[] args){
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(2);
        head1.next.next.next = new Node(6);
        head1.next.next.next.next = new Node(7);
        Node head2 = new Node(10);
        head2.next = new Node(3);
        head2.next.next = new Node(21);
        head2.next.next.next = new Node(6);
        head2.next.next.next.next = new Node(7);
        Node ans = intersectLL(head1,head2);
        System.out.println(ans);
    }
}
