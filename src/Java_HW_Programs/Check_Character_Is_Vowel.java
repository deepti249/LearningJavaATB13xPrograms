package Java_HW_Programs;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Check_Character_Is_Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character!");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a','e','i','o','u' -> System.out.println("It is a Vowel");
            default -> System.out.println("It is a Consonant");
        }
    }

}
