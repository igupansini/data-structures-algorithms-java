package com.impansini;

public class Stack {
    private LinkedList<String> list;

    public Stack() {
        this.list = new LinkedList<>();
    }

    public void push(String value) {
        this.list.addFirst(value);
    }

    public void pop() {
        this.list.remove(get());
    }

    public String get() {
        return this.list.getFirst().getValue();
    }
}
