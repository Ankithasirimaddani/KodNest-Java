package track.Array;

import java.util.Scanner;

public class pgm2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a[] = new int[5];
        System.out.println("Enter the values");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println("Array Elemnts are:");

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }

}
