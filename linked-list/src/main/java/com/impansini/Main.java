package com.impansini;

import java.util.ArrayList;

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

        //comparison between linked list and array list starts below
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        int size = 1000000;
        long start = System.currentTimeMillis();
        long end = 0;

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        end = System.currentTimeMillis();
        System.out.println((end - start) + "ms for ArrayList add");

        start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }

        end = System.currentTimeMillis();
        System.out.println((end - start) + "ms for LinkedList add");

        start = System.currentTimeMillis();

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }

        end = System.currentTimeMillis();
        System.out.println((end - start) + "ms for ArrayList get");

        start = System.currentTimeMillis();
        Iterator<Integer> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        end = System.currentTimeMillis();
        System.out.println((end - start) + "ms for LinkedList Iterator");

    }
}