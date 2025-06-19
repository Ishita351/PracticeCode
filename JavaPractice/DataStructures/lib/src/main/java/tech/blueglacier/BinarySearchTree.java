package tech.blueglacier;

import tech.blueglacier.exceptions.IllegalTreeNodeValueException;

import java.util.List;

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
            if (iterationNode.getLeftBinarySearchTreeNode() == null && iterationNode.getBinarySearchTreeNodeValue() > binarySearchTreeNode.getBinarySearchTreeNodeValue()) {
                iterationNode.setLeftBinarySearchTreeNode(binarySearchTreeNode);
                break;
            } else if (binarySearchTreeNode.getBinarySearchTreeNodeValue() < iterationNode.getBinarySearchTreeNodeValue() && iterationNode.getLeftBinarySearchTreeNode() != null) {
                iterationNode = iterationNode.getLeftBinarySearchTreeNode();
                continue;
            }
            if (iterationNode.getRightBinarySearchTreeNode() == null && iterationNode.getBinarySearchTreeNodeValue() <= binarySearchTreeNode.getBinarySearchTreeNodeValue()) {
                iterationNode.setRightBinarySearchTreeNode(binarySearchTreeNode);
                break;
            } else if (binarySearchTreeNode.getBinarySearchTreeNodeValue() >= iterationNode.getBinarySearchTreeNodeValue() && iterationNode.getRightBinarySearchTreeNode() != null) {
                iterationNode = iterationNode.getRightBinarySearchTreeNode();
                continue;
            }
        }
    }

    public void inorderTraversal(List<Integer> traversedData, BinarySearchTreeNode iterationNode) {
        if (iterationNode != null) {
            this.inorderTraversal(traversedData, iterationNode.getLeftBinarySearchTreeNode());
            traversedData.add(iterationNode.getBinarySearchTreeNodeValue());
            this.inorderTraversal(traversedData, iterationNode.getRightBinarySearchTreeNode());
        }
    }

    public void preorderTraversal(List<Integer> traversedData, BinarySearchTreeNode iterationNode) {
        if (iterationNode != null) {
            traversedData.add(iterationNode.getBinarySearchTreeNodeValue());
            this.preorderTraversal(traversedData, iterationNode.getLeftBinarySearchTreeNode());
            this.preorderTraversal(traversedData, iterationNode.getRightBinarySearchTreeNode());
        }
    }

    public void postorderTraversal(List<Integer> traversedData, BinarySearchTreeNode iterationNode) {
        if (iterationNode != null) {
            this.postorderTraversal(traversedData, iterationNode.getLeftBinarySearchTreeNode());
            this.postorderTraversal(traversedData, iterationNode.getRightBinarySearchTreeNode());
            traversedData.add(iterationNode.getBinarySearchTreeNodeValue());
        }
    }
}

