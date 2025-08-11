package com.impansini;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
            //System.out.println(array[i] + " ");
        }

        boolean found = false;
        int counter = 0;
        int start = 0;
        int end = array.length - 1;
        int mid = 0;

        System.out.println("What number do you want to find?");
        Scanner scanner = new Scanner(System.in);
        int numberToFind = scanner.nextInt();

        while (start <= end) {
            mid = (start + end) / 2;
            counter++;
            if (array[mid] == numberToFind) {
                found = true;
                break;
            } else if (array[mid] < numberToFind) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("It took " + counter + " iterations.");

        if (found) {
            System.out.println("Found " + numberToFind + " at index " + mid);
        } else {
            System.out.println("Number not found in the array.");
        }
    }
}