package tech.blueglacier;

import org.testng.Assert;
import org.testng.annotations.Test;
import tech.blueglacier.exceptions.IllegalTreeNodeValueException;

public class BinarySearchTreeTest {

    @Test
    public void testBinarySearchTree() {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(10);
        BinarySearchTree binarySearchTree = new BinarySearchTree(rootNode);
        BinarySearchTreeNode expectedRootNode = binarySearchTree.getRootNode();
        Assert.assertEquals(expectedRootNode.getBinarySearchTreeNodeValue(), rootNode.getBinarySearchTreeNodeValue());
    }
    @Test
    public void testBinarySearchTreeInsertion() throws IllegalTreeNodeValueException {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(10);
        BinarySearchTree binarySearchTree = new BinarySearchTree(rootNode);
        BinarySearchTreeNode level1LeftNode = new BinarySearchTreeNode(8);
        rootNode.setLeftBinarySearchTreeNode(level1LeftNode);
        BinarySearchTreeNode level1RightNode = new BinarySearchTreeNode(12);
        rootNode.setRightBinarySearchTreeNode(level1RightNode);
    }
    @Test
    public void testBinarySearchTreeInsertionMethod() throws IllegalTreeNodeValueException {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(60);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(rootNode);
    }
}
