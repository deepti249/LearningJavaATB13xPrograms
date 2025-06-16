package Java_HW_Programs;

import java.util.Scanner;

public class Task_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of triangle: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if(side1 == side2 && side2 == side3){
            System.out.println("Equilateral triangle");
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("Isosceles triangle");
        }
        else{
            System.out.println("Scalene triangle");
        }
        sc.close();
    }
}
