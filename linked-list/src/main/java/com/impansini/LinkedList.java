package com.impansini;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void add(String value) {
        Node newNode = new Node(value);

        if (this.first == null && this.last == null) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
        this.size++;
    }

    public Node get(int index) {
        Node current = this.first;

        for (int i = 0; i < index; i++) {
            if (current.getNext() != null) {
                current = current.getNext();
            }
        }
        return current;
    }

    public void remove(String value) {
        Node current = this.first;
        Node previous = null;

        for (int i = 0; i < this.getSize(); i++) {
            if (current.getValue().equalsIgnoreCase(value)) {
                if (current == this.first && current == this.last) {
                    this.first = null;
                    this.last = null;
                } else if (current == this.first) {
                    this.first = current.getNext();
                    current.setNext(null);
                } else if (current == this.last) {
                    this.last = previous;
                    previous.setNext(null);
                } else {
                    previous.setNext(current.getNext());
                }
                this.size--;
                break;
            }
            previous = current;
            current = current.getNext();
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }
}
