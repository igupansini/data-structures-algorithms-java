package com.impansini;

public class Tree<TYPE extends Comparable<TYPE>> {
    private Node<TYPE> root;

    public Tree() {
        this.root = null;
    }

    public Node<TYPE> getRoot() {
        return root;
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

    public void inOrder(Node<TYPE> current) {
        if (current != null) {
            inOrder(current.getLeft());
            System.out.print(current.getValue() + " ");
            inOrder(current.getRight());
        }
    }

    public void preOrder(Node<TYPE> current) {
        if (current != null) {
            System.out.print(current.getValue() + " ");
            preOrder(current.getLeft());
            preOrder(current.getRight());
        }
    }

    public void postOrder(Node<TYPE> current) {
        if (current != null) {
            postOrder(current.getLeft());
            postOrder(current.getRight());
            System.out.print(current.getValue() + " ");
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
