package ex_13_Do_While_Loop;

public class Lab128_DoWhile_Real_Case {
    public static void main(String[] args) {
        // Web Automation
        int number = 0;
        // 0 -> it can be 0 to 10 - elements or students

        do{
            System.out.println(number);
            // callFunction(number);
            // close the excel file, open the file.
            //We will write that code which will always be executed at least once even if the
            // condition fails like garbage collection, close the application,etc
            number++;
        }while (number<0);
    }
}
