package tech.blueglacier;

import org.testng.Assert;
import org.testng.annotations.Test;
import tech.blueglacier.exceptions.IllegalTreeNodeValueException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchTreeTest {

    @Test
    public void testBinarySearchTree() {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(10);
        rootNode.setParentBinarySearchTreeNode(null);
        BinarySearchTree binarySearchTree = new BinarySearchTree(rootNode);
        BinarySearchTreeNode expectedRootNode = binarySearchTree.getRootNode();
        Assert.assertEquals(expectedRootNode.getBinarySearchTreeNodeValue(), rootNode.getBinarySearchTreeNodeValue());
    }

    @Test
    public void testBinarySearchTreeInsertion() throws IllegalTreeNodeValueException {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(10);
        rootNode.setParentBinarySearchTreeNode(null);
        BinarySearchTree binarySearchTree = new BinarySearchTree(rootNode);
        BinarySearchTreeNode level1LeftNode = new BinarySearchTreeNode(8);
        rootNode.setLeftBinarySearchTreeNode(level1LeftNode);
        BinarySearchTreeNode level1RightNode = new BinarySearchTreeNode(12);
        rootNode.setRightBinarySearchTreeNode(level1RightNode);
        Assert.assertEquals(binarySearchTree.getRootNode().getLeftBinarySearchTreeNode().getBinarySearchTreeNodeValue(), 8);
        Assert.assertEquals(binarySearchTree.getRootNode().getRightBinarySearchTreeNode().getBinarySearchTreeNodeValue(), 12);
    }

    @Test
    public void testBinarySearchTreeInsertionMethod() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = getBinarySearchTree();
        Assert.assertEquals(binarySearchTree.getRootNode().getLeftBinarySearchTreeNode().getRightBinarySearchTreeNode().getBinarySearchTreeNodeValue(), 50);
        Assert.assertEquals(binarySearchTree.getRootNode().getRightBinarySearchTreeNode().getLeftBinarySearchTreeNode().getBinarySearchTreeNodeValue(), 64);
    }

    private BinarySearchTree getBinarySearchTree() throws IllegalTreeNodeValueException {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(60);
        rootNode.setParentBinarySearchTreeNode(null);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(rootNode);
        BinarySearchTreeNode node49 = new BinarySearchTreeNode(49);
        binarySearchTree.insert(node49);
        BinarySearchTreeNode node65 = new BinarySearchTreeNode(65);
        binarySearchTree.insert(node65);
        BinarySearchTreeNode node46 = new BinarySearchTreeNode(46);
        binarySearchTree.insert(node46);
        BinarySearchTreeNode node64 = new BinarySearchTreeNode(64);
        binarySearchTree.insert(node64);
        BinarySearchTreeNode node50 = new BinarySearchTreeNode(50);
        binarySearchTree.insert(node50);
        BinarySearchTreeNode node70 = new BinarySearchTreeNode(70);
        binarySearchTree.insert(node70);
        return binarySearchTree;
    }

    @Test
    public void testBinarySearchTreeInsertionMethodRandomOrder() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = getBinarySearchTreeRandomOrder();
        Assert.assertEquals(binarySearchTree.getRootNode().getLeftBinarySearchTreeNode().getRightBinarySearchTreeNode().getBinarySearchTreeNodeValue(), 50);
        Assert.assertEquals(binarySearchTree.getRootNode().getRightBinarySearchTreeNode().getLeftBinarySearchTreeNode().getBinarySearchTreeNodeValue(), 65);
    }

    private BinarySearchTree getBinarySearchTreeRandomOrder() throws IllegalTreeNodeValueException {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(60);
        rootNode.setParentBinarySearchTreeNode(null);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(rootNode);
        BinarySearchTreeNode node70 = new BinarySearchTreeNode(70);
        binarySearchTree.insert(node70);
        BinarySearchTreeNode node65 = new BinarySearchTreeNode(65);
        binarySearchTree.insert(node65);
        BinarySearchTreeNode node46 = new BinarySearchTreeNode(46);
        binarySearchTree.insert(node46);
        BinarySearchTreeNode node64 = new BinarySearchTreeNode(64);
        binarySearchTree.insert(node64);
        BinarySearchTreeNode node50 = new BinarySearchTreeNode(50);
        binarySearchTree.insert(node50);
        BinarySearchTreeNode node49 = new BinarySearchTreeNode(49);
        binarySearchTree.insert(node49);
        return binarySearchTree;
    }

    @Test
    public void testBinarySearchTreeInorderTraversal() throws IllegalTreeNodeValueException {
        int testTreeOrderArray[] = {46, 49, 50, 60, 64, 65, 70};
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.inorderTraversal(traversedData, binarySearchTree.getRootNode());
        int[] inOrderTraversalArray = traversedData.stream().mapToInt(Integer::intValue).toArray();
        Assert.assertEquals(inOrderTraversalArray, testTreeOrderArray);
    }

    @Test
    public void testRandomBinarySearchTreeInorderTraversal() throws IllegalTreeNodeValueException {
        int testTreeOrderArray[] = {46, 49, 50, 60, 64, 65, 70};
        BinarySearchTree binarySearchTree = this.getBinarySearchTreeRandomOrder();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.inorderTraversal(traversedData, binarySearchTree.getRootNode());
        int[] inOrderTraversalArray = traversedData.stream().mapToInt(Integer::intValue).toArray();
        Assert.assertEquals(inOrderTraversalArray, testTreeOrderArray);
    }

    @Test
    public void testBinarySearchTreePreorderTraversal() throws IllegalTreeNodeValueException {
        int testTreeOrderArray[] = {60, 49, 46, 50, 65, 64, 70};
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.preorderTraversal(traversedData, binarySearchTree.getRootNode());
        int[] preOrderTraversalArray = traversedData.stream().mapToInt(Integer::intValue).toArray();
        Assert.assertEquals(preOrderTraversalArray, testTreeOrderArray);
    }

    @Test
    public void testRandomBinarySearchTreePreorderTraversal() throws IllegalTreeNodeValueException {
        int testTreeOrderArray[] = {60, 46, 50, 49, 70, 65, 64};
        BinarySearchTree binarySearchTree = this.getBinarySearchTreeRandomOrder();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.preorderTraversal(traversedData, binarySearchTree.getRootNode());
        int[] preOrderTraversalArray = traversedData.stream().mapToInt(Integer::intValue).toArray();
        Assert.assertEquals(preOrderTraversalArray, testTreeOrderArray);
    }

    @Test
    public void testBinarySearchTreePostorderTraversal() throws IllegalTreeNodeValueException {
        int testTreeOrderArray[] = {46, 50, 49, 64, 70, 65, 60};
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.postorderTraversal(traversedData, binarySearchTree.getRootNode());
        int[] postOrderTraversalArray = traversedData.stream().mapToInt(Integer::intValue).toArray();
        Assert.assertEquals(postOrderTraversalArray, testTreeOrderArray);
    }

    @Test
    public void testRandomBinarySearchTreePostorderTraversal() throws IllegalTreeNodeValueException {
        int testTreeOrderArray[] = {49, 50, 46, 64, 65, 70, 60};
        BinarySearchTree binarySearchTree = this.getBinarySearchTreeRandomOrder();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.postorderTraversal(traversedData, binarySearchTree.getRootNode());
        int[] postOrderTraversalArray = traversedData.stream().mapToInt(Integer::intValue).toArray();
        Assert.assertEquals(postOrderTraversalArray, testTreeOrderArray);
    }

    @Test
    public void testBinarySearchTreeRecursiveSearch() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        BinarySearchTreeNode binarySearchTreeNode = binarySearchTree.treeSearchRecursive(46, binarySearchTree.getRootNode());
        Assert.assertNotNull(binarySearchTreeNode);
        Assert.assertEquals(binarySearchTreeNode.getBinarySearchTreeNodeValue(), 46);


        binarySearchTreeNode = binarySearchTree.treeSearchRecursive(70, binarySearchTree.getRootNode());
        Assert.assertNotNull(binarySearchTreeNode);
        Assert.assertEquals(binarySearchTreeNode.getBinarySearchTreeNodeValue(), 70);

    }

    @Test
    public void testBinarySearchTreeIterativeSearch() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        BinarySearchTreeNode binarySearchTreeNode = binarySearchTree.treeSearchIterative(46, binarySearchTree.getRootNode());
        Assert.assertNotNull(binarySearchTreeNode);
        Assert.assertEquals(binarySearchTreeNode.getBinarySearchTreeNodeValue(), 46);


        binarySearchTreeNode = binarySearchTree.treeSearchIterative(70, binarySearchTree.getRootNode());
        Assert.assertNotNull(binarySearchTreeNode);
        Assert.assertEquals(binarySearchTreeNode.getBinarySearchTreeNodeValue(), 70);

    }

    @Test
    public void testBinarySearchTreeMinimunValue() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        BinarySearchTreeNode binarySearchTreeNode = binarySearchTree.getBinarySearchTreeMinimum(binarySearchTree.getRootNode());
        Assert.assertEquals(binarySearchTreeNode.getBinarySearchTreeNodeValue(), 46);
    }

    @Test
    public void testBinarySearchTreeMaximumValue() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        BinarySearchTreeNode binarySearchTreeNode = binarySearchTree.getBinarySearchTreeMaximum(binarySearchTree.getRootNode());
        Assert.assertEquals(binarySearchTreeNode.getBinarySearchTreeNodeValue(), 70);
    }

    @Test
    public void testBinarySearchTreeSuccessor() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        BinarySearchTreeNode binarySearchTreeNode = binarySearchTree.getBinarySearchTreeSuccessor(binarySearchTree.getRootNode().getRightBinarySearchTreeNode());
        Assert.assertEquals(binarySearchTreeNode.getBinarySearchTreeNodeValue(), 70);
    }

    @Test
    public void testBinarySearchTreeSuccessor2() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        BinarySearchTreeNode binarySearchTreeNode = binarySearchTree.getBinarySearchTreeSuccessor(binarySearchTree.getRootNode().getLeftBinarySearchTreeNode().getRightBinarySearchTreeNode());
        Assert.assertEquals(binarySearchTreeNode.getBinarySearchTreeNodeValue(), 60);
    }

    @Test
    public void testBinarySearchTreePredecessor() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        BinarySearchTreeNode binarySearchTreeNode = binarySearchTree.getBinarySearchTreePredecessor(binarySearchTree.getRootNode().getRightBinarySearchTreeNode());
        Assert.assertEquals(binarySearchTreeNode.getBinarySearchTreeNodeValue(), 64);
    }

    @Test
    public void testBinarySearchTreePredecessor2() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        BinarySearchTreeNode binarySearchTreeNode = binarySearchTree.getBinarySearchTreePredecessor(binarySearchTree.getRootNode().getRightBinarySearchTreeNode().getLeftBinarySearchTreeNode());
        Assert.assertEquals(binarySearchTreeNode.getBinarySearchTreeNodeValue(), 60);
    }
}
