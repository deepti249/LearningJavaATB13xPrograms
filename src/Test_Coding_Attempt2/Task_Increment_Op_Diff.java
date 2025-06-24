package Test_Coding_Attempt2;

public class Task_Increment_Op_Diff {
    public static void main(String[] args) {
        //Pre-Increment
        int a = 10;
        int result = ++a ;
        System.out.println(a);
        System.out.println(result);
        // Line No. |  a | Exp
        //  6|  10 | NA
        //  7 |  11 | 11
        //  8|  11 | NA
        //  9 | NA | 11

        //Post-increment
        int b = 10;
        int result1 = b++; //10
        System.out.println(b); // 10+1 -> 11
        System.out.println(result1); //10
        // Line No. |  b | Exp
        //  16 |  10 | NA
        //  17 |  11 | 10
        //  18 |  11 | NA
        //  19 | NA | 10

        //Pre-decrement
        int c = 10;
        int result2 = --c ;
        System.out.println(c);
        System.out.println(result2);
        // Line No. |  c | Exp
        //  28|  10 | NA
        //  29 |  9 | 9
        //  30|  9 | NA
        //  31 | NA | 9

        //Post-decrement
        int e = 10;
        int result3 = e--;
        System.out.println(e);
        System.out.println(result3);
        // Line No. |  b | Exp
        //  39 |  10 | NA
        //  40|  9 | 10
        //  41 |  9 | NA
        //  42 | NA | 10
    }


}
