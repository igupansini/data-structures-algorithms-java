package com.impansini;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        int sum = sum(0, 0, array);
        System.out.println("\nSum of array elements: " + sum);
    }

    private static int sum(int sum, int index, int[] array) {
        if (index < array.length) {
            sum += array[index];
            return sum(sum, index + 1, array);
        } else {
            return sum;
        }
    }
}