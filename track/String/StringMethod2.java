package track.String;

public class StringMethod2 {
    public static void main(String[] args) {
        String s1 = "java";
        char ch[] = s1.toCharArray();

        for (int i = 0; i <= ch.length - 1; i++) {
            System.out.println(ch[i]);
        }

        String res = new String(ch);
        System.out.println(res);

    }

}
