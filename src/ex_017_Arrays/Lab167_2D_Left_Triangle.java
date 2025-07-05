package ex_017_Arrays;

public class Lab167_2D_Left_Triangle {
    public static void main(String[] args) {

        int n = 3;
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
