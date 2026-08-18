package track.Array;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter the values: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i] + " ");
        }

        int max = a[0];
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("maximum value = " + max);
        sc.close();
    }

}
