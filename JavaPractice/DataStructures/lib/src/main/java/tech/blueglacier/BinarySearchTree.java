package tech.blueglacier;

import tech.blueglacier.exceptions.IllegalTreeNodeValueException;

public class BinarySearchTree {
    private BinarySearchTreeNode rootNode;

    public BinarySearchTreeNode getRootNode() {
        return this.rootNode;
    }

    public BinarySearchTree(BinarySearchTreeNode rootNode) {
        this.rootNode = rootNode;
    }

    public BinarySearchTree() {

    }

    public void insert(BinarySearchTreeNode binarySearchTreeNode) throws IllegalTreeNodeValueException {
        if (this.rootNode == null) {
            this.rootNode = binarySearchTreeNode;
            return;
        }
        BinarySearchTreeNode iterationNode = this.rootNode;
        while (iterationNode != null) {
            if (iterationNode.getLeftBinarySearchTreeNode() != null &&
                    iterationNode.getBinarySearchTreeNodeValue() < binarySearchTreeNode.getBinarySearchTreeNodeValue()) {
                iterationNode = iterationNode.getLeftBinarySearchTreeNode();
            } else {
                iterationNode.setLeftBinarySearchTreeNode(binarySearchTreeNode);
                break;
            }
            if (iterationNode.getRightBinarySearchTreeNode() != null &&
                    iterationNode.getBinarySearchTreeNodeValue() >= binarySearchTreeNode.getBinarySearchTreeNodeValue()) {
                iterationNode = iterationNode.getRightBinarySearchTreeNode();
            } else {
                iterationNode.setRightBinarySearchTreeNode(binarySearchTreeNode);
                break;
            }
        }
    }
}

