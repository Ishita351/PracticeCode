package tech.blueglacier;

import tech.blueglacier.exceptions.IllegalTreeNodeValueException;

public class BinarySearchTreeNode {
    private int binarySearchTreeNodeValue;
    private BinarySearchTreeNode leftBinarySearchTreeNode;
    private BinarySearchTreeNode rightBinarySearchTreeNode;
    private BinarySearchTreeNode parentBinarySearchTreeNode;

    public BinarySearchTreeNode(int binarySearchTreeNodeValue) {
        this.binarySearchTreeNodeValue = binarySearchTreeNodeValue;
    }

    public int getBinarySearchTreeNodeValue() {
        return binarySearchTreeNodeValue;
    }

    public BinarySearchTreeNode getLeftBinarySearchTreeNode() {
        return leftBinarySearchTreeNode;
    }

    public void setLeftBinarySearchTreeNode(BinarySearchTreeNode leftBinarySearchTreeNode) throws IllegalTreeNodeValueException {
        if (leftBinarySearchTreeNode.getBinarySearchTreeNodeValue() <= this.binarySearchTreeNodeValue) {
            this.leftBinarySearchTreeNode = leftBinarySearchTreeNode;
        } else {
            throw new IllegalTreeNodeValueException("left node is larger");
        }

    }

    public BinarySearchTreeNode getRightBinarySearchTreeNode() {
        return rightBinarySearchTreeNode;
    }

    public void setRightBinarySearchTreeNode(BinarySearchTreeNode rightBinarySearchTreeNode) throws IllegalTreeNodeValueException {
        if (rightBinarySearchTreeNode.getBinarySearchTreeNodeValue() >= this.binarySearchTreeNodeValue) {
            this.rightBinarySearchTreeNode = rightBinarySearchTreeNode;
        } else {
            throw new IllegalTreeNodeValueException("right node is smaller");
        }
    }

    public BinarySearchTreeNode getParentBinarySearchTreeNode() {
        return parentBinarySearchTreeNode;
    }

    public void setParentBinarySearchTreeNode(BinarySearchTreeNode parentBinarySearchTreeNode) {
        this.parentBinarySearchTreeNode = parentBinarySearchTreeNode;
    }

}
