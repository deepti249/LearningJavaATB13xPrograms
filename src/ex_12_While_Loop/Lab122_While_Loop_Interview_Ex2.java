package ex_12_While_Loop;

public class Lab122_While_Loop_Interview_Ex2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 0) {  //0 < 0 -> false
            System.out.println(i);
            i++;
        }
        System.out.println("No while loop!");
    }
}
