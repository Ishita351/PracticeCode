package tech.blueglacier;

import java.util.Objects;

public class CustomLinkedList {
    private Node head;

    public CustomLinkedList() {
        this.head = null;
    }

    public void add(int i) {
        if (head == null) {
            head = new Node(i, null);
            return;
        } else {
            Node iterationNode = head;
//            if(iterationNode.getNext()== null ){
//                Node tempNode = new Node(i,null);
//                iterationNode.setNext(tempNode);
//            }
            while (iterationNode.getNext() != null) {
                iterationNode = iterationNode.getNext();
            }
            Node tempNode = new Node(i, null);
            iterationNode.setNext(tempNode);
        }
    }

    public void prePend(int i) {
        Node tempNode = new Node(i, null);
        tempNode.setNext(head);
        head = tempNode;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof CustomLinkedList that)) return false;
//        return Objects.equals(head, that.head);
//    }

    @Override
    public int hashCode() {
        return Objects.hashCode(head);
//        return 0x3423;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node iterationNode = head;
//        stringBuilder.append(iterationNode.getElement());

        while (iterationNode.getNext() != null) {
            stringBuilder.append(iterationNode.getElement());
            iterationNode = iterationNode.getNext();
            stringBuilder.append("->");
        }
        stringBuilder.append(iterationNode.getElement());
        return stringBuilder.toString();
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
