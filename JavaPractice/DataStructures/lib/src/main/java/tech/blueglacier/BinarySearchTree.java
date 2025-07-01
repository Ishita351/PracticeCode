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
            if (iterationNode.getLeftBinarySearchTreeNode() == null &&
                    iterationNode.getBinarySearchTreeNodeValue() > binarySearchTreeNode.getBinarySearchTreeNodeValue()) {
                iterationNode.setLeftBinarySearchTreeNode(binarySearchTreeNode);
                binarySearchTreeNode.setParentBinarySearchTreeNode(iterationNode);
                break;
            } else if (binarySearchTreeNode.getBinarySearchTreeNodeValue() < iterationNode.getBinarySearchTreeNodeValue() &&
                    iterationNode.getLeftBinarySearchTreeNode() != null) {
                iterationNode = iterationNode.getLeftBinarySearchTreeNode();
                continue;
            }
            if (iterationNode.getRightBinarySearchTreeNode() == null &&
                    iterationNode.getBinarySearchTreeNodeValue() <= binarySearchTreeNode.getBinarySearchTreeNodeValue()) {
                iterationNode.setRightBinarySearchTreeNode(binarySearchTreeNode);
                binarySearchTreeNode.setParentBinarySearchTreeNode(iterationNode);
                break;
            } else if (binarySearchTreeNode.getBinarySearchTreeNodeValue() >= iterationNode.getBinarySearchTreeNodeValue() &&
                    iterationNode.getRightBinarySearchTreeNode() != null) {
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

    public BinarySearchTreeNode treeSearchRecursive(int key, BinarySearchTreeNode iterationNode) {
        if (iterationNode == null || iterationNode.getBinarySearchTreeNodeValue() == key) {
            return iterationNode;
        }
        if (key < iterationNode.getBinarySearchTreeNodeValue()) {
            return this.treeSearchRecursive(key, iterationNode.getLeftBinarySearchTreeNode());
        } else {
            return this.treeSearchRecursive(key, iterationNode.getRightBinarySearchTreeNode());
        }
    }

    public BinarySearchTreeNode treeSearchIterative(int key, BinarySearchTreeNode iterationNode) {
        while (iterationNode != null && iterationNode.getBinarySearchTreeNodeValue() != key) {
            if (key < iterationNode.getBinarySearchTreeNodeValue()) {
                iterationNode = iterationNode.getLeftBinarySearchTreeNode();
            } else {
                iterationNode = iterationNode.getRightBinarySearchTreeNode();
            }
        }
        return iterationNode;
    }

    public BinarySearchTreeNode getBinarySearchTreeMinimum(BinarySearchTreeNode binarySearchTreeNode) {
        BinarySearchTreeNode iterationNode = binarySearchTreeNode;
        while (iterationNode.getLeftBinarySearchTreeNode() != null) {
            iterationNode = iterationNode.getLeftBinarySearchTreeNode();
        }
        return iterationNode;
    }

    public BinarySearchTreeNode getBinarySearchTreeMaximum(BinarySearchTreeNode binarySearchTreeNode) {
        BinarySearchTreeNode iterationNode = binarySearchTreeNode;
        while (iterationNode.getRightBinarySearchTreeNode() != null) {
            iterationNode = iterationNode.getRightBinarySearchTreeNode();
        }
        return iterationNode;
    }

    public BinarySearchTreeNode getBinarySearchTreeSuccessor(BinarySearchTreeNode binarySearchTreeNode) {
        BinarySearchTreeNode iterationNode = binarySearchTreeNode;
        if (binarySearchTreeNode.getRightBinarySearchTreeNode() != null) {
            return getBinarySearchTreeMinimum(binarySearchTreeNode.getRightBinarySearchTreeNode());
        } else {
            iterationNode = binarySearchTreeNode.getParentBinarySearchTreeNode();
            while (iterationNode != null && binarySearchTreeNode == iterationNode.getRightBinarySearchTreeNode()) {
                binarySearchTreeNode = iterationNode;
                iterationNode = iterationNode.getParentBinarySearchTreeNode();
            }
            return iterationNode;
        }
    }

    public BinarySearchTreeNode getBinarySearchTreePredecessor(BinarySearchTreeNode binarySearchTreeNode) {
        BinarySearchTreeNode iterationNode = binarySearchTreeNode;
        if (binarySearchTreeNode.getLeftBinarySearchTreeNode() != null) {
            return getBinarySearchTreeMaximum(binarySearchTreeNode.getLeftBinarySearchTreeNode());
        } else {
            iterationNode = binarySearchTreeNode.getParentBinarySearchTreeNode();
            while (iterationNode != null && binarySearchTreeNode == iterationNode.getLeftBinarySearchTreeNode()) {
                binarySearchTreeNode = iterationNode;
                iterationNode = iterationNode.getParentBinarySearchTreeNode();
            }
            return iterationNode;
        }
    }

    public void transplantBinarySearchTree(BinarySearchTreeNode targetForReplacementU, BinarySearchTreeNode targetV) throws IllegalTreeNodeValueException {
        if (targetForReplacementU.getParentBinarySearchTreeNode() == null) {
            this.rootNode = targetV;
        } else if (targetForReplacementU == targetForReplacementU.getParentBinarySearchTreeNode().getLeftBinarySearchTreeNode()) {
            targetForReplacementU.getParentBinarySearchTreeNode().setLeftBinarySearchTreeNode(targetV);
        } else {
            if (targetForReplacementU != null &&
                    targetForReplacementU.getParentBinarySearchTreeNode() != null &&
                    targetV != null) {
                targetForReplacementU.getParentBinarySearchTreeNode().setRightBinarySearchTreeNode(targetV);
            }
        }
        if (targetV != null) {
            targetV.setParentBinarySearchTreeNode(targetForReplacementU.getParentBinarySearchTreeNode());
        }
    }

    public void deleteBinarySearchTree(BinarySearchTreeNode nodeToDeleteZ) throws IllegalTreeNodeValueException {
        if (nodeToDeleteZ.getLeftBinarySearchTreeNode() == null) {
            transplantBinarySearchTree(nodeToDeleteZ, nodeToDeleteZ.getRightBinarySearchTreeNode());
        } else if (nodeToDeleteZ.getRightBinarySearchTreeNode() == null) {
            transplantBinarySearchTree(nodeToDeleteZ, nodeToDeleteZ.getLeftBinarySearchTreeNode());
        } else {
            BinarySearchTreeNode successorToNodeToDeleteZ_Y = this.getBinarySearchTreeMinimum(nodeToDeleteZ.getRightBinarySearchTreeNode());
            if (successorToNodeToDeleteZ_Y != nodeToDeleteZ.getRightBinarySearchTreeNode()) {
                transplantBinarySearchTree(successorToNodeToDeleteZ_Y, successorToNodeToDeleteZ_Y.getRightBinarySearchTreeNode());
                successorToNodeToDeleteZ_Y.setRightBinarySearchTreeNode(nodeToDeleteZ.getRightBinarySearchTreeNode());
                successorToNodeToDeleteZ_Y.getRightBinarySearchTreeNode().setParentBinarySearchTreeNode(successorToNodeToDeleteZ_Y);
            }
            transplantBinarySearchTree(nodeToDeleteZ, successorToNodeToDeleteZ_Y);
            successorToNodeToDeleteZ_Y.setLeftBinarySearchTreeNode(nodeToDeleteZ.getLeftBinarySearchTreeNode());
            successorToNodeToDeleteZ_Y.getLeftBinarySearchTreeNode().setParentBinarySearchTreeNode(successorToNodeToDeleteZ_Y);
        }
    }

}

