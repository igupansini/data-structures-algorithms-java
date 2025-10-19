package com.impansini;

public class Main {
    static void main() {
        Tree<Integer> tree = new Tree<>();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        System.out.println("In-order:");
        tree.inOrder(tree.getRoot());

        System.out.println("\nPre-order:");
        tree.preOrder(tree.getRoot());

        System.out.println("\nPost-order:");
        tree.postOrder(tree.getRoot());
    }
}
