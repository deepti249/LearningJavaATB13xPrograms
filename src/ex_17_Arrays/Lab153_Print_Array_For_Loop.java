package ex_17_Arrays;

import java.util.Arrays;

public class Lab153_Print_Array_For_Loop {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println("  - - - - - -");

        for(int i = 0; i < marks.length ; i++){
            System.out.println(marks[i]); //prints elements in input format
        }

      //  System.out.println(marks[i]); -> It gives reference address

        Arrays.sort(marks); //sorts the array elements in ascending order
        for(int i = 0; i < marks.length ; i++){
            System.out.println(marks[i]); //prints elements in ascending order
        }

    }
}
