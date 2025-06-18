package ex_11_FOR_Loop;

public class Lab110_For_Loop_Outside_Initialize {
    public static void main(String[] args) {
        int i = 10;  //We can initialize outside For Loop also
        for (; i > 0; i--) {  // 10 > 0 -> True it will run from 10 to 1 i.e. 10 times
            System.out.println(i);
        }
    }
}
