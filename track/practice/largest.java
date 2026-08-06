public class largest {
    public static void main(String[] args) {
        int a = 8, b = 78, c = 52;

        if (a >= b && a >= c) {
            System.out.println(a + "greater than:" + b + " and " + c);
        } else if (b >= a && b >= c) {
            System.out.println(b + "greater than:" + a + " and " + c);
        } else {
            System.out.println(c + "greater than:" + a + " and " + b);
        }
    }
}
