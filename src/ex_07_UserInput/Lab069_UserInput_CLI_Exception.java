package ex_07_UserInput;

public class Lab069_UserInput_CLI_Exception {
    public static void main(String[] args) {
        //If we don't pass argument in Edit configuration then we will get
        // java.lang.ArrayIndexOutOfBoundsException
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[10]);
        // Also, if we don't pass argument for 10th argument in CLI then also we will get
        // java.lang.ArrayIndexOutOfBoundsException
    }
}
