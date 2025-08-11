package com.impansini;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        System.out.println("\nSorted array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}