package tech.blueglacier;

import tech.blueglacier.exceptions.EmptyListException;
import tech.blueglacier.exceptions.ListFullException;
import tech.blueglacier.exceptions.ListIndexOutOfRangeException;

import java.util.Objects;

public class CustomLinkedList {
    private Node head;
    private int length;
    private int capacity;

    public CustomLinkedList() {
        this.head = null;
        this.length = 0;
        this.capacity = Integer.MAX_VALUE;
    }

    public CustomLinkedList(int capacity) {
        this.head = null;
        this.length = 0;
        this.capacity = capacity;
    }


    public int search(int element) {
        int searchedElementIndex = -1;
        if (this.getLength() == 0) {
            return searchedElementIndex;
        } else {
            Node iterationNode = this.head;
            int i = 0;
            while (i <= this.getLength() - 1) {
                if (iterationNode.getElement() == element) {
                    searchedElementIndex = i;
                    break;
                }
                iterationNode = iterationNode.getNext();
                i++;
            }
        }
        return searchedElementIndex;
    }

    public int read(int index) {
        int indexToRead = -1;
        Node iterationNode = null;
        if (this.getLength() != 0) {
            iterationNode = this.head;
            if (this.getLength() == 0) {
                return indexToRead;
            } else if (index > this.getLength() - 1 || index < 0) {
                return indexToRead;
            } else {
                int i = 0;
                while (i < index) {
                    iterationNode = iterationNode.getNext();
                    i++;
                }
            }
        }else{
            throw new EmptyListException("empty list");
        }
        return iterationNode.getElement();
    }

    public void add(int i) {
        if (this.getLength() < this.capacity) {
            if (head == null) {
                head = new Node(i, null);
            } else {
                Node iterationNode = head;
                while (iterationNode.getNext() != null) {
                    iterationNode = iterationNode.getNext();
                }
                Node tempNode = new Node(i, null);
                iterationNode.setNext(tempNode);
            }
            this.length++;
        } else {
            throw new ListFullException("list is full");
        }
    }

    public void prePend(int i) {
        if (this.getLength() < this.capacity) {
            Node tempNode = new Node(i, null);
            tempNode.setNext(head);
            head = tempNode;
            this.length++;
        } else {
            throw new ListFullException("list is full");
        }
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(head);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node iterationNode = head;

        while (iterationNode.getNext() != null) {
            stringBuilder.append(iterationNode.getElement());
            iterationNode = iterationNode.getNext();
            stringBuilder.append("->");
        }
        stringBuilder.append(iterationNode.getElement());
        return stringBuilder.toString();
    }

    public boolean insert(int index, int element) {
        boolean insertResult = false;
        Node iterationNode = this.head;
        if (index == 0) {
            this.prePend(element);
            insertResult = true;
        } else if (index >= this.getLength() || index < 0) {
            insertResult = false;
        } else if (this.getLength() < this.capacity) {
            Node nodeToInsert = new Node(element, null);
            int i = 0;
            while (i <= index - 1) {
                iterationNode = iterationNode.getNext();
                i++;
            }
            Node tempNode = iterationNode.getNext();
            iterationNode.setNext(nodeToInsert);
            nodeToInsert.setNext(tempNode);
            insertResult = true;
            this.length++;
        } else {
            throw new ListFullException("list is full");
        }
        return insertResult;
    }

    public int getLength() {
        return this.length;
    }

    public void delete(int index) {
        if (this.getLength() != 0) {
            Node iterationNode = this.head;
            if (index > this.getLength() - 1 || index < 0) {
                throw new ListIndexOutOfRangeException("index out of range");
            } else if (index == 0) {
                if (this.head != null && this.head.getNext() != null) {
                    this.head = this.head.getNext();
                } else {
                    this.head = null;
                }
                this.length--;
            } else {
                int i = 0;
                while (i < index - 1) {
                    iterationNode = iterationNode.getNext();
                    i++;
                }
                Node tempNode = iterationNode.getNext();
                if (tempNode != null) {
                    tempNode = tempNode.getNext();
                }
                iterationNode.setNext(tempNode);
                this.length--;
            }
        } else {
            throw new EmptyListException("list is empty");
        }
    }


    public int removeLast() {
        int elementToRemove = Integer.MIN_VALUE;
        if (this.getLength() != 0) {
            if (this.head != null) {
                elementToRemove = this.head.getElement();
            }
            if (this.head != null && this.head.getNext() != null) {
                this.head = this.head.getNext();
            } else {
                this.head = null;
            }
            this.length--;
        }else{
            throw new EmptyListException("list is empty");
        }
        return elementToRemove;
    }

    public int removeHead() {
        int removedHeadElement;
        if (this.getLength() != 0) {
            if (this.head == null) {
                removedHeadElement = Integer.MIN_VALUE;
                return removedHeadElement;
            } else if (this.head.getNext() == null) {
                removedHeadElement = this.head.getElement();
                this.head = null;
            } else {
                removedHeadElement = this.head.getElement();
                this.head = this.head.getNext();
            }
            this.length--;
        }else{
            throw new EmptyListException("list is empty");
        }
        return removedHeadElement;
    }

    public class Node {
        private Node next;
        private int element;

        public Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getElement() {
            return element;
        }

        public void setElement(int element) {
            this.element = element;
        }

    }
}
