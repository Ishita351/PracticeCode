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
                binarySearchTreeNode.setParentBinarySearchTreeNode(iterationNode);
                break;
            } else if (binarySearchTreeNode.getBinarySearchTreeNodeValue() < iterationNode.getBinarySearchTreeNodeValue() && iterationNode.getLeftBinarySearchTreeNode() != null) {
                iterationNode = iterationNode.getLeftBinarySearchTreeNode();
                continue;
            }
            if (iterationNode.getRightBinarySearchTreeNode() == null && iterationNode.getBinarySearchTreeNodeValue() <= binarySearchTreeNode.getBinarySearchTreeNodeValue()) {
                iterationNode.setRightBinarySearchTreeNode(binarySearchTreeNode);
                binarySearchTreeNode.setParentBinarySearchTreeNode(iterationNode);
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

    public BinarySearchTreeNode getBinarySearchTreeMaximum(){
        BinarySearchTreeNode iterationNode = this.getRootNode();
        while(iterationNode.getRightBinarySearchTreeNode() != null){
            iterationNode= iterationNode.getRightBinarySearchTreeNode();
        }
        return iterationNode;
    }

    /*public BinarySearchTreeNode getBinarySearchTreeSuccessor(BinarySearchTreeNode binarySearchTreeNode){
        BinarySearchTreeNode iterationNode = this.getRootNode();
        if(binarySearchTreeNode.getRightBinarySearchTreeNode() != null){
            return getBinarySearchTreeMinimum(binarySearchTreeNode.getRightBinarySearchTreeNode());
        }else{

        }
    }*/
}

