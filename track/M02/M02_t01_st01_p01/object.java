package track.M02.M02_t01_st01_p01;

public class object {

import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    double javaScore;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Student object
        Student s1 = new Student();

        // Read input details
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.course = scanner.next();
        s1.javaScore = scanner.nextDouble();

        // Display output details
        System.out.println("Student Profile");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javaScore);

        scanner.close();
    }
}

}
