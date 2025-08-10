package com.impansini;

public class LinkedList<TYPE> {
    private Node<TYPE> first;
    private Node<TYPE> last;
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

    public Node<TYPE> getFirst() {
        return first;
    }

    public void setFirst(Node<TYPE> first) {
        this.first = first;
    }

    public Node<TYPE> getLast() {
        return last;
    }

    public void setLast(Node<TYPE> last) {
        this.last = last;
    }

    public void add(TYPE value) {
        Node<TYPE> newNode = new Node<>(value);

        if (this.first == null && this.last == null) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
        this.size++;
    }

    public Node<TYPE> get(int index) {
        Node<TYPE> current = this.first;

        for (int i = 0; i < index; i++) {
            if (current.getNext() != null) {
                current = current.getNext();
            }
        }
        return current;
    }

    public void remove(TYPE value) {
        Node<TYPE> current = this.first;
        Node<TYPE> previous = null;

        for (int i = 0; i < this.getSize(); i++) {
            if (current.getValue().equals(value)) {
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

    public Iterator<TYPE> iterator() {
        return new Iterator<>(this.first);
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
