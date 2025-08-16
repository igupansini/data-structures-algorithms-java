package com.impansini;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[25];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        int gap = 1;
        int size = array.length;

        while (gap < size) {
            gap = gap * 3 + 1;
        }
        gap = (int) (Math.floor(gap / 3));

        int temp, j;

        while (gap > 0) {
            for (int i = gap; i < size; i++) {
                temp = array[i];
                j = i;
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
            gap = gap / 2;
        }

        System.out.println("\nSorted array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}