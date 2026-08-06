package track.M02.M02_t01_st01_p01;

public class Nesteddwloop {
    public static void main(String[] args) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.println(j);
                j++;
            } while (j <= 5);
            System.out.println();
            i++;
        } while (i <= 5);

    }

}
