package ex_11_FOR_Loop;

public class Lab114_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times

            if(i ==5){
                continue;
                //skip the code when the condition becomes true and move to next condition in the For Loop
            }
            System.out.println(i);

        }
    }
}
