package tech.blueglacier;

import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void testBinarySearchTree(){
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(10);
        BinarySearchTree binarySearchTree = new BinarySearchTree(rootNode);
        binarySearchTree.getRootNode();
    }
}
