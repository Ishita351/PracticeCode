package tech.blueglacier.trees;

public class Node {
    int data;
    Node left;
    Node right;
    int hd; // horizontal depth
    public Node(int data, int hd){
        this.data = data;
        this.hd =hd;
    }
}
