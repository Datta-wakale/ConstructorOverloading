package com.arrays_operations;

import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

       
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.println("\nEnter your choice:");
        System.out.println("1. Ascending Order");
        System.out.println("2. Descending Order");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("\nSorted in Ascending Order: " + Arrays.toString(arr));
                break;

            case 2:
                
                for (int i = 0; i < n - 1; i++) 
                {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] < arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("\nSorted in Descending Order: " + Arrays.toString(arr));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
