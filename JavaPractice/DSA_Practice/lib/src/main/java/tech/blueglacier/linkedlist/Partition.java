package tech.blueglacier.linkedlist;

public class Partition {
    public static void partitionLL(Node node, int val){
        Node head = node;
        Node tail = node;
        while(node != null){
            if(node.data > val){
                tail.next = node;
                tail = node;
            }else{
                node.next = head;
                head= node;
            }
            node = node.next;
        }
        tail.next = null;
    }
}
