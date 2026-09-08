package track.String;

public class comparision {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "Java";

        if (s1 == s2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

}
