package track.String;

class Demo {
    static int count = 0;

    Demo() {
        count++;
    }
}

public class DemoApp {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        System.out.println(Demo.count);

    }

}
