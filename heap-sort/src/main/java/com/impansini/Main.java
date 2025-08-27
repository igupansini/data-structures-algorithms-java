package com.impansini;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        int size = array.length;

        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(array, size, i);
        }

        for (int j = size - 1; j >= 0; j--) {
            int temp = array[0];
            array[0] = array[j];
            array[j] = temp;

            heapify(array, j, 0);
        }

        System.out.println("\nSorted array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void heapify(int[] array, int size, int i) {
        int root = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && array[left] > array[root]) {
            root = left;
        }
        if (right < size && array[right] > array[root]) {
            root = right;
        }
        if (root != i) {
            int swap = array[i];
            array[i] = array[root];
            array[root] = swap;
            
            heapify(array, size, root);
        }
    }
}