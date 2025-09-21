package com.impansini;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println(stack.get());
        stack.pop();
        System.out.println(stack.get());
    }
}