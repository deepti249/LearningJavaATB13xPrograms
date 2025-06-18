package ex_12_While_Loop;

public class Lab119_While_Loop_Condition_Check {
    public static void main(String[] args) {
        int i = 0;
        while (i > 0) { // 0>0 -> false
            System.out.println("Enter");
            System.out.println(i);
            i++;
        }
        System.out.println("No while loop!");
    }
}
