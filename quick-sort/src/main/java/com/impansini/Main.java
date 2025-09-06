package com.impansini;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    static int partition(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        int pivot = array[mid];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);

            if (i >= j) {
                return j;
            }

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}