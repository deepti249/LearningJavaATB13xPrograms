package ex_11_FOR_Loop;

public class Lab113_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50 ; i++) { // 0 to 49, 50 times
            if( i == 5){ //when 5==5
                break;  //Break will exit the loop when that condition becomes true
            }else{ //it will execute from i = 0 to 4
                System.out.println(i);
            }
        }
    }
}
