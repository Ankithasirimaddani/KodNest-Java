package track.M02;

import java.util.Scanner;

class Student1 {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Main1 s = new Main1();
        s.setName(name);
        s.displayName();

        scanner.close();
    }
}
