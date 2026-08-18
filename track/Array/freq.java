package track.Array;

import java.util.Scanner;

class Frequency {
    void findFrequency(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("Element " + key + " appears " + count + " times in the array");
    }
}

public class freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to find frequency of: ");
        int key = sc.nextInt();
        Frequency f = new Frequency();
        f.findFrequency(arr, key);
        sc.close();
    }
}
