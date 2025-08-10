package com.impansini;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("First");
        stringLinkedList.add("Second");
        stringLinkedList.add("Third");
        stringLinkedList.add("Last");

        System.out.println(stringLinkedList.getFirst());
        System.out.println(stringLinkedList.getLast());
        System.out.println(stringLinkedList.getSize());

        for (int i = 0; i < stringLinkedList.getSize(); i++) {
            System.out.println(stringLinkedList.get(i).getValue());
        }

        stringLinkedList.remove("First");
        stringLinkedList.remove("Second");
        stringLinkedList.remove("Third");
        stringLinkedList.remove("Last");
        stringLinkedList.add("New First");

        System.out.println(stringLinkedList.getSize());

        for (int i = 0; i < stringLinkedList.getSize(); i++) {
            System.out.println(stringLinkedList.get(i).getValue());
        }

        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);

        System.out.println(integerLinkedList.getFirst());
        System.out.println(integerLinkedList.getLast());
        System.out.println(integerLinkedList.getSize());

        integerLinkedList.remove(2);

        System.out.println(integerLinkedList.getSize());
    }
}