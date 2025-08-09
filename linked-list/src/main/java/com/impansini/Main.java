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
        System.out.println(linkedList.get(2));
    }
}