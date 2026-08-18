package track.Array;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("ENter the values:");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];

        }
        System.out.println("Sum of the values are: " + sum);
        sc.close();
    }

}
