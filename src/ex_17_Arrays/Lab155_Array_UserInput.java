package ex_17_Arrays;

import java.util.Scanner;

public class Lab155_Array_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();

        int[] marks = new int[size];

        for (int i = 0; i < marks.length; i++) {

            System.out.println("Enter the elements of the array!");
            marks[i] = scanner.nextInt();
        }

        System.out.println("Elements in the array are as follows : ");

            for (int j = 0; j < marks.length; j++) {
                System.out.println(marks[j]);
            }
    }
}
