package com.impansini;

public class Queue {
    private LinkedList<String> list;

    public Queue() {
        this.list = new LinkedList<>();
    }

    public void enqueue(String value) {
        this.list.add(value);
    }

    public void dequeue() {
        this.list.remove(get());
    }

    public String get() {
        return this.list.getFirst().getValue();
    }
}
