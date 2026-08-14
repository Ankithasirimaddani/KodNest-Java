package track.M02.M02_t01_st01_p01;

class StudentApplication {
    String name;
    int age;
    double height;

    StudentApplication(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}

public class Constructor {

    public static void main(String[] args) {
        StudentApplication s1 = new StudentApplication("Rani", 23, 5.5);
        s1.display();

    }

}
