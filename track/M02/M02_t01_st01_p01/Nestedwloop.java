package track.M02.M02_t01_st01_p01;

public class Nestedwloop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.println(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
