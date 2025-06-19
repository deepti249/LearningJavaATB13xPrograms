package Test_Coding1;

public class Task_Increment_Op_Diff {
    public static void main(String[] args) {
        //Pre-increment
        int a = 10;
        int result = ++a; // 10 + 1 -> 11
        System.out.println(a); //11
        System.out.println(result); //11
        // Line No. |  a | Exp
        //  5 |  10 | NA
        //  6 |  11 | 11
        //  7 |  11 | NA
        //  8 | NA | 11
        //Post increment
        int b = 10;
        int result1 = b++; //10
        System.out.println(b); // 10+1 -> 11
        System.out.println(result1); //10

        // Line No. |  b | Exp
        //  16 |  10 | NA
        //  17 |  11 | 10
        //  18 |  11 | NA
        //  19 | NA | 10
    }

}

/*3. Create a program to show the difference between ++i and i++.

4. Create a program to show the difference between ++i and i++.
*/