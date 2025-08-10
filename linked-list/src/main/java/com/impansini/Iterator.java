package com.impansini;

public class Iterator<TYPE> {
    private Node<TYPE> current;

    public Iterator(Node<TYPE> first) {
        this.current = first;
    }

    public boolean hasNext() {
        if (current.getNext() == null) {
            return false;
        } else {
            return true;
        }
    }

    public Node<TYPE> next() {
        current = current.getNext();
        return current;
    }
}
