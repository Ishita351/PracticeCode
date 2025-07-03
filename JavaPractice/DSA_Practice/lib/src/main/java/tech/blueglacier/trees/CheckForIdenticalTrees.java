package tech.blueglacier.trees;

public class CheckForIdenticalTrees {
    public boolean isIdentical(Node node1 , Node node2){
        if(node1==null || node2 ==null){
            return (node1==node2);
        }
        return ((node1.data==node2.data) &&
                isIdentical(node1.left,node2.left) &&
                isIdentical(node1.right,node2.right));
    }
}
