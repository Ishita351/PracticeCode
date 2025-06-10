package tech.blueglacier;

public class BinarySearchTreeNode {
    private int binarySearchTreeNodeValue;
    private BinarySearchTreeNode leftBinarySearchTreeNode;
    private BinarySearchTreeNode rightBinarySearchTreeNode;

    public BinarySearchTreeNode(int binarySearchTreeNodeValue) {
        this.binarySearchTreeNodeValue = binarySearchTreeNodeValue;
    }

    public int getBinarySearchTreeNodeValue() {
        return binarySearchTreeNodeValue;
    }

    /*public void setBinarySearchTreeNodeValue(int binarySearchTreeNodeValue) {
        this.binarySearchTreeNodeValue = binarySearchTreeNodeValue;
    }
*/
    public BinarySearchTreeNode getLeftBinarySearchTreeNode() {
        return leftBinarySearchTreeNode;
    }

    public void setLeftBinarySearchTreeNode(BinarySearchTreeNode leftBinarySearchTreeNode) {
        this.leftBinarySearchTreeNode = leftBinarySearchTreeNode;
    }


    public BinarySearchTreeNode getRightBinarySearchTreeNode() {
        return rightBinarySearchTreeNode;
    }

    public void setRightBinarySearchTreeNode(BinarySearchTreeNode rightBinarySearchTreeNode) {
        this.rightBinarySearchTreeNode = rightBinarySearchTreeNode;
    }
}
