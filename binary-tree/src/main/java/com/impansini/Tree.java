package com.impansini;

public class Tree<TYPE extends Comparable<TYPE>> {
    private Node<TYPE> root;

    public Tree() {
        this.root = null;
    }

    public void add(TYPE value) {
        Node<TYPE> node = new Node<>(value);
        if (root == null) {
            this.root = node;
        } else {
            Node<TYPE> current = this.root;
            while (true) {
                if (node.getValue().compareTo(current.getValue()) < 0) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(node);
                        break;
                    }
                } else {
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(node);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
