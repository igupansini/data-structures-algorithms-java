package com.impansini;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");
        System.out.println("First element: " + queue.get());
        queue.dequeue();
        System.out.println("First element after dequeue: " + queue.get());
        queue.dequeue();
        System.out.println("First element after dequeue: " + queue.get());
    }
}