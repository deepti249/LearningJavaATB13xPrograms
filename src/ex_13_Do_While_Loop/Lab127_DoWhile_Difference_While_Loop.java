package ex_13_Do_While_Loop;

public class Lab127_DoWhile_Difference_While_Loop {
    public static void main(String[] args) {
        int a = 0;
        while(a < 0){  //0<0 -> false
            System.out.println("Executed while loop!");
            System.out.println(a);
            a++;
       }

        int b = 0;
        do {
            System.out.println("Executed Do while loop!");
            System.out.println(b);
            b++;
        } while (b < 0);


    }
}
