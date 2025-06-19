package tech.blueglacier;

import org.testng.Assert;
import org.testng.annotations.Test;
import tech.blueglacier.exceptions.IllegalTreeNodeValueException;

import java.util.ArrayList;
import java.util.List;

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
        getBinarySearchTree();
    }

    private BinarySearchTree getBinarySearchTree() throws IllegalTreeNodeValueException {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(60);
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
        getBinarySearchTreeRandomOrder();
    }

    private BinarySearchTree getBinarySearchTreeRandomOrder() throws IllegalTreeNodeValueException {
        BinarySearchTreeNode rootNode = new BinarySearchTreeNode(60);
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
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.inorderTraversal( traversedData ,binarySearchTree.getRootNode());
        System.out.println(traversedData);
    }
    @Test
    public void testRandomBinarySearchTreeInorderTraversal() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTreeRandomOrder();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.inorderTraversal( traversedData ,binarySearchTree.getRootNode());
        System.out.println(traversedData);
    }
    @Test
    public void testBinarySearchTreePreorderTraversal() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.preorderTraversal( traversedData ,binarySearchTree.getRootNode());
        System.out.println(traversedData);
    }
    @Test
    public void testRandomBinarySearchTreePreorderTraversal() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTreeRandomOrder();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.preorderTraversal( traversedData ,binarySearchTree.getRootNode());
        System.out.println(traversedData);
    }
    @Test
    public void testBinarySearchTreePostorderTraversal() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTree();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.postorderTraversal( traversedData ,binarySearchTree.getRootNode());
        System.out.println(traversedData);
    }
    @Test
    public void testRandomBinarySearchTreePostorderTraversal() throws IllegalTreeNodeValueException {
        BinarySearchTree binarySearchTree = this.getBinarySearchTreeRandomOrder();
        List<Integer> traversedData = new ArrayList<>();
        binarySearchTree.postorderTraversal( traversedData ,binarySearchTree.getRootNode());
        System.out.println(traversedData);
    }

}
