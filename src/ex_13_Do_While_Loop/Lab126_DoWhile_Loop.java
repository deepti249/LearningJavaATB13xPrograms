package ex_13_Do_While_Loop;

public class Lab126_DoWhile_Loop {
    public static void main(String[] args) {

        int a = 1;

        do{
            System.out.println("This is a Body which will be executed at least 1 time");
            System.out.println(a);
            a++;
        } while (a < 10);
    }
}
