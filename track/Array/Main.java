package track.Array;

import java.util.Scanner;

class ArraySearch {
    void search(int ref[], int key) {
        boolean found = false;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array length:");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter the element to search:");
        int key = scan.nextInt();

        ArraySearch as = new ArraySearch();
        as.search(arr, key);

        scan.close();
    }
}

