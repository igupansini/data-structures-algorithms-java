package com.impansini;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Last");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getSize());

        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i).getValue());
        }

        linkedList.remove("First");
        linkedList.remove("Second");
        linkedList.remove("Third");
        linkedList.remove("Last");
        linkedList.add("New First");

        System.out.println(linkedList.getSize());

        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i).getValue());
        }

    }
}