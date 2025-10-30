package Arrays;

import java.util.Scanner;

public class SecondLargestInArray  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least 2 elements!");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                // Update both when we find a new largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Update only second largest if num is between
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element found!");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}

